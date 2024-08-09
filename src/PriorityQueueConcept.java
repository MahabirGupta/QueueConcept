import java.util.Iterator;
import java.util.PriorityQueue;



public class PriorityQueueConcept {
    public static void main(String[] args) {

//        create PriortyQueue class
        PriorityQueue priorityQueue = new PriorityQueue<>();

//        add elements using add() or offer() method
        priorityQueue.add("A");
        priorityQueue.add("B");
        priorityQueue.add("C");
        priorityQueue.offer("C"); //duplicates are allowed
//        priorityQueue.offer(23); // not allowed in PriorityQueue. Only homogenous data is allowed not hetrogenuos

        System.out.println(priorityQueue); //insertion order preserved

//        get head element using element() or peek() method
//        System.out.println(priorityQueue.element()); //if empty it will return NoSuchElementException
        System.out.println(priorityQueue.peek()); //if empty it will return null
        System.out.println();

// return and remove element from queue remove() poll()
//        System.out.println(priorityQueue.remove()); //element A will be removed. If empty it will return NoSuchElementException
//        System.out.println(priorityQueue);
//        System.out.println(priorityQueue.poll()); //element B will be removed. If empty it will return null
//        System.out.println(priorityQueue);

//        To print out all the elements in the PriorityQueue using Iterator
        Iterator iterator = priorityQueue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();

        //        To print out all the elements in the PriorityQueue using for.each loop
        for (Object object:priorityQueue){
            System.out.println(object);
        }

    }
}
