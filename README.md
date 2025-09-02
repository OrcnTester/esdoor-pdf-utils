# Esdoor – PDF Utils
Reusable helpers for Apache PDFBox: Unicode/TR font loader, header/footer, and page numbering.

## Modules
- `FontLoader` – loads `DejaVuSans.ttf` with fallback
- `HeaderFooter` – simple header/footer writers
- `PageNumbering` – adds x/y page numbers

## Usage (snippet)
```java
PDDocument doc = new PDDocument();
PDPage page = new PDPage(); doc.addPage(page);
HeaderFooter.drawHeader(doc, page, "ESDOOR");
HeaderFooter.drawFooter(doc, page, "IBAN: TR...");
PageNumbering.apply(doc);
doc.save("sample.pdf"); doc.close();
