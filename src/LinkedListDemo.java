import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> myLinkedList=new LinkedList<String>();
        myLinkedList.addFirst("Richard");
        myLinkedList.add("Munywoki");
        myLinkedList.add("Kawenze");
        myLinkedList.add(2,"Is a Beast");
        System.out.println(myLinkedList);
        myLinkedList.removeLast();
        System.out.println(myLinkedList);
    }
    
}
