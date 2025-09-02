package com.esdoor.pdfutils;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;

import java.io.IOException;

public class HeaderFooter {
    public static void drawHeader(PDDocument doc, PDPage page, String title) throws IOException {
        PDFont font = FontLoader.loadDejaVu(doc);
        try (PDPageContentStream c = new PDPageContentStream(doc, page, PDPageContentStream.AppendMode.APPEND, true)) {
            c.setFont(font, 14);
            c.beginText(); c.newLineAtOffset(50, 800); c.showText(title); c.endText();
        }
    }
    public static void drawFooter(PDDocument doc, PDPage page, String text) throws IOException {
        PDFont font = FontLoader.loadDejaVu(doc);
        try (PDPageContentStream c = new PDPageContentStream(doc, page, PDPageContentStream.AppendMode.APPEND, true)) {
            c.setFont(font, 9);
            c.beginText(); c.newLineAtOffset(50, 40); c.showText(text); c.endText();
        }
    }
}