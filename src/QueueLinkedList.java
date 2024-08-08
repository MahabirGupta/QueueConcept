import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;


public class QueueLinkedList {
    public static void main(String[] args) {

//        create PriortyQueue class
        LinkedList linkedList = new LinkedList();

//        add elements using add() or offer() method
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.offer("C"); //duplicates are allowed
        linkedList.offer(23); // allowed in queue LinkedList.

        System.out.println(linkedList); //insertion order preserved

//        get head element using element() or peek() method
        System.out.println(linkedList.element()); //if empty it will return NoSuchElementException
        System.out.println(linkedList.peek()); //if empty it will return null
        System.out.println();

// return and remove element from queue remove() poll()
        System.out.println(linkedList.remove()); //element A will be removed. If empty it will return NoSuchElementException
        System.out.println(linkedList);
        System.out.println(linkedList.poll()); //element B will be removed. If empty it will return null
        System.out.println(linkedList);

        System.out.println();

//        To print out all the elements in the PriorityQueue using Iterator
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();

        //        To print out all the elements in the PriorityQueue using for.each loop
        for (Object object:linkedList){
            System.out.println(object);
        }

    }
}
