package Interface;

public class Dog  implements Animal{
    @Override
    public void sleep() {
        System.out.println("Dog sleep");
    }

    @Override
    public void eat() {
  System.out.println("Dog eat");
    }


}
