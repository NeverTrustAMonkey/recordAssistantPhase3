package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import internship.Internship;

public class InternshipTest {

    @Before
    public void setUp() throws Exception {
        Internship test = new Internship( "ACME", "14.5", 10); 
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testConstructor() {
        Internship prototype = null;
        prototype = new Internship("ARES", "10.0",5);
        assertNotNull("Item not null",prototype);
    }

}
