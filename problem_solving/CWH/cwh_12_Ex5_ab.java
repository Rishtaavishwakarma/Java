// Abstract Class Pen

abstract class Pen {

    abstract void write();

    abstract void refill();
}

// Concrete Class FountainPen
class FountainPen extends Pen {

    @Override
    void write() {
        System.out.println("Writing with a fountain pen...");
    }

    @Override
    void refill() {
        System.out.println("Refilling the fountain pen...");
    }

    public void changeNib() {
        System.out.println("Changing the nib of the fountain pen...");
    }
}

// Monkey Class
class Monkey {

    public void jump() {
        System.out.println("Monkey is jumping...");
    }

    public void bite() {
        System.out.println("Monkey is biting...");
    }
}

// BasicAnimal Interface
interface BasicAnimal {

    void eat();

    void sleep();
}

// Human Class (extends Monkey and implements BasicAnimal)
class Human extends Monkey implements BasicAnimal {

    public void eat() {
        System.out.println("Human is eating...");
    }

    public void sleep() {
        System.out.println("Human is sleeping...");
    }

    public void enjoy() {
        System.out.println("Human is enjoying...");
    }
}

// Abstract Telephone
abstract class Telephone {

    abstract void ring();

    abstract void lift();

    abstract void disconnect();
}

// SmartTelephone Class
class SmartTelephone extends Telephone {

    @Override
    void ring() {
        System.out.println("SmartTelephone is ringing...");
    }

    @Override
    void lift() {
        System.out.println("Call lifted on SmartTelephone...");
    }

    @Override
    void disconnect() {
        System.out.println("Call disconnected on SmartTelephone...");
    }

    public void browseInternet() {
        System.out.println("Browsing internet on SmartTelephone...");
    }
}

// TV Remote Interface
interface TVRemote {

    void powerOn();

    void powerOff();
}

// Smart TV Remote Interface (Extends TVRemote)
interface SmartTVRemote extends TVRemote {

    void openYouTube();

    void voiceControl();
}

// TV Class implementing TVRemote
class TV implements TVRemote {

    public void powerOn() {
        System.out.println("TV is powered on.");
    }

    public void powerOff() {
        System.out.println("TV is powered off.");
    }
}

public class cwh_12_Ex5_ab {

    public static void main(String[] args) {
        // Fountain Pen Demo
        FountainPen fp = new FountainPen();
        fp.write();
        fp.refill();
        fp.changeNib();

        // Human Class Demo
        Human h = new Human();
        h.jump();    // From Monkey
        h.bite();    // From Monkey
        h.eat();     // From BasicAnimal
        h.sleep();   // From BasicAnimal
        h.enjoy();   // Own method

        // Monkey Reference Polymorphism
        Monkey m = new Human(); // Polymorphism
        m.jump();
        m.bite();
        // m.eat(); // Not allowed

        // SmartTelephone Polymorphism
        Telephone t = new SmartTelephone();
        t.ring();
        t.lift();
        t.disconnect();
        // t.browseInternet(); // Not allowed

        // TV and TVRemote
        TV tv = new TV();
        tv.powerOn();
        tv.powerOff();
    }
}
