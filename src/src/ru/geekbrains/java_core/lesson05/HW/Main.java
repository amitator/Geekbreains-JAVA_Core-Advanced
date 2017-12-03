package ru.geekbrains.java_core.lesson05.HW;

import java.util.Arrays;

public class Main {
    static final int size = 10000000;
    static final int half = size / 2;


    public static void main(String[] args) {
        float [] arr = new float[size];
        float [] a1 = new float[half];
        float [] a2 = new float[half];
        Arrays.fill(arr, 1);

        System.arraycopy(arr, 0, a1, 0, half);
        System.arraycopy(arr, half, a2, 0, half);

        //Counting time for main thread
        long a = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println(System.currentTimeMillis() - a);

        //Reinitializing array
        Arrays.fill(arr, 1);

        a = System.currentTimeMillis();

        Thread thread1 = new Thread(new Runnable() {
            long a = System.currentTimeMillis();
            @Override
            public void run() {
                for (int i = 0; i < half; i++) {
                    arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                System.out.println(Thread.currentThread().getName() + " finished in " + (System.currentTimeMillis() - a));
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            long a = System.currentTimeMillis();
            @Override
            public void run() {
                for (int i = half; i < size; i++) {
                    arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                System.out.println(Thread.currentThread().getName() + " finished in " + (System.currentTimeMillis() - a));
            }
        });

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, arr, 0, half);
        System.arraycopy(a2, 0, arr, half, half);

        System.out.println(Thread.currentThread().getName() + " finished at " + (System.currentTimeMillis() - a));
    }
}
