package main;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*String S = scan.nextLine();
        System.out.println(S);

        if(S.length() % 2 == 0) System.out.println("E lungime para");
            else System.out.println("E lungime impara");


        int x = scan.nextInt();
        int count = 1, fact = 1;
        while(count <= x)
        {
            fact = fact * count;
            count++;
        }
        System.out.println("Factorialul este " + fact);*/

        int nr = scan.nextInt();
        boolean prim = true;
        for(int i = 2; i < nr/2; i++)
        {
            if(nr % i == 0) prim = false;
        }
        System.out.println(prim);

    }
}
