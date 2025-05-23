
public class operators {

    // 1. Arithmetic Operators
    public void arithmeticOperators() {
        int a = 10;
        int b = 20;

        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = b / a;
        int mod = b % a;
        int incre = a++;  // 10, then a = 11
        int decre = a--;  // 11, then a = 10

        System.out.println("=== Arithmetic Operators ===");
        System.out.println("num1 = " + a);
        System.out.println("num2 = " + b);
        System.out.println("add = " + add);
        System.out.println("sub = " + sub);
        System.out.println("mul = " + mul);
        System.out.println("div = " + div);
        System.out.println("mod = " + mod);
        System.out.println("increment = " + incre);
        System.out.println("decrement = " + decre);
    }

    // 2. Relational Operators
    public void relationalOperators() {
        int x = 10;
        int y = 20;

        System.out.println("\n=== Relational Operators ===");
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));
    }

    // 3. Logical Operators
    public void logicalOperators() {
        boolean a = true;
        boolean b = false;

        System.out.println("\n=== Logical Operators ===");
        System.out.println("a && b: " + (a && b));
        System.out.println("a || b: " + (a || b));
        System.out.println("!a: " + (!a));
    }

    // 4. Bitwise Operators
    public void bitwiseOperators() {
        int x = 5;  // 0101
        int y = 3;  // 0011

        System.out.println("\n=== Bitwise Operators ===");
        System.out.println("x & y: " + (x & y));  // 0001 = 1
        System.out.println("x | y: " + (x | y));  // 0111 = 7
        System.out.println("x ^ y: " + (x ^ y));  // 0110 = 6
        System.out.println("~x: " + (~x));        // ~0101 = 1010 (in 2's comp = -6)
        System.out.println("x << 1: " + (x << 1)); // 1010 = 10
        System.out.println("x >> 1: " + (x >> 1)); // 0010 = 2
    }

    // 5. Assignment Operators
    public void assignmentOperators() {
        int a = 10;
        System.out.println("\n=== Assignment Operators ===");
        System.out.println("a = " + a);
        a += 5;
        System.out.println("a += 5: " + a);
        a -= 3;
        System.out.println("a -= 3: " + a);
        a *= 2;
        System.out.println("a *= 2: " + a);
        a /= 4;
        System.out.println("a /= 4: " + a);
        a %= 3;
        System.out.println("a %= 3: " + a);
    }

    // 6. Unary Operators
    public void unaryOperators() {
        int a = 5;

        System.out.println("\n=== Unary Operators ===");
        System.out.println("a = " + a);
        System.out.println("++a = " + (++a)); // Pre-increment
        System.out.println("--a = " + (--a)); // Pre-decrement
        System.out.println("a++ = " + (a++)); // Post-increment (returns 5, then a = 6)
        System.out.println("a-- = " + (a--)); // Post-decrement (returns 6, then a = 5)
        System.out.println("Final value of a = " + a);
    }

    public static void main(String[] args) {
        operators op = new operators();
        op.arithmeticOperators();
        op.relationalOperators();
        op.logicalOperators();
        op.bitwiseOperators();
        op.assignmentOperators();
        op.unaryOperators();
    }
}
