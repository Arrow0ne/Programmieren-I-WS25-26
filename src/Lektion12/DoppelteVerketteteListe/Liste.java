package Lektion12.DoppelteVerketteteListe;

public class Liste {
    private Personenknoten start;

    public Liste() {
        start = null;
    }

    public Personenknoten getStart() {
        return start;
    }

    //a//
    public void sortiertEinfuegen(Personenknoten neu) {
        if (start == null) {
            start = neu;
            return;
        }

        Personenknoten temp = start;
        while (temp != null && temp.getAlter() < neu.getAlter()) {
            temp = temp.getNextPersonenknoten();
        }
        if (temp == start) {
            neu.setNextPersonenknoten(start);
            start.setPrevPersonenknoten(neu);
            start = neu;
            return;
        }
        if (temp == null) {
            Personenknoten last = start;
            while (last.getNextPersonenknoten() != null) {
                last = last.getNextPersonenknoten();
            }
            last.setNextPersonenknoten(neu);
            neu.setPrevPersonenknoten(last);
            return;
        }
        Personenknoten prev = temp.getPrevPersonenknoten();

        prev.setNextPersonenknoten(neu);
        neu.setPrevPersonenknoten(prev);

        neu.setNextPersonenknoten(temp);
        temp.setPrevPersonenknoten(neu);
    }

    //b//
    public Personenknoten sucheNachNachnamen(String naName) {
        Personenknoten temp = start;
        while (temp != null) {
            if (temp.getNachname().equals(naName)) {
                return temp;
            }
            temp = temp.getNextPersonenknoten();
        }
        return null;
    }

    //c//
    /*ist in PerosonenknotenTest.java*/

    public void ausgebenVorwaerts() {
        Personenknoten temp = start;

        while (temp != null) {
            System.out.println(temp.getNachname() + ", " + temp.getAlter());
            temp = temp.getNextPersonenknoten();
        }
        System.out.println();
    }

    public void ausgebenRueckwaerts() {
        if (start == null)
            return;

        Personenknoten temp = start;

        while (temp.getNextPersonenknoten() != null) {
            temp = temp.getNextPersonenknoten();
        }
        while (temp != null) {
            System.out.println(temp.getNachname() + ", " + temp.getAlter());
            temp = temp.getPrevPersonenknoten();
        }
        System.out.println();
    }
}

