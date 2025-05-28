package rishta;

class C1 {

    public int x = 5;
    private int z = 6;          // Only accessible inside C1
    protected int y = 45;
    int a = 10;                 // default/package-private

    public void meth1() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z); // Accessible here
        System.out.println(a);
    }
}

public class Rishta {

    public void dance() {
        System.out.println("Dance baby!");
        C1 c = new C1();
        c.meth1(); // Accessing method inside same package
    }
}
