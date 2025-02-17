package humans;

public class GrandParent {


    String name;
    String familyName;

    GrandParent(String familyName) {
        this.familyName = familyName;
        System.out.println("Grandparent's constructor called: Family Name = " + this.familyName);
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
