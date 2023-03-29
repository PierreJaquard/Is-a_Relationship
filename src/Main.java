import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {
        String s = new String("hello");
        //s.toLowerCase();
        Animal tiger = new Animal("tiger");
        tiger.eat();
        System.out.println(tiger.mamal);

        Dog oreo = new Dog("oreo", "blue");
        //oreo.eat();
        //oreo.bark();
        //oreo.bark("english");

        System.out.println(oreo.mamal);

        System.out.println("this dog's color is " + oreo.getColor());

        Dog potato = new Dog("potato", "brown");
        System.out.println("this dog's color is " + potato.getColor());

        


    }
}