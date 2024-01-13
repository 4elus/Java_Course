package com.stream.lesson1;



public class Function {
    public static void main(String[] args) {
        int number = 123; //321

        System.out.println(rotateNumber(number));
    }

    public static int rotateNumber(int n){
        String res = "";
        while (n > 0){
            int t = n % 10;
            res += t;
            n = n / 10;
        }
        return Integer.parseInt(res); // Конвертация типов данных. Из строки сделали число!
    }

    public static void plus(int a, int b){
        System.out.println(a+b); // выводит значение
    }

    public static int newPlus(int a, int b){
        return a+b; // возвращает значение
    }
}
