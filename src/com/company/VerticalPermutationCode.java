package com.company;
import java.util.ArrayList;
import java.util.Random;

public class VerticalPermutationCode {
    int key[]= {5,3,6,1,4,2};

    public void Encryption(String message) {
        double sizes=0;
        int inPro[]=new int[10];
        int space = 0;
        ArrayList<Character> arr = new ArrayList<Character>();
        for(int i=0,x=0;i<message.length();i++) {
            if(message.charAt(i)!=' ') {
                arr.add(x,message.charAt(i));
                x++;
            }else {

                inPro[space]=(i-space-1);
                space++;
            }
        }

        System.out.println("Зашифроване повідомлення");
        int l = 1;
        for(int i = 0 ; i < 6;i++) {
            if(l ==key[i]) {
                for(int z = i; z<arr.size();z+=6) {
                    System.out.print(arr.get(z));
                }
                l++;
                i=-1;
            }else continue;
        }
        Decryption(arr,inPro,space);
    }
    public void Decryption(ArrayList arr, int[] arrSpace,int space) {
        System.out.println();
        System.out.println("Розшифроване повідомлення");
        int check = 0;
        for(int i = 0; i<arr.size();i++) {
            System.out.print(arr.get(i));
            if(check<space) {
                for(int z = 0 ;z<space;z++) {
                    if(i==(arrSpace[z])) {
                        System.out.print(' ');
                        check++;
                    }
                }
            }
        }
    }
}
