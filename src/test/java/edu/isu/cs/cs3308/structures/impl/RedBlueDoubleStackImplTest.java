package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.RedBlueDoubleStackImpl;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import edu.isu.cs.cs3308.structures.RedBlueDoubleStack;

/**
 *
 * @author fate
 */
public class RedBlueDoubleStackImplTest {

    private RedBlueDoubleStack<Integer> fixture;

    public RedBlueDoubleStackImplTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        fixture = new RedBlueDoubleStackImpl<>();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of pushRed method, of class RedBlueDoubleStackImpl.
     */
    @Test
    public void testPushRed() {
        assertTrue(fixture.isRedEmpty());

        fixture.pushRed(null);
        assertTrue("Push allows adding nulls", fixture.isRedEmpty());
    }

    @Test
    public void testPushRed_2() {
        fixture.pushRed(0);
        assertEquals("Push not adding as first element", new Integer(0), fixture.peekRed());
    }

    @Test
    public void testPushRed_3() {
        fixture.pushRed(0);
        fixture.pushRed(1);
        assertEquals("Push not adding as first element", new Integer(1), fixture.peekRed());

    }

    /**
     * Test of pushBlue method, of class RedBlueDoubleStackImpl.
     */
    @Test
    public void testPushBlue() {
        assertTrue(fixture.isBlueEmpty());

        fixture.pushBlue(null);
        assertTrue("Push allows adding nulls", fixture.isBlueEmpty());
    }

    @Test
    public void testPushBlue_2() {
        fixture.pushBlue(0);
        assertEquals("Push not adding as first element", new Integer(0), fixture.peekBlue());
    }

    @Test
    public void testPushBlue_3() {
        fixture.pushBlue(0);
        fixture.pushBlue(1);
        assertEquals("Push not adding as first element", new Integer(1), fixture.peekBlue());

    }

    /**
     * Test of popRed method, of class RedBlueDoubleStackImpl.
     */
    @Test
    public void testPopRed() {
        assertTrue(fixture.isRedEmpty());

        assertNull("Null not returned when popping from an empty stack", fixture.popRed());
    }

    @Test
    public void testPopRed_2() {
        fixture.pushRed(0);
        assertEquals("not correctly popping the first element", new Integer(0), fixture.popRed());
        assertTrue("size is not correctly updated after a pop", fixture.isRedEmpty());
    }

    @Test
    public void testPopRed_3() {
        fixture.pushRed(1);
        fixture.pushRed(2);
        assertEquals("Not correctly popping the first element", new Integer(2), fixture.popRed());
        assertEquals("size is not correctly updated after a pop", 1, fixture.sizeRed());
    }

    /**
     * Test of popBlue method, of class RedBlueDoubleStackImpl.
     */
    @Test
    public void testPopBlue() {
        assertTrue(fixture.isBlueEmpty());

        assertNull("Null not returned when popping from an empty stack", fixture.popBlue());
    }

    @Test
    public void testPopBlue_2() {
        fixture.pushBlue(0);
        assertEquals("not correctly popping the first element", new Integer(0), fixture.popBlue());
        assertTrue("size is not correctly updated after a pop", fixture.isBlueEmpty());
    }

    @Test
    public void testPopBlue_3() {
        fixture.pushBlue(1);
        fixture.pushBlue(2);
        assertEquals("Not correctly popping the first element", new Integer(2), fixture.popBlue());
        assertEquals("size is not correctly updated after a pop", 1, fixture.sizeBlue());
    }

    /**
     * Test of peekRed method, of class RedBlueDoubleStackImpl.
     */
    @Test
    public void testPeekRed() {
        assertTrue(fixture.isRedEmpty());

        assertNull("Peek not returning null for an empty stack", fixture.peekRed());
    }

    @Test
    public void testPeekRed_2() {
        fixture.pushRed(1);
        assertEquals("Peek not correctly getting value of first element", new Integer(1), fixture.peekRed());
        assertEquals("Size is incorrectly changed after a peek", 1, fixture.sizeRed());
    }

    @Test
    public void testPeekRed_3() {
        fixture.pushRed(1);
        fixture.pushRed(0);
        assertEquals("Peek not looking at first element", new Integer(0), fixture.peekRed());
        assertEquals("Size is incorrectly changed after a peek", 2, fixture.sizeRed());
    }

    /**
     * Test of peekBlue method, of class RedBlueDoubleStackImpl.
     */
    @Test
    public void testPeekBlue() {
        assertTrue(fixture.isBlueEmpty());

        assertNull("Peek not returning null for an empty stack", fixture.peekBlue());
    }

    @Test
    public void testPeekBlue_2() {
        fixture.pushBlue(1);
        assertEquals("Peek not correctly getting value of first element", new Integer(1), fixture.peekBlue());
        assertEquals("Size is incorrectly changed after a peek", 1, fixture.sizeBlue());
    }

    @Test
    public void testPeekBlue_3() {
        fixture.pushBlue(1);
        fixture.pushBlue(0);
        assertEquals("Peek not looking at first element", new Integer(0), fixture.peekBlue());
        assertEquals("Size is incorrectly changed after a peek", 2, fixture.sizeBlue());
    }

    /**
     * Test of sizeRed method, of class RedBlueDoubleStackImpl.
     */
    @Test
    public void testSizeRed() {
        assertEquals("size not initialized to zero", 0, fixture.sizeRed());
    }

    @Test
    public void testSizeRed_2() {
        fixture.pushRed(1);
        assertEquals("Size not updated correctly on push", 1, fixture.sizeRed());
    }

    @Test
    public void testSizeRed_3() {
        assertEquals(0, fixture.sizeRed());
        fixture.pushRed(null);
        assertEquals("Size modified on push of null element", 0, fixture.sizeRed());
    }

    @Test
    public void testSize() {
        fixture.pushRed(2);
        fixture.pushRed(3);
        fixture.pushBlue(4);
        assertEquals(2, fixture.sizeRed());
        assertEquals(1, fixture.sizeBlue());
    }

    /**
     * Test of isBlueEmpty method, of class RedBlueDoubleStackImpl.
     */
    @Test
    public void testSizeBlue() {
        assertEquals("size not initialized to zero", 0, fixture.sizeBlue());
    }

    @Test
    public void testSizeBlue_2() {
        fixture.pushBlue(1);
        assertEquals("Size not updated correctly on push", 1, fixture.sizeBlue());
    }

    @Test
    public void testSizeBlue_3() {
        assertEquals(0, fixture.sizeBlue());
        fixture.pushBlue(null);
        assertEquals("Size modified on push of null element", 0, fixture.sizeBlue());
    }

    /**
     * Test of isRedEmpty method, of class RedBlueDoubleStackImpl.
     */
    @Test
    public void testIsRedEmpty() {
        assertTrue("Red Stack not initialized to empty state on creation", fixture.isRedEmpty());
    }

    @Test
    public void testIsRedEmpty_2() {
        fixture.pushRed(null);
        assertTrue("Red Stack size updated after push of null", fixture.isRedEmpty());
    }

    @Test
    public void testIsRedEmpty_3() {
        fixture.pushRed(0);
        assertFalse("Red Stack not updating size correctly", fixture.isRedEmpty());
    }

    /**
     * Test of isBlueEmpty method, of class RedBlueDoubleStackImpl.
     */
    @Test
    public void testIsBlueEmpty() {
        assertTrue("Blue Stack not initialized to empty state on creation", fixture.isBlueEmpty());
    }

    @Test
    public void testIsBlueEmpty_2() {
        fixture.pushBlue(null);
        assertTrue("Blue Stack size updated after push of null", fixture.isBlueEmpty());
    }

    @Test
    public void testIsBlueEmpty_3() {
        fixture.pushBlue(0);
        assertFalse("Blue Stack not updating size correctly", fixture.isBlueEmpty());
    }

    @Test
    public void testIsEmpty() {
        fixture.pushBlue(1);
        fixture.pushBlue(2);

        assertTrue(fixture.isRedEmpty());
        assertFalse(fixture.isBlueEmpty());
    }

}
