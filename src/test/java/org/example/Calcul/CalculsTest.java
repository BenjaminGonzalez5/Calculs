package org.example.Calcul;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class CalculsTest {

    private Calcul calculs = null;

    @BeforeEach
    public void setUp(){
        calculs = new Calcul(2,4);
    }

    @Test
    public void testerMultipliser(){
        int valMult = calculs.multiplier();

        assertEquals(valMult, 8);
    }

    @Test
    public void testerAdditionner(){
        int valAdd = calculs.additionner();

        assertEquals(valAdd, 6);
    }
}