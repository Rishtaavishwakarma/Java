
class phone {

    public void call() {
        System.out.println("Calling .....");
    }

}

interface calculator {

    public int add(int a, int b);
}

interface camera {

    public void click();

}

class Smartphone extends phone implements calculator, camera {

    public int add(int a, int b) {
        return a + b;
    }

    public void click() {
        System.out.println("Hello smile please");
    }

    public void on() {
        System.out.println("Turning on ......");
    }

}

public class cwh_11_poly {

    public static void main(String[] args) {
        calculator cal = new Smartphone();
        System.out.println(cal.add(4, 5));

        // cal.click();//not allow
        // cal.call();
        Smartphone smart = new Smartphone();
        smart.call();

    }

}
