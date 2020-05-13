package day2_session1_2;

import static org.junit.Assert.*;

import org.junit.Test;

import day2_session1_2.BugatiVeyron;
import day2_session1_2.Movable;
import day2_session1_2.MovableAdapter;
import day2_session1_2.MovableAdapterImpl;

public class MovableAdapterImplTest {

	@Test
	public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
		Movable astonMartin = new BugatiVeyron();
		MovableAdapter astonMartinAdapter=new MovableAdapterImpl(astonMartin);
		assertEquals(astonMartinAdapter.getSpeed(), 431.30312, 0.00001);
	}
	@Test
	public void whenConvertingDOLLARToEURO_thenSuccessfullyConverted() {
		Movable astonMartin = new BugatiVeyron();
		MovableAdapter astonMartinAdapter=new MovableAdapterImpl(astonMartin);
		assertEquals(astonMartinAdapter.getPrice(), 18400.0, 0.01);
	}

}
