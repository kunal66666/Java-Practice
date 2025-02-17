package GenricType;
//
//public class Box {
//
//    private Object value;
//
//    public Object getValue() {
//        return value;
//    }
//    public void setValue(Object value) {
//        this.value = value;
//    }
//
//
//}

//here t means Type
//accosing to convecntion we cna write  any singke letter to descibe genric type in class

//now we weill create genric typoe

//if we suing exctends Number means
//it is bounded genric class
//so only numnber can be there
public class Box<T extends Number> {

    private T value;

    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }


}
