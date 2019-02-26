package main;

public class Main {
    public static void main(String[] args) {
        System.out.println("Salut");

        char c = 'a';
        //c = (char)((int)c + 1);
        c += 1;
        System.out.println(c);

        int x = 0541; //baza 8
        System.out.println(x);

        int y = 0xff;
        System.out.println(y);

        int z = 0b110101;
        System.out.println(z);

        float f = 10.5f;
        double d = 10.5;

        int sal = 3 < 5 ? 10 : 100;
        System.out.println(sal);



    }
}
