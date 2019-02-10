package edu.isu.cs.cs3308.structures;

/**
 * An implementation of a double-ended Queue ADT. Elements can be added/removed
 * from either the top or bottom of the queue.
 *
 * @author Andrew Aikens
 * @param <E> Element Type of the queue
 */
public class LinkedDeque<E> implements Deque<E> {
    private DoublyLinkedList<E> deque;
    public LinkedDeque(){ deque = new DoublyLinkedList<>(); }

    /**
     * @return The value of the last element of the deque (without removing it),
     * or null if the deque is empty.
     */
    @Override
    public E peekLast() {
        return deque.last();
    }

    /**
     * Inserts the given element into the front of the deque, unless the
     * provided value is null.
     *
     * @param element Element to be inserted to the front of the deque, nothing
     * happens if the value is null.
     */
    @Override
    public void offerFirst(E element) {
        deque.addFirst(element);
    }

    /**
     * @return The value of the last item in the Deque and removes that value
     * from the deque, if the deque was empty null is returned.
     */
    @Override
    public E pollLast() {
        return deque.removeLast();
    }

    /**
     * @return The number of elements in the deque
     */
    @Override
    public int size() {
        return deque.size();
    }

    /**
     * @return tests whether the deque is empty.
     */
    @Override
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    /**
     * Inserts an element at the end of the deque.
     *
     * @param element Element to be inserted.
     */
    @Override
    public void offer(E element) {
        deque.addLast(element);
    }

    /**
     * @return The value first element of the deque (with out removing it), or
     * null if empty.
     */
    @Override
    public E peek() {
        return deque.first();
    }

    /**
     * @return The value of the first element of the deque (and removes it), or
     * null if empty.
     */
    @Override
    public E poll() {
        return deque.removeFirst();
    }

    /**
     * Prints the contents of the deque starting at top, one item per line. Note
     * this method should not empty the contents of the deque.
     */
    @Override
    public void printQueue() {
        deque.printList();
    }

    /**
     * Transfers the contents of this deque into the provided queue. The contents
     * of this deque are to found in reverse order at the top of the provided
     * queue. This deque should be empty once the transfer is completed. Note
     * that if the provided queue is null, nothing is to happen.
     *
     * @param into The new queue onto which the reversed order of contents from
     * this deque are to be transferred to the top of, unless the provided queue
     * is null.
     */
    @Override
    public void transfer(Queue<E> into) {
        if(into == null)
            return;
        LinkedStack<E> stack = new LinkedStack<>();
        while(!into.isEmpty())
            stack.push(into.poll());
        while(!isEmpty())
            into.offer(pollLast());
        stack.reverse();
        while(!stack.isEmpty())
            into.offer(stack.pop());
    }

    /**
     * Reverses the contents of this deque using a stack.
     */
    @Override
    public void reverse() {
        LinkedStack<E> stack = new LinkedStack<>();
        while(!isEmpty())
            stack.push(this.poll());
        while(!stack.isEmpty())
            this.offer(stack.pop());
    }

    /**
     * Merges the contents of the provided queue onto the bottom of this deque.
     * The order of both queues must be preserved in the order of this queue
     * after the method call. Furthermore, the provided queue must still contain
     * its original contents in their original order after the method is
     * complete. If the provided queue is null, no changes should occur.
     *
     * @param from Queue whose contents are to be merged onto the bottom of
     * this deque.
     */
    @Override
    public void merge(Queue<E> from) {
        if(from == null)
            return;
        E element;
        Queue<E> temp1 = new LinkedDeque<>();
        Queue<E> temp2 = new LinkedDeque<>();
        while(!from.isEmpty()) {
            element = from.poll();
            temp1.offer(element);
            temp2.offer(element);
        }
        while(!temp1.isEmpty())
            this.offer(temp1.poll());
        while(!temp2.isEmpty())
            from.offer(temp2.poll());
    }
}
