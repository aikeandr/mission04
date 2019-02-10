package edu.isu.cs.cs3308;

import edu.isu.cs.cs3308.structures.Deque;
import edu.isu.cs.cs3308.structures.Stack;
import edu.isu.cs.cs3308.structures.LinkedDeque;
import edu.isu.cs.cs3308.structures.LinkedStack;
import edu.isu.cs.cs3308.structures.RedBlueDoubleStackImpl;
import edu.isu.cs.cs3308.structures.RedBlueDoubleStack;

/**
 *
 * @author Isaac Griffith
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Deque<String> deque = new LinkedDeque<>();

        deque.offer("Hello");
        deque.offerFirst("World");
        deque.printQueue();

        System.out.println("\n");
        System.out.println(deque.poll());
        deque.offer("GoodBye");
        deque.printQueue();
        System.out.println(deque.pollLast());

        deque.offer("Another");
        deque.offer("Dust");
        deque.printQueue();

        System.out.println("\n");
        System.out.println("Reversed:");
        deque.reverse();
        deque.printQueue();

        System.out.println("\n");
        System.out.println("Transferred:");
        Deque<String> temp = new LinkedDeque<>();
        deque.transfer(temp);
        temp.printQueue();

        System.out.println("\n");
        System.out.println("Merged Back:");
        deque.merge(temp);
        deque.printQueue();

        System.out.println("\n");
        Stack<Integer> stack1 = new LinkedStack<>();
        Stack<Integer> stack2 = new LinkedStack<>();
        for (int i = 4; i > 0; i--)
            stack1.push(i);
        for (int i = 8; i > 5; i--)
            stack2.push(i);

        System.out.println("Stack1:");
        stack1.printStack();
        System.out.println("\nStack2:");
        stack2.printStack();

        System.out.println("\nMerged Stacks");
        DequeStackMerge.dequeStackMerge(stack1, stack2);
        stack1.printStack();

        System.out.println("\nDestack:");
        RedBlueDoubleStack<Integer> redBlue = new RedBlueDoubleStackImpl<>();

        redBlue.pushBlue(1);
        redBlue.pushRed(1);
        redBlue.pushRed(2);

        System.out.println("Red Size: " + redBlue.sizeRed());
        System.out.println("Blue Size: " + redBlue.sizeBlue());

        System.out.println("Red Peek: " + redBlue.peekRed());
        System.out.println("Blue Peek: " + redBlue.peekBlue());
    }

}
