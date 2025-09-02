package com.esdoor.pdfutils;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;

import java.io.IOException;

public class PageNumbering {
    public static void apply(PDDocument doc) throws IOException {
        PDFont font = FontLoader.loadDejaVu(doc);
        int n = doc.getNumberOfPages();
        for (int i = 0; i < n; i++) {
            PDPage page = doc.getPage(i);
            try (PDPageContentStream c = new PDPageContentStream(doc, page, PDPageContentStream.AppendMode.APPEND, true)) {
                c.setFont(font, 9);
                c.beginText(); c.newLineAtOffset(520, 20); c.showText((i + 1) + "/" + n); c.endText();
            }
        }
    }
}