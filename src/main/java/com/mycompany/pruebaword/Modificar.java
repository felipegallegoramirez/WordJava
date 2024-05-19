package com.mycompany.pruebaword;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
                replaceTextInParagraph(paragraph, replacements, false);
            }

            // Process tables (including nested tables)
            for (XWPFTable table : document.getTables()) {
                replaceTextInTable(table, replacements, false);
            }

            // Write changes to a new file
            try (FileOutputStream fos = new FileOutputStream(outputFilePath)) {
                document.write(fos);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void replaceTextInParagraph(XWPFParagraph paragraph, Map<String, String> replacements, boolean isInNestedTable) {
        List<XWPFRun> runs = paragraph.getRuns();
        if (runs.isEmpty()) {
            return;
        }

        // Join all the text from the runs into a single string
        StringBuilder paragraphText = new StringBuilder();
        for (XWPFRun run : runs) {
            if (run.getText(0) != null) {
                paragraphText.append(run.getText(0));
            }
        }

        String originalText = paragraphText.toString();
        String replacedText = originalText;
        boolean textReplaced = false;

        // Perform the replacements
        for (Map.Entry<String, String> entry : replacements.entrySet()) {
            if (replacedText.contains(entry.getKey())) {
                replacedText = replacedText.replace(entry.getKey(), entry.getValue());
                textReplaced = true;
            }
        }

        // Remove all original runs
        for (int i = runs.size() - 1; i >= 0; i--) {
            paragraph.removeRun(i);
        }

        // Create new runs with the replaced text
        String[] lines = replacedText.split("\n");
        for (int i = 0; i < lines.length; i++) {
            XWPFRun newRun = paragraph.createRun();
            newRun.setText(lines[i]);

            // Apply specific styles for special cases
            if (replacedText.contains("NÚCLEO TEMÁTICO")) {
                newRun.setBold(true);
                newRun.setFontFamily("Gill Sans MT");
                newRun.setFontSize(8);
            } else if (textReplaced && isInNestedTable) {
                newRun.setItalic(true);
                newRun.setFontFamily("Gill Sans MT");
                newRun.setFontSize(9);
            } else if (textReplaced) {
                applyReplacementStyle(newRun);
            } else {
                applyNormalStyle(newRun);
            }

            if (i < lines.length - 1) {
                newRun.addBreak();
            }
        }
    }

    private static void applyReplacementStyle(XWPFRun run) {
        run.setFontFamily("Gill Sans MT");
        run.setFontSize(9);
        run.setBold(false); // Example: bold for replaced text
    }

    private static void applyNormalStyle(XWPFRun run) {
        run.setFontFamily("Gill Sans MT");
        run.setFontSize(8);
        run.setBold(true); // Example: not bold for normal text
    }

    private static void replaceTextInTable(XWPFTable table, Map<String, String> replacements, boolean isNested) {
        for (XWPFTableRow row : table.getRows()) {
            for (XWPFTableCell cell : row.getTableCells()) {
                for (XWPFParagraph paragraph : cell.getParagraphs()) {
                    replaceTextInParagraph(paragraph, replacements, isNested);
                }
                for (XWPFTable innerTable : cell.getTables()) {
                    replaceTextInTable(innerTable, replacements, true);
                }
            }
        }
    }
}
