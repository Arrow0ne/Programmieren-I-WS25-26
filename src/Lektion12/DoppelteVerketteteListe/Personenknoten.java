package Lektion12.DoppelteVerketteteListe;

public class Personenknoten {
    private final int alter;
    private final String nachname;
    private Personenknoten nextPersonenknoten, prevPersonenknoten;

    public Personenknoten(int alter, String nachname) {
        this.alter = alter;
        this.nachname = nachname;
        this.nextPersonenknoten = null;
        this.prevPersonenknoten = null;
    }

    public void setNextPersonenknoten(Personenknoten nextPersonenknoten) {
        this.nextPersonenknoten = nextPersonenknoten;
    }

    public void setPrevPersonenknoten(Personenknoten prevPersonenknoten) {
        this.prevPersonenknoten = prevPersonenknoten;
    }

    public Personenknoten getNextPersonenknoten() {
        return nextPersonenknoten;
    }

    public Personenknoten getPrevPersonenknoten() {
        return this.prevPersonenknoten;
    }

    public int getAlter() {
        return alter;
    }

    public String getNachname() {
        return nachname;
    }
}
