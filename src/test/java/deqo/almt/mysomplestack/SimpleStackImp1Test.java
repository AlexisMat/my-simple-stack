package deqo.almt.mysomplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * Un commentaire répondant à l'exigence #3
 * 
 */
public class SimpleStackImp1Test {
/*
    @Before
    public void setUp() throws Exception {

    }
*/
    @Test
    public void isEmpty() {
        SimpleStack stack = new SimpleStackImp1();
        assertEquals(true,stack.isEmpty());
    }

    @Test
    public void getSize() {
        SimpleStack stack = new SimpleStackImp1();
        assertEquals(0,stack.getSize());
    }

    @Test
    public void push() {
        SimpleStack stack = new SimpleStackImp1();
        Item it = new Item(0);
        stack.push(it);
        assertNotEquals(0,stack.getSize());
        assertEquals(false,stack.isEmpty());
    }

    @Test
    public void peek() {
        SimpleStack stack = new SimpleStackImp1();
        Item it = new Item(0);
        stack.push(it);
        stack.peek();
        assertEquals(false,stack.isEmpty());
    }

    @Test
    public void pop() {
        SimpleStack stack = new SimpleStackImp1();
        Item it = new Item(0);
        stack.push(it);
        stack.pop();
        assertEquals(true,stack.isEmpty());
    }
}