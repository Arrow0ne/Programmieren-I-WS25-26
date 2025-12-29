package Lektion11.TextDokument;

public class TextDokumentTest {

    public static void main(String[] args) {

        char[][] start = {
                "Hallo Welt".toCharArray(),
                "FHWS".toCharArray()
        };

        Textdokument doc = new Textdokument(start);

        doc.drucke();
        System.out.println(doc.zaehleZeichen());

        doc.vertauscheZeilen(0, 1);
        doc.drucke();

        char[][] neu = {"NEU".toCharArray()};

        doc.fuegeEinTextdokument(neu, 1);
        doc.drucke();
    }
}
