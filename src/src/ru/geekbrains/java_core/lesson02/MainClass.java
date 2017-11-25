package ru.geekbrains.java_core.lesson02;

public class MainClass {
    public static void main(String[] args) {
        int arrDemention = 4;
        ArrayHandler arrayHandler = new ArrayHandler();
        String [][] array = new String[arrDemention][arrDemention];

        for (int i = 0; i < arrDemention; i++) {
            for (int j = 0; j < arrDemention; j++) {
                array[i][j] = String.valueOf(i+j);
            }
        }

//        array[1][2] = "str";

        try {
            arrayHandler.handler(array);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
