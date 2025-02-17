//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // we cannot create object of abstract type
//        Animal animal = new Animal();
        //because sayhello doesnot have otis defincaiton
        //but we can keep refenrce is object is created for implmenntaiton not refernce

        Animal dog = new Dog();
        dog.setName("Dog");
        dog.setAge(23);
        dog.sayHEllo();
        dog.sleep();
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
    }
}