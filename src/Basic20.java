public class Basic20 {
    public static void test() {

        int x = 3;
        int y = 4;


        System.out.println(add(x,y));

        String name = "Daniel";
        int age = 24;
        hello(name,age);

    }
    static void hello(String FirstName, int number){
        System.out.println("Hello" + " " + FirstName + " " + number + " years old");
    }
    static int add(int a, int b){
        return a + b;
    }

}
