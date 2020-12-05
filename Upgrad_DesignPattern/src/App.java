
import Builder.User;
import Factory.Shape;
import Factory.ShapeFactory;

public class App {
    public static void main(String[] args) {


//        SingleTon instance1 = SingleTon.createInstance();
//        SingleTon instance2 = SingleTon.createInstance();
//
//        System.out.println(instance1);
//        System.out.println(instance2);

//        Shape circle = new Circle("circle");
//        circle.draw();


//        ShapeFactory shapeFactory = new ShapeFactory();
//
//        Shape rectangle = shapeFactory.getShape("RECTANGLE");
//        rectangle.draw();


        Cat cat = new Cat();
        cat.make_sound();

        User sayan = new User.UserBuilder("Sayan", "Nayak")
                .withPhone("12345").build();

        User user1 = new User.UserBuilder("Sayan", "Nayak")
                .withAge(30)
                .withPhone("1234567")
                .withAddress("Bangalore")
                .build();


        System.out.println(user1);

    }
}
