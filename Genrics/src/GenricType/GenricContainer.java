package GenricType;

//we can make implmented class also genric
//
//public class StringContainer  implements Container<String> {
//
//    private String item;
//    @Override
//    public void add(String item) {
//        this.item = item;
//    }
//
//    @Override
//    public String get() {
//        return item;
//    }
//}






public class GenricContainer<T>  implements Container<T> {

    private T item;
    @Override
    public void add(T item) {
        this.item = item;
    }

    @Override
    public T get() {
        return item;
    }
}
