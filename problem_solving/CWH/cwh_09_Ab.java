// Abstract class

abstract class Hello {

    // Concrete method
    public void greet() {
        System.out.println("Hello from abstract class!");
    }

    // Abstract method (must be overridden)
    public abstract void sayName();
}

// Subclass (must implement abstract methods)
public class cwh_09_Ab extends Hello {

    // Implementation of abstract method
    @Override
    public void sayName() {
        System.out.println("My name is Cwh_09_Ab");
    }

    // Main method to run the program
    public static void main(String[] args) {
        Hello obj = new cwh_09_Ab();
        obj.greet();      // Calls concrete method from abstract class
        obj.sayName();    // Calls overridden method
    }
}
