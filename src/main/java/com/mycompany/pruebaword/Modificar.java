package com.mycompany.pruebaword;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

public class Modificar {

    public void replaceText(Map<String, String> replacements) {
        String inputFilePath = "C:\\Users\\Felipe\\Documents\\NetBeansProjects\\PruebaWord\\word.docx";
        String outputFilePath = "C:\\Users\\Felipe\\Documents\\NetBeansProjects\\PruebaWord\\output.docx";
        try (FileInputStream fis = new FileInputStream(inputFilePath);
             XWPFDocument document = new XWPFDocument(fis)) {

            // Process paragraphs
            for (XWPFParagraph paragraph : document.getParagraphs()) {
                replaceTextInParagraph(paragraph, replacements);
            }

            // Process tables (including nested tables)
            for (XWPFTable table : document.getTables()) {
                replaceTextInTable(table, replacements);
            }

            // Write changes to a new file
            try (FileOutputStream fos = new FileOutputStream(outputFilePath)) {
                document.write(fos);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void replaceTextInParagraph(XWPFParagraph paragraph, Map<String, String> replacements) {
        List<XWPFRun> runs = paragraph.getRuns();
        if (runs.isEmpty()) {
            return;
        }

        StringBuilder paragraphText = new StringBuilder();
        for (XWPFRun run : runs) {
            paragraphText.append(run.getText(0));
        }

        String replacedText = paragraphText.toString();
        for (Map.Entry<String, String> entry : replacements.entrySet()) {
            replacedText = replacedText.replace(entry.getKey(), entry.getValue());
        }

        // Clear all current runs
        for (int i = runs.size() - 1; i >= 0; i--) {
            paragraph.removeRun(i);
        }

        // Create new runs with replaced text and maintain formatting
        String[] lines = replacedText.split("\n");
        for (int i = 0; i < lines.length; i++) {
            XWPFRun newRun = paragraph.createRun();
            newRun.setText(lines[i]);
            copyFormatting(newRun, runs.get(i)); // Copy formatting from the first original run
            System.out.println(runs.get(i));
            if (i < lines.length - 1) {
                newRun.addBreak();
            }
        }
    }

    private static void copyFormatting(XWPFRun newRun, XWPFRun oldRun) {
        newRun.setFontFamily("Gill Sans MT");
        newRun.setFontSize(9);
        newRun.setBold(oldRun.isBold());
        newRun.setItalic(oldRun.isItalic());
        newRun.setUnderline(oldRun.getUnderline());
        // Add more formatting attributes if needed
    }

    private static void replaceTextInTable(XWPFTable table, Map<String, String> replacements) {
        for (XWPFTableRow row : table.getRows()) {
            for (XWPFTableCell cell : row.getTableCells()) {
                for (XWPFParagraph paragraph : cell.getParagraphs()) {
                    replaceTextInParagraph(paragraph, replacements);
                }
                for (XWPFTable innerTable : cell.getTables()) {
                    replaceTextInTable(innerTable, replacements);
                }
            }
        }
    }
}