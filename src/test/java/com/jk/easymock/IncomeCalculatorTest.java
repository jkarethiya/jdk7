package com.jk.easymock;

import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import com.jk.jdk.core.bean.Position;

public class IncomeCalculatorTest {

	private ICalcMethod calc;
	private IncomeCalculator icalc;

	@Before
	public void setUP() {
		calc = EasyMock.createNiceMock(ICalcMethod.class);
		icalc = new IncomeCalculator();

	}

	@Test
	public void testCalc1() {
		// Setting up the expected value of the method call calc
		EasyMock.expect(calc.calc(Position.BOSS)).andReturn(500.0).anyTimes();
		EasyMock.expect(calc.calc(Position.PROGRAMMER)).andReturn(100.0);

		// Setup is finished need to activate the mock
		EasyMock.replay(calc);

		icalc.setCalcMethod(calc);

		try {
			icalc.calc();
			fail("Exception did not occur");
		} catch (RuntimeException e) {

		}
		
		icalc.setPosition(Position.BOSS);
        assertEquals(500.0, icalc.calc(), 0);
        assertEquals(500.0, icalc.calc(), 0);
        icalc.setPosition(Position.PROGRAMMER);
        assertEquals(100.0, icalc.calc(), 0);
        icalc.setPosition(Position.SURFER);
        EasyMock.verify(calc);
	}

}
