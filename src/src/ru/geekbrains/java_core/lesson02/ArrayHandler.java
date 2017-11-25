package ru.geekbrains.java_core.lesson02;

public class ArrayHandler {
    private int sum;

    public void handler(String [][] arr) throws MyArraySizeException, MyArrayDataException{
        System.out.println(arr.length);
        if (arr.length != 4 || arr[0].length != 4 || arr[1].length != 4 || arr[2].length != 4 || arr[3].length != 4){
            throw new MyArraySizeException("Wrong array size");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    int tmp = Integer.parseInt(arr[i][j]);
                    sum += tmp;
                } catch (Exception e) {
                    throw new MyArrayDataException("Array has wrong data at [" + i + "][" + j + "]");
                }
            }

        }

    }
}
