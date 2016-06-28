package com.kellonge.datastruct.stack;

/**
 * Created by kellonge on 16/6/28.
 */
public interface KeStatck {

    /**
     * 是否为空
     * @return 为空返回 true 否则 false
     */
    boolean isEmpty();

    /**
     * 插入栈
     * @param o 要插入的数据
     * @throws StatckOverFlowException  
     */
    void push(Object o);

    /**
     * 获取栈元素
     * @return 获取是值
     * @throws StatckUnderFlowException
     */
    Object pop();
}
