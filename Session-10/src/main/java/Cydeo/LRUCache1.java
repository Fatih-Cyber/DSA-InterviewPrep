package Cydeo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache1 {
  // doubly LinkedList - Doubly linked list node
    public class DNode{
        int key;
        int value;
        DNode prev;
        DNode next;

      public DNode(int key, int value) {
          this.key = key;
          this.value = value;
      }

      public DNode() {
      }
  }


    // dummy head tail - Size - capacity
    int size;
    int capacity;
    DNode head;
    DNode tail;
    HashMap<Integer, DNode> cacheMap=new HashMap<>();

    public LRUCache1(int capacity) {
        this.capacity = capacity;
        this.size=0;
        this.head=new DNode();
        this.tail=new DNode();
        head.next=tail;
        tail.prev=head;

    }
    public void addNode(DNode node){
        node.prev=head;
        node.next=head.next;

        head.next.prev=node;
        head.next=node;
    }
    public void removeNode(DNode node){
        DNode prev=node.prev;
        DNode next=node.next;
        prev.next=next;
        next.prev=prev;
    }
    public void moveToHead(DNode node){
        removeNode(node);
        addNode(node);
    }
    public DNode popTail(){
        DNode popped=tail.prev;
        removeNode(popped);
        return popped;
    }

    public int get(int key){
        DNode node=cacheMap.get(key);
        if(node==null) return -1;
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value){
        DNode node=cacheMap.get(key);
        if (node==null) {
            DNode newNode=new DNode(key,value);
            cacheMap.put(key,newNode);
            addNode(newNode);
            size++;
            if(size>capacity){
                DNode pop= popTail();
                cacheMap.remove(pop);
                size--;
            }


        }else {
            node.value=value;
            moveToHead(node);
        }
    }
    void printLRUCache(){
        for(Map.Entry<Integer, DNode> entry: cacheMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue().value);
        };
    }

}
