import java.util.ArrayList;

 public class Basic18 {
    public static void test(){
        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("hamburgeer");
        food.add("hotdog");

        food.set(0, "sushi");
        food.remove(2);
        food.clear();
        for (int i = 0; i < food.size() ; i++) {
            System.out.println(food.get(i));
        }
    }
}
