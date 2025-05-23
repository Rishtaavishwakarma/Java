
public class datatypes {

    //instance variable 
    int num = 1234;
    //Class/Static Variables
    public static String friend;
//local variables

    public void Dt() {
        // Corrected data types and values
        //int a =7983759724;
        int a = 123456; // 'int' can't store such a large number, so use 'long' with 'L' suffix
        long b = 784951641654L; // 'long' with 'L' suffix
        short c = 4785;
        byte d = 3;
        char e = 'A'; // char should be enclosed in single quotes
        boolean bool = true; // boolean must be true or false, not 1 or 0
        int[] f = {1, 2, 3, 5, 4}; // proper array declaration
        float g = 2.3f; // float values must end with 'f'
        double h = 23.45;
        String name = "Rishta";
        friend = "Mansi"; //Class/Static Variables

        // Printing values (optional)
        System.out.println("int = " + a);
        System.out.println("long = " + b);
        System.out.println("short = " + c);
        System.out.println("byte = " + d);
        System.out.println("char = " + e);
        System.out.println("boolean = " + bool);
        System.out.print("Array = ");
        for (int value : f) {
            System.out.print(value + " ");
        }
        System.out.println("\ng = " + g);
        System.out.println("h = " + h);
        System.out.println("String name = " + name);
        System.out.println("instance varible int = " + num);//instance varible
        System.out.println("Static variable string = " + friend);//Static variable

    }

    public static void main(String[] args) {
        datatypes data = new datatypes();
        data.Dt();

    }
}
