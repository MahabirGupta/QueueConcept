import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

//        create PriortyQueue class
        PriorityQueue priorityQueue = new PriorityQueue<>();

//        add elements using add() or offer() method
        priorityQueue.add("A");
        priorityQueue.add("B");
        priorityQueue.add("C");
        priorityQueue.offer("C"); //duplicates are allowed

        System.out.println(priorityQueue); //insertion order preserved

    }
}
