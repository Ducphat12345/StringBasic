package com.itsol;

public class Bai1 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 100000; i < 1000000 ; i++) {
            if (check(i)){
                System.out.println(i + " ");
                count++;
            }
        }

        System.out.println("Tổng các số thuận nghịch là: " + count);
    }

    public static boolean check(int n){
        String s = String.valueOf(n);
        int size = s.length();

        for (int i = 0; i < size / 2; i++) {
            if (s.charAt(i) != s.charAt(size - i - 1)){
                return false;
            }
        }

        return true;
    }
}
