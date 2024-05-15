/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebaword;

import org.apache.poi.xwpf.usermodel.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Felipe
 */
public class Modificar {
    public void rar(Map<String, String> replacements){
        String inputFilePath = "C:\\Users\\Felipe\\Documents\\NetBeansProjects\\PruebaWord/word.docx";
        String outputFilePath = "C:\\Users\\Felipe\\Documents\\NetBeansProjects\\PruebaWord/output.docx";
try (FileInputStream fis = new FileInputStream(inputFilePath);
             XWPFDocument document = new XWPFDocument(fis)) {

            // Recorre todos los párrafos del documento
            for (XWPFParagraph paragraph : document.getParagraphs()) {
                replaceTextInParagraph(paragraph, replacements);
            }

            // Recorre todas las tablas del documento
            for (XWPFTable table : document.getTables()) {
                for (XWPFTableRow row : table.getRows()) {
                    for (XWPFTableCell cell : row.getTableCells()) {
                        for (XWPFParagraph paragraph : cell.getParagraphs()) {
                            replaceTextInParagraph(paragraph, replacements);
                        }
                    }
                }
            }

            // Escribe los cambios en un nuevo archivo
            try (FileOutputStream fos = new FileOutputStream(outputFilePath)) {
                document.write(fos);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void replaceTextInParagraph(XWPFParagraph paragraph, Map<String, String> replacements) {
        // Concatenar todos los textos de los XWPFRun en un solo StringBuilder
        StringBuilder paragraphText = new StringBuilder();
        for (XWPFRun run : paragraph.getRuns()) {
            paragraphText.append(run.getText(0));
        }

        // Realizar los reemplazos en el texto concatenado
        String replacedText = paragraphText.toString();
        for (Map.Entry<String, String> entry : replacements.entrySet()) {
            replacedText = replacedText.replace(entry.getKey(), entry.getValue());
        }

        // Limpiar todos los XWPFRun en el párrafo
        for (int i = paragraph.getRuns().size() - 1; i >= 0; i--) {
            paragraph.removeRun(i);
        }

        // Crear nuevos XWPFRun con el texto reemplazado, manejando saltos de línea
        String[] lines = replacedText.split("\n");
        for (int i = 0; i < lines.length; i++) {
            XWPFRun newRun = paragraph.createRun();
            newRun.setText(lines[i]);
            if (i < lines.length - 1) {
                newRun.addBreak();
            }
        }
    }
}
