package org.example;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Unit test for simple App.
 */
public class AppTest 
{

    /**
     * Rigorous Test :-)
     */
    @Test
    public void avg() {
        App ob = new App();
        assertEquals(2,ob.avg(1,2,3));
    }

}
