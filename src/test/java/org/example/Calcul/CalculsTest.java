package org.example.Calcul;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class CalculsTest {

	private Calcul calcul;

	@BeforeEach
	public void setUp() {
		calcul = new Calcul(2, 4);
	}

	@Test
	public void testerMultiplier() {
		calcul = new Calcul(2, 4);
		int valMult = calcul.multiplier();

		assertEquals(valMult, 8);
	}

	@Test
	public void testerAdditionner() {
		calcul = new Calcul(2, 4);
		int valAdd = calcul.additionner();

		assertEquals(valAdd, 6);
	}
}