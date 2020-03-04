package org.example;


/**
 * Hello world!
 *
 */
public class App 
{



    public static void main( String[] args )
    {
        Cow cow = new Cow("Brown","short","two","Black/brown");
        Rhino rhino = new Rhino("blue","long","one",100);
        cow.toString();
        rhino.toString();
        cow.eat();
        rhino.eat();
    }
}
