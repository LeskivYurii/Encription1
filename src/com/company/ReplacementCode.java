package com.company;

public class ReplacementCode {
    char[] key ={'s','x','z','c','v','b','n','l','f','g','h','j','q','w','e','r','a','d','p','t','i','y','u','o','m','k'};
    char[] abc = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public ReplacementCode() {
    }

    public void Encryption(String message) {
        char[] arr = message.toLowerCase().toCharArray();
        for(int indexArr = 0;indexArr<message.length();indexArr++) {
            int i = 0;
            if(arr[indexArr]==' ')++indexArr;
            for(; arr[indexArr]!=abc[i];i++) {
                if(arr[indexArr]==abc[i])arr[indexArr]=key[i];
            }
            if(arr[indexArr]==abc[i])arr[indexArr]=key[i];
        }
        System.out.println(arr);
        Decryption(arr);
    }

    public void Decryption(char[] arr) {
        for(int indexArr = 0;indexArr<arr.length;indexArr++) {
            int i = 0;
            if(arr[indexArr]==' ')++indexArr;
            for(; arr[indexArr]!=key[i];i++) {
                if(arr[indexArr]==key[i])arr[indexArr]=abc[i];
            }
            if(arr[indexArr]==key[i])arr[indexArr]=abc[i];
        }
        System.out.println(arr);
    }
}
