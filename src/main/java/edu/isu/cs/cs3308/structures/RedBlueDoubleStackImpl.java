package edu.isu.cs.cs3308.structures;

/**
 * RedBlueDoubleStack is a Doubly Ended Stack that has two colors representing the
 * ends. Red is the top of the DeStack and Blue is the Bottom.
 *
 * @author Andrew Aikens
 * @param <E> The Type of element stored in the RedBlueDoubleStack.
 */
public class RedBlueDoubleStackImpl<E> implements RedBlueDoubleStack<E> {
    private Deque<E> red;
    private Deque<E> blue;

    public RedBlueDoubleStackImpl(){
        red = new LinkedDeque<>();
        blue = new LinkedDeque<>();
    }

    /**
     * Adds the element to the top of the Red Stack, unless the element is null.
     *
     * @param element Element to add.
     */
    @Override
    public void pushRed(E element) {
        red.offerFirst(element);
    }

    /**
     * Adds the element to the top of the Blue Stack, unless the element is
     * null.
     *
     * @param element Element to add.
     */
    @Override
    public void pushBlue(E element) {
        blue.offerFirst(element);
    }

    /**
     * Removes the element at the top of the Red Stack and returns its value,
     * unless the Red Stack is empty.
     *
     * @return Element at the top of the Red Stack, or null if the Red Stack is
     * empty
     */
    @Override
    public E popRed() {
        return red.poll();
    }

    /**
     * Removes the element at the top of the Blue Stack and returns its value,
     * unless the Blue Stack is empty.
     *
     * @return Element at the top of the Red Stack, or null if the Blue Stack is
     * empty
     */
    @Override
    public E popBlue() {
        return blue.poll();
    }

    /**
     * Returns the value at the top of the Red Stack.
     *
     * @return The value at the top of the Red Stack, or null if the Red Stack
     * is empty
     */
    @Override
    public E peekRed() {
        return red.peek();
    }

    /**
     * Returns the value at the top of the Blue Stack.
     *
     * @return The value at the top of the Blue Stack, or null if the Blue Stack
     * is empty
     */
    @Override
    public E peekBlue() {
        return blue.peek();
    }

    /**
     * @return Current size of the Blue Stack
     */
    @Override
    public int sizeBlue() {
        return blue.size();
    }

    /**
     * @return Current size of the Red Stack
     */
    @Override
    public int sizeRed() {
        return red.size();
    }

    /**
     * @return True if the Blue Stack is empty, false otherwise
     */
    @Override
    public boolean isBlueEmpty() {
        return blue.isEmpty();
    }

    /**
     * @return True if the Red Stack is empty, false otherwise
     */
    @Override
    public boolean isRedEmpty() {
        return red.isEmpty();
    }
}
