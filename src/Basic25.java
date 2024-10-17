public class Basic25 {
    public static void test(){

        Basic25Human human1 = new Basic25Human("Rick",65,70);
        Basic25Human human2 = new Basic25Human("Morty",16,56);


        System.out.println(human2.name);
        System.out.println(human1.name);

        human2.eat();
        human1.drink();


    }
}
