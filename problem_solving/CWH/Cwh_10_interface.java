
interface Hello {

    int hh();

    int danc();

    int dane();

    default int wow() {
        return 100;
    }
}

// Interface extending another interface
interface Hell extends Hello {

    int dancerf();

    int danescasf();
}

// Concrete class implementing Hello
class ConcreteHell implements Hello {

    @Override
    public int hh() {
        return 1;
    }

    @Override
    public int danc() {
        return 2;
    }

    @Override
    public int dane() {
        return 3;
    }
}

public class Cwh_10_interface {

    public static void main(String[] args) {
        Hello obj = new ConcreteHell();

        System.out.println("hh(): " + obj.hh());       // 1
        System.out.println("danc(): " + obj.danc());   // 2
        System.out.println("dane(): " + obj.dane());   // 3
        System.out.println("wow(): " + obj.wow());     // 100 (default method)
    }
}
