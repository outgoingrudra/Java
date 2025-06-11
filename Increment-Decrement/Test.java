public class Test {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 0;

        System.out.println("Initial a: " + a);
        a++;
        System.out.println("After a++: " + a);
        ++a;
        System.out.println("After ++a: " + a);

        System.out.println("Initial b: " + b);
        b--;
        System.out.println("After b--: " + b);
        --b;
        System.out.println("After --b: " + b);

        c = a++;
        System.out.println("c = a++ results in c: " + c + ", a: " + a);

        c = ++b;
        System.out.println("c = ++b results in c: " + c + ", b: " + b);

        int x = 3;
        int y = 3;
        int result1 = x++ + ++x;
        int result2 = --y + y--;
        System.out.println("x++ + ++x = " + result1);
        System.out.println("--y + y-- = " + result2);
    }
}
