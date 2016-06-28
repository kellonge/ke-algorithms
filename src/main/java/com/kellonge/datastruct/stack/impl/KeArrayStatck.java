package com.kellonge.datastruct.stack.impl;

import com.kellonge.datastruct.stack.KeStatck;
import com.kellonge.datastruct.stack.StatckOverFlowException;
import com.kellonge.datastruct.stack.StatckUnderFlowException;

/**
 * Created by kellonge on 16/6/29.
 */
public class KeArrayStatck implements KeStatck {

    private Object[] data = new Object[0];
    private int      top  = 0;

    public KeArrayStatck(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("需要指定大于0的初始化大小");
        }
        data = new Object[size];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void push(Object o) {
        if (top == data.length) {
            throw new StatckOverFlowException();
        }
        data[top++] = o;
    }

    public Object pop() {
        if (top == 0) {
            throw new StatckUnderFlowException();
        }
        return data[--top];
    }
}
