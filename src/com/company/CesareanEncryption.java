package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CesareanEncryption {

    public void Encryption(String message) {
        Random r = new Random();
        char[] arr = message.toLowerCase().toCharArray();
        List<Character> arr2 = new ArrayList<>();
        int key;
        char ch;
        key = r.nextInt(10) + 1;

        for (int i = 0; i < message.length(); ++i) {
            ch = arr[i];
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch + key);
                if (ch > 'z') {
                    ch = (char) (ch - 'z' + 'a' - 1);
                }
                arr2.add(ch);
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + key);
                if (ch > 'Z') {
                    ch = (char) (ch - 'Z' + 'A' - 1);
                }
                arr2.add(ch);
            } else {
                arr2.add(ch);
            }
        }
        for (Character s: arr2) {
            System.out.print(s);
        }
        decrypt(arr2, key);
    }


    public static void decrypt(List<Character> message, int key) {
        char ch;
        List<Character> dec = new ArrayList();
        for (int i = 0; i < message.size(); ++i) {
            ch = message.get(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - key);
                if (ch < 'a') {
                    ch = (char) (ch + 'z' - 'a' + 1);
                }
                dec.add(ch);
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch - key);
                if (ch < 'A') {
                    ch = (char) (ch + 'Z' - 'A' + 1);
                }
                dec.add(ch);
            } else {
                dec.add(ch);
            }
        }
        System.out.println();
        for (Character s: dec) {
            System.out.print(s);
        }
    }
}
