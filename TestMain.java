import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import java.io.*;

/**
 *
 * @author  Aronson
 */
public class TestMain
{
    public static void main(String args[]) {
        TestMain test = new TestMain();
        test.testMoveBackward();
    }

    @Test
    public void testMoveBackward() {
        Jeroo kim = new Jeroo(3,5, Directions.WEST);
        kim.moveBackward();
        Directions.CompassDirection dir = kim.getDirection();
        Map.getInstance().printMap();
        assertEquals(5, kim.getY());
        assertEquals(4, kim.getX());
        assertEquals(Directions.WEST, dir);
    }


}
