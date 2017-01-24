package com.vbm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Enrter expression: ");
        Scanner inp = new Scanner(System.in);
        try {
            System.out.println(Espresso.calculus(inp.next()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
