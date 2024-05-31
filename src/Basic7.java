import java.util.Random;
public class Basic7 {
    public static void test(){
        Random random = new Random();

        int x = random.nextInt(7)+1;
        double y = random.nextDouble();

        boolean z = random.nextBoolean();
        System.out.println(x);


    }
}
