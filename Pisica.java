package main;

public class Pisica {
    String name;
    String colour;

    public Pisica(String name, String colour)
    {
        this.colour = colour;
        this.name = name;
    }

    public Pisica()
    {

    }

    public void print()
    {
        System.out.println("Colour is " + this.colour + " and name is " + this.name);
    }

    public static void main(String[] args) {

        Pisica cat1 = new Pisica("Gogu", "Black");
        cat1.print();

    }

}
