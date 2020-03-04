package org.example;


import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{



    public static void main( String[] args )
    {
        Cow cow1 = new Cow("Brown","short","two","Black/brown");
        Rhino rhino1 = new Rhino("blue","long","one",100);

        System.out.println(cow1.toString());
        System.out.println(rhino1.toString());
        System.out.println(cow1.eat("grass and ","barley"));
        System.out.println(rhino1.getSpeed());

    }
}
