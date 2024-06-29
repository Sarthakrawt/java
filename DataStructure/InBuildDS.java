package DataStructure;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InBuildDS {
    public static void main(String[] args) {

        // in-build in java
        // you can push and pop element in inbuild stack fucntion 
        // as we know in stack last in first out 
        // mean if we push the last element then it will pop first 
        Stack<Integer> stack = new Stack<>();
        // insert
        stack.push(12);
        stack.push(43);
        stack.push(23);
        stack.push(23);
        //remove
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // queue is an interface
        // so you cannot make the object of queue so we have to use linklist
       // in queue first is first out is used 
        Queue<Integer> queue = new LinkedList<>();
        //insert 
        queue.add(12);
        queue.add(54);
        queue.add(55);
        //remove
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        // Deque
        // dequeue is doublly ended queue
        // means you can insert and remove form both the side
        Deque<Integer> deque = new ArrayDeque();
        deque.addFirst(12);
        deque.addFirst(32);
        deque.addLast(3);
        deque.addFirst(423);
        System.out.println(deque.removeFirst());

        // Linklist
       // as we know linklist is a set of nodes which are link through each other using next 
        LinkedList<String> list = new LinkedList<>();
       
        //insert 
        list.add("yes");
        list.add("its");
        list.add("link");
        list.add("list");
        // print the list 
        System.out.println(list);
        // it will give you the first node 
        System.out.println(list.getFirst());
        // to get any elem in the index 
        System.out.println(list.get(1));

        list.remove();// for remove 
        System.out.println(list);


    }
}
