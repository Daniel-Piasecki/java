import java.util.Scanner;

public class Basic11
{
    public static void test(){

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isBlank()){
            System.out.println("Enter your name: ");
            name = scanner.nextLine();

        }
        System.out.println("Hello " + name);

    }
}
