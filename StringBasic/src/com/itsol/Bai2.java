package com.itsol;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi bất kỳ: ");
        String s = new Scanner(System.in).nextLine();

        String string = "";

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (i % 2 == 0){
                string += Character.toUpperCase(a);
            }
            else {
                string += Character.toLowerCase(a);
            }
        }
        System.out.println(string);
    }
}
