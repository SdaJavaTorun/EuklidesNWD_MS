package com.java.euklidesnwd;

public class Main {

    public static int NWD (int a, int b){
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }return a;
    }

    public static void main(String[] args) {
        System.out.println("Najwięszy wspólny dzielnik to : " + Main.NWD(20,40));
    }
}
