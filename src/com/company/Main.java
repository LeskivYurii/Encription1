package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String arr;
        System.out.println("Введіть повідомлення для шифрування");
        arr = sc.nextLine();
        ReplacementCode rc = new ReplacementCode();
        System.out.println("Введене повідомлення: "+arr);
        System.out.println("Метод зміни шифру");
        rc.Encryption(arr);
        VerticalPermutationCode vpm = new VerticalPermutationCode();
        System.out.println("Шифр вертикальної перестановки");
        vpm.Encryption(arr);
        CesareanEncryption ce = new CesareanEncryption();
        System.out.println();
        System.out.println("Шифр Цезаря");
        ce.Encryption(arr);
    }

}
