package org.example.Calcul;

import static org.junit.Assert.fail;

import org.junit.Test;

public class CalculsTest {
	
    @Test
    public void testMultiplier() {

    }

    @Test
    public void testAdditionnerFail() {
    	if (5*2 != 654) {
    		fail("CA MARCHE Po");
    	}
    }

}
