package com.itsol;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai4 {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi bất kỳ: ");
        String s = new Scanner(System.in).nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(s);

        String max, lengthStringTokenizer;
        int i = 1, viTriMax = i;
        max = stringTokenizer.nextToken();

        while (stringTokenizer.hasMoreTokens()){
            lengthStringTokenizer = stringTokenizer.nextToken();
            i++;
            if (max.length() < lengthStringTokenizer.length()){
                max = lengthStringTokenizer;
                viTriMax = i;
            }
        }

        System.out.println("Từ dài nhất trong chuỗi có độ dài là: " + max + " và xuất hiện tại vị trí: " + viTriMax);
    }
}
