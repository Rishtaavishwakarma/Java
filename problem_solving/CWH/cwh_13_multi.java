
class Multi implements Runnable {

    public void run() {
        int a = 3;
        int b = 5;
        System.out.println("thread is running..runnable." + a + b);
    }

    public void dance() {
        System.out.println("thread is runningdance...");
    }
}

class Multi1 extends Thread {

    public void run() {

        System.out.println("threasgvjrjvapoerd is running..runnable.");
    }

}

public class cwh_13_multi {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Multi());
        Multi1 t2 = new Multi1();
        t1.start();
        t2.start();
    }
}
