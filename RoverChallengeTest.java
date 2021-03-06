
package roverchallenge;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mphephuttd
 */
public class RoverChallengeTest {
    
    public RoverChallengeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of defaultPos method, of class RoverChallenge.
     */
    @Test
    public void testDefaultPos() {
        System.out.println("defaultPos");
        Integer x = null;
        Integer y = null;
        Integer pointing = null;
        RoverChallenge instance = new RoverChallenge();
        instance.defaultPos(x, y, pointing);
      //Should the method test fail the below code will be printed. 
      //This fail call is similar throughout the entire code.
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of printPosition method, of class RoverChallenge.
     */
    @Test
    public void testPrintPosition() {
        System.out.println("printPosition");
        RoverChallenge instance = new RoverChallenge();
        instance.printPosition();
    
        fail("The test case is a prototype.");
    }

    /**
     * Test of process method, of class RoverChallenge.
     */
    @Test
    public void testProcess() {
        System.out.println("process");
        String commands = "";
        RoverChallenge instance = new RoverChallenge();
        instance.process(commands);
    
        fail("The test case is a prototype.");
    }

    /**
     * Test of controller method, of class RoverChallenge.
     */
    @Test
    public void testController() {
        System.out.println("controller");
        Character command = null;
        RoverChallenge instance = new RoverChallenge();
        instance.controller(command);

        fail("The test case is a prototype.");
    }

    /**
     * Test of moves method, of class RoverChallenge.
     */
    @Test
    public void testMoves() {
        System.out.println("moves");
        RoverChallenge instance = new RoverChallenge();
        instance.moves();

        fail("The test case is a prototype.");
    }

    /**
     * Test of turnLeft method, of class RoverChallenge.
     */
    @Test
    public void testTurnLeft() {
        System.out.println("turnLeft");
        RoverChallenge instance = new RoverChallenge();
        instance.turnLeft();

        fail("The test case is a prototype.");
    }

    /**
     * Test of turnRight method, of class RoverChallenge.
     */
    @Test
    public void testTurnRight() {
        System.out.println("turnRight");
        RoverChallenge instance = new RoverChallenge();
        instance.turnRight();

        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class RoverChallenge.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        RoverChallenge.main(args);

        fail("The test case is a prototype.");
    }
    
}
