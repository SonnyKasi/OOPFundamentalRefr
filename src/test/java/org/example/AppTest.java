package org.example;

import org.junit.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Before
    public void setUp() throws Exception {
        Cow cow1 = new Cow("two eyes","long tail","two horns","black/white");
        Rhino rhino = new Rhino("two eyes","short tail","one horn",100);
    }

    @After
    public void tearDown() throws Exception {

    }



    @Test
    public void movementOftheAnimal(){

        String res = Cow.move("walk ", "runs");
       assertEquals("walk runs",res);

    }

    @Test
    public void animalDiet(){
        String res1 = Cow.eat("grass ","barley");
        assertEquals("grass barley",res1);

    }

    @Test
    public void animalSound(){
        String res2 = Cow.sound("Mooo", "moooo");
        assertEquals("Mooomoooo",res2);
    }

    @Test
    public void animalSpeed(){

        int i = 0;
        i = Rhino.speed();
        assertEquals(100,i);

    }

    @Test
    public void animalFeatures(){
        String res4 = null;

        Cow cow1 = new Cow("two eyes","long tail","two horns","black/white");
        res4 = cow1.toString();
        //Rhino rhino = new Rhino("two eyes","short tail","one horn",100);

        assertEquals(cow1.toString(),res4);
    }



}
