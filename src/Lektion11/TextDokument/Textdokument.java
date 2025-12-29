package Lektion11.TextDokument;

public class Textdokument {

    private char[][] text;

    public Textdokument(char[][] text) {
        this.text = text;
    }

    public int zaehleZeichen() {
        int anzahl = 0;
        for (int i = 0; i < text.length; i++) {
            for (int z = 0; z < text[i].length; z++) {
                if (text[i][z] != ' ') {
                    anzahl++;
                }
            }
        }
        return anzahl;
    }

    public boolean vertauscheZeilen(int z1, int z2) {
        if (z1 < 0 || z2 < 0 || z1 >= text.length || z2 >= text.length) {
            return false;
        }
        char[] tmp = text[z1];
        text[z1] = text[z2];
        text[z2] = tmp;
        return true;
    }

    public void fuegeEinTextdokument(char[][] neu, int pos) {
        if (pos < 0 || pos > text.length) {
            throw new RuntimeException("Ungültige Zeilenposition");
        }

        char[][] neuText = new char[text.length + neu.length][];

        for (int i = 0; i < pos; i++) neuText[i] = text[i];
        for (int i = 0; i < neu.length; i++) neuText[pos + i] = neu[i];
        for (int i = pos; i < text.length; i++) neuText[i + neu.length] = text[i];

        text = neuText;
    }

    public void drucke() {
        for (char[] zeile : text) {
            System.out.println(new String(zeile));
        }
        System.out.println("-----");
    }
}
