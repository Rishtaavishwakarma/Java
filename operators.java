
public class operators {

    public void ArithmeticOperators() {
        int a = 10;
        int b = 20;

        //addition
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = b / a;
        int mod = b % a;
        int post_incre = a++;
        int post_decre = a--;

        System.out.println("num1 =" + a);
        System.out.println("num2 =" + b);
        System.out.println("add =" + add);
        System.out.println("sub =" + sub);
        System.out.println("mul =" + mul);
        System.out.println("div =" + div);
        System.out.println("mod =" + mod);
        System.out.println("increment =" + post_incre);
        System.out.println("decrement =" + post_decre);
    }

    public static void main(String[] args) {

        operators op = new operators();
        op.ArithmeticOperators();

    }
}
