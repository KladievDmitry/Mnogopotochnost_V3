package com.bam;

import  java.util.ArrayDeque;
import java.util.Queue;

public class Buffer {
    private Queue<Integer>__buffer = new ArrayDeque<>();

    public synchronized void add(Integer i)
    {
        __buffer.add(i);
    }

    public Integer get()
    {
        return __buffer.poll();
    }
}