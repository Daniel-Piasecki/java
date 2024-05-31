import java.util.Scanner;

public class Basic10 {
    public static void test(){
        /*
        Logical operators:
        && And
        || or
        ! not
         */
        int temp = 25;
        if(temp>30){
            System.out.println("it is hot outside");
        } else if (temp >= 20 && temp <=30) {
            System.out.println("It is warm outside");
        }
        else {
            System.out.println("Its cold outside");
        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Its a game! press q or Q to quit");
//        String response = scanner.next();
//        if (response.equals("q") || response.equals("Q")){
//            System.out.println("");
//        }
//        else {
//            System.out.println("You are still playing");
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Its a game! press q or Q to play");
        String response = scanner.next();
        if (!response.equals("q") && !response.equals("Q")){
            System.out.println("You are still playing");
        }
        else {
            System.out.println("You quit the game");
        }

    }
}
