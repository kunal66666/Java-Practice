public class Dog extends  Animal {


    //overrding the parent class method
    @Override
    public void sayHEllo() {
       super.sayHEllo();
        System.out.println("woof");
    }
    public void drink()
    {
        System.out.println("drink");
    }
}
