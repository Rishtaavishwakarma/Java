// Create a class Employee with the following properties and methods:
// Salary (property) (int)
// getSalary (method returning int)
// name (property) (String)
// getName (method returning String)
// setName (method changing name)

class Employee {

    int Salary;
    String Name;

    public String getName() {
        return Name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setName(String n) {
        Name = n;
    }
}

// Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
class Cellphone {

    public void ring() {
        System.out.println("Ring...");
    }

    public void vibrate() {
        System.out.println("VIbrate...");
    }

    public void callFriend() {
        System.out.println("calling...");
    }
}

// Create a class Square with a method to initialize its side, calculating area, perimeter etc./
class Square {

    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

class cwh_04_oop {

    public static void main(String[] args) {
        // problem 1
        Employee em = new Employee();
        em.setName("Rishta");
        em.Salary = 50000;
        System.out.println(em.getName());
        System.out.println(em.getSalary());

        //problem2
        Cellphone cp = new Cellphone();
        cp.ring();
        cp.callFriend();
        cp.vibrate();

        //problem 3
        Square sq = new Square();
        sq.side = 4;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}
