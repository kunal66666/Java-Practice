package humans;

public class Child extends  Parent{

    String childName;

    Child(String familyName, String parentName, String childName) {
        super(familyName, parentName); // Call to Parent's constructor
        this.childName = childName;
        System.out.println("Child's constructor called: Child Name = " + this.childName);
    }

}
