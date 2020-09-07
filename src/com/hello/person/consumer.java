package com.hello.person;

public class consumer {

    public static void main(String[] args) {
        int[] a = new int[5];
        a[0]=1;
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        int[] b = a;
        b[1] = 4;


        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }


        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
