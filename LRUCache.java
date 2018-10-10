import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

// get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
// put(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.


cache.put(1, 1);
cache.put(2, 2);
cache.get(1);       // returns 1
cache.put(3, 3);    // evicts key 2
cache.get(2);       // returns -1 (not found)
cache.put(4, 4);    // evicts key 1
cache.get(1);       // returns -1 (not found)
cache.get(3);       // returns 3
cache.get(4);       // returns 4

head <->  tail //empty dll 
head <-> 1,1 <-> tail 
// Node node1 = new Node(1,1);
// head.next = node1;
// tail.pre = node1;
// node1.next = tail;
// node1.pre = head;

head <-> 2,2 <-> 1,1 <-> tail

class LRUCache {

    class Node{
      int key, value;
      Node pre = null, next = null;
      
      public Node(int key, int value){
      
        this.key = key;
        this.value = value;
        
      }
    }
    
    private HashMap<int, Node> map;
    private Node head, tail;
  
     
    public LRUCache(int capacity) {
      map =new HashMap<>();
      this capacity;
      head = new Node(-1,-1);
      tail = new Node(-1,-1);
      
      head.next = tail;
      tail.pre = head;
      //dump node
    }
    
    public int get(int key) {
    //
        
    }
    
    // head <-> 1,1 <-> tail  
    // head <-> 2,2 <-> 1,1 <-> tail
    
    public void put(int key, int value) {
      // key already existed ? 
      //  - yes: update value. 
      //       - update value
      //       - move this node to the beginning  
      //  - no : 
      //       reach size limit ? 
      //       - not reach limit: 
      //           - insert new node after head
      //       - reach limit: 
      //           - delete tail.pre
      //           - insert new node after head 

      //map -> key,value -> 值/capacity
      //list -> 维持order -> 节点移动/删除
      
      if (map.containsKey(key)){
        //- update value
        //- move this node to the beginning  
        Node node = map.get(key);
        node.value = value;
//         node1 = 1,1
//         node2 = 2,2
        
//         head <-> 2,2 <-> 1,1 <-> tail
//         (1) remove: 
//             head <-> 2,2 <-> tail
//             - node2.next = tail
//             - tail.pre = node2
//         (2) insert after head: 
//             head <-> 1,1 <-> 2,2 <-> 
//             - node1.next = head.next 
//             - node1.pre = head 
//             - head.next = node1
//             - node1.next.pre = node1;           
//         head <-> 1,1 <-> 2,2 <-> tail
        remove(node1);
        insertAfterHead(node1); 
      } else {
        int size = map.size();
        if(size < capacity){
            Node node = new Node(key, value);
            // update map
            map.put(key, node);
            // insert into list
            insertAfterHead(node);
        } else {
            // delete oldest node
            Node lastNode = tail.pre;
            remove(lastNode);
            map.remove(lastNode.key);
            
            // insert new node
            Node newNode = new Node(key, value);
            insertAfterHead(newNode);
            map.put(key, newNode);
        }
      } 
    }
    
    private remove(Node node){
    } 
    
    private insertAfterHead(Node node){
    }  
    
}
