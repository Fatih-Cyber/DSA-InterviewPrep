package Cydeo;

public class LRUCache1TestApp {
    public static void main(String[] args) {
        LRUCache1 cache=new LRUCache1(3);
        cache.put(1,1);
        cache.put(2,2);
        cache.put(3,3);
        cache.put(4,4);
        System.out.println(cache.get(1));
        cache.printLRUCache();
    }
}
