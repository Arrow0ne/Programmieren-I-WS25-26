package Lektion_10.RaumbelegungII;

public class Raum {
    private String Raum;
    private int maxAnzahl;
    private boolean belegt;

    Student[] students;

    public Raum(String Raum, int maxAnzahl, boolean belegt) {
        this.Raum = Raum;
        this.maxAnzahl = maxAnzahl;
        this.belegt = belegt;
        this.students = new Student[maxAnzahl];
    }

    public void betreteRaum(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                System.out.println("Der Student: " + students[i].name + " hat den Raum betreten.");
                break;
            }
        }
    }

    public void verlasseRaum(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].matrikelnummer == student.matrikelnummer) {
                System.out.println("Der Student: " + students[i].name + " hat den Raum verlassen.");
                students[i] = null;
                break;
            }
        }
    }

    public void clearRaum() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                students[i] = null;
            }
        }
        System.out.println();
        System.out.println("Der Raum wird/wurde geleert.");
    }

    public void belege() {
        this.belegt = true;
    }

    public void gebeFrei() {
        this.belegt = false;
    }

    public void druckeStatus() {
        if (!belegt) {
            System.out.println("Der Raum " + Raum +
                    " ist nicht belegt (VL oder sonstiges) und kann maximal " +
                    maxAnzahl + " Studenten haben.");
        } else {
            System.out.println("Der Raum " + Raum + " ist belegt.");
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println(i + ": ");
            if (this.students[i] == null) {
                System.out.println("\t-");
            } else {
                System.out.println(students[i].name);
            }
        }
    }
}
