public record Person(String name, int age) {

}




//it is equivalent to
//public final class Person {
//    private final String name;
//    private final int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String name() {
//        return name;
//    }
//
//    public int age() {
//        return age;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Person)) return false;
//        Person person = (Person) o;
//        return age == person.age && Objects.equals(name, person.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }
//
//    @Override
//    public String toString() {
//        return "Person[name=" + name + ", age=" + age + "]";
//    }
//}
