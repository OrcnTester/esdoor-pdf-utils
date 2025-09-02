package com.esdoor.pdfutils;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.PDFont;

import java.io.InputStream;

public class FontLoader {
    /** DejaVuSans.ttf varsa Unicode/TR karakterler tam görünür; yoksa Helvetica'ya düşer. */
    public static PDFont loadDejaVu(PDDocument doc) {
        try {
            InputStream in = FontLoader.class.getResourceAsStream("/fonts/DejaVuSans.ttf");
            if (in != null) return PDType0Font.load(doc, in);
        } catch (Exception ignored) {}
        return PDType1Font.HELVETICA;
    }
}