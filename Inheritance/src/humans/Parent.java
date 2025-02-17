package humans;

public class Parent  extends  GrandParent{

    String parentName;

    Parent(String familyName, String parentName) {
        super(familyName); // Call to Grandparent's constructor
        this.parentName = parentName;
        System.out.println("Parent's constructor called: Parent Name = " + this.parentName);
    }
}
