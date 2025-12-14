package Lektion_10.Weltuhr;

public class Uhr {
    private int std;
    private int min;
    private int sek;

        public Uhr(int std, int min, int sek) {
            if (std < 0 || std > 23 || min < 0 || min > 59 || sek < 0 || sek > 59) {
                this.std = 12;
                this.min = 0;
                this.sek = 0;
            } else {
                this.std = std;
                this.min = min;
                this.sek = sek;
            }
        }

    int getStd(){
        return std;
    }
    int getMin(){
        return min;
    }
    int getSek(){
        return sek;
    }

    public void setUhr(int std, int min, int sek) {
        if (std < 0 || std > 23 || min < 0 || min > 59 || sek < 0 || sek > 59) {
            System.out.println("Fehler: Ungültige Uhrzeit!");
        } else {
            this.std = std;
            this.min = min;
            this.sek = sek;
        }
    }

    public void naechsteSek(){
        ++sek;
        if(sek == 60){
            sek = 0;
            ++min;
            if(min == 60){
                min = 0;
                ++std;
                if (std == 24){
                    std = 0;
                }
            }
        }
    }
}
