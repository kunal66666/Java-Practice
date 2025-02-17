package LRU;

import java.util.LinkedHashMap;
import java.util.Map;

public class LruCache<K,V> extends LinkedHashMap<K,V> {

    private int capacity;
    public LruCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LruCache<String,Integer> STUDENTMAP=new LruCache<>(3);
        STUDENTMAP.put("A",1);
        STUDENTMAP.put("B",2);
        STUDENTMAP.put("C",3);
        STUDENTMAP.put("D",4);
        System.out.println(STUDENTMAP);
    }
}
