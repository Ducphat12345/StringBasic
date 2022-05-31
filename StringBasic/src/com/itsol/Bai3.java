package com.itsol;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi bất kỳ: ");
        String s = new Scanner(System.in).nextLine();
        char[] charArray = s.toCharArray();
        boolean check = true;

        for (int i = 0; i < charArray.length; i++) {
            if(Character.isLetter(charArray[i])) {
                if (check){
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    check = false;
                }
            }
            else {
                check = true;
            }
        }

        s = String.valueOf(charArray);
        System.out.println(s);
    }
}
