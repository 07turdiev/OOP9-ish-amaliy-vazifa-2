public class Main {
    public static void main(String[] args) {
        MyTime vaqt = new MyTime(23, 59, 59);
        System.out.println("Hozirgi vaqt: " + vaqt.toString());
        vaqt.nextSikund();
        System.out.println("Kayingi Sikund: " + vaqt.toString());
        vaqt.nextMinut();
        System.out.println("Keyingi minut: " + vaqt.toString());
        vaqt.nextSoat();
        System.out.println("Keyingi soat: " + vaqt.toString());
        vaqt.previousSikunt();
        System.out.println("Oldingi sikund: " + vaqt.toString());
        vaqt.previousMinut();
        System.out.println("Oldingi Minut: " + vaqt.toString());
        vaqt.previousSoat();
        System.out.println("Oldingi Soat: " + vaqt.toString());
    }
}