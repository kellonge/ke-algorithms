package com.kellonge.datastruct.stack.impl;

import com.kellonge.datastruct.stack.KeStatck;
import com.kellonge.datastruct.stack.StatckOverFlowException;
import com.kellonge.datastruct.stack.StatckUnderFlowException;
import junit.framework.TestCase;

import java.util.Date;

/**
 * Created by kellonge on 16/6/29.
 */
public class KeArrayStatckTest extends TestCase {

    public void testKeArrayStatckConstructor() throws Exception {
        Exception exception = null;
        try {
            KeStatck keStatck = new KeArrayStatck(100);
        } catch (Exception e) {
            exception = e;
        }
        assertNull(exception);
        exception = null;
        try {
            KeStatck keStatck = new KeArrayStatck(0);
        } catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        assertTrue(exception instanceof IllegalArgumentException);
        exception = null;
        try {
            KeStatck keStatck = new KeArrayStatck(-1);
        } catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        assertTrue(exception instanceof IllegalArgumentException);
    }

    public void testIsEmpty() throws Exception {
        KeStatck keStatck = new KeArrayStatck(100);
        assertTrue(keStatck.isEmpty());
        keStatck.push(new Date());
        assertFalse(keStatck.isEmpty());
    }

    public void testPush() throws Exception {
        KeStatck keStatck = new KeArrayStatck(3);
        String data = "ss";
        for (int i = 0; i < 3; i++) {
            keStatck.push(data);
        }
        Exception exception = null;
        try {
            keStatck.push(data);
        } catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        assertTrue(exception instanceof StatckOverFlowException);
    }

    public void testPop() throws Exception {
        KeStatck keStatck = new KeArrayStatck(3);
        String data = "ss";
        for (int i = 0; i < 3; i++) {
            keStatck.push(data);
        }
        for (int i = 0; i < 3; i++) {
            Object pop = keStatck.pop();
            assertEquals(data, pop);
        }
        Exception exception = null;
        try {
            keStatck.pop();
        } catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        assertTrue(exception instanceof StatckUnderFlowException);

    }
}