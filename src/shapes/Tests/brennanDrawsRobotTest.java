package shapes.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import shapes.Model.brennanDrawsRobot;

public class brennanDrawsRobotTest {

	private brennanDrawsRobot myRobotTester;
	
	@Before
	public void setUp() throws Exception {
		myRobotTester = new brennanDrawsRobot();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testRobotExists() {
		assertNotNull(myRobotTester);
	}

	@Test
	public void testCalculateAngle() {
		assertEquals(90, myRobotTester.calculateAngle(4));
	}

}
