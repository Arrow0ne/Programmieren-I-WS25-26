package Lektion4;

public class Countdown {
    public static void main(String[] args) throws InterruptedException {
    for(int i = 0; i <= 15 ; i++){
        System.out.println("Es sind " + i + " Sekunden vergangen.");
        Thread.sleep(1000);
        }
    }
}
