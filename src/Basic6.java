import java.util.Scanner;
public class Basic6 {
    public static void test(){

        double x = 3.14;
        double y = -10;
        double z = Math.max(x,y);

        System.out.println(z);

        double k = Math.min(x,y);
        System.out.println(k);

        double o = Math.ceil(x);
        System.out.println(o);

        double a;
        double b;
        double c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side a: ");
        a = scanner.nextDouble();
        System.out.println("Enter side b: ");
        b = scanner.nextDouble();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println("The hypotenuse is: " + c);
        scanner.close();

    }
}
