package Latihan3;

public class Gajah extends Hewan {

    public static void testClassMethod() {
        System.out.println("The Class Method in Hewan...");
    }
//meng-override method pada class animal

    public void testInstanceMethod() {
        System.out.println("Test Intance Method in Gajah..");
    }

    public static void main(String[] args) {
        Gajah myGajah = new Gajah();
        Hewan myHewan = myGajah;
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();
    }
}
