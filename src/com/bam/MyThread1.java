package com.bam;

import java.nio.Buffer;
import java.util.Random;

public class MyThread1 extends Thread{
    private final Buffer __buffer;

    public MyThread1(Buffer buffer)
    {
        __buffer = buffer;
    }

    public MyThread1(com.bam.Buffer buffer) {
    }

    @Override
    public void start() {

        try
        {
            method();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }
    private void method() throws InterruptedException{

        while (true)
        {
            int i = new Random().nextInt(100);

            __buffer.add(i);
        }
    }
    private static void podschet()
    {
        if (double sqrt)
    }
}
