package com.bam;

public class Main {

    public static void main(String[] args)
    {

        Buffer _buffer = new Buffer();

        MyThread1 _myThread1 = new MyThread1(_buffer);
        MyThread2 _myThread2 = new MyThread2(_buffer);

        _myThread1.start();
        _myThread2.start();

    }
}
