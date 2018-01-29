import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.Test;

public class RentalAnalysisTest {

	private RentalAnalysis ra = new RentalAnalysis();
	private ArrayList<RentalRecord> rList = ra.createRecords();	
		
	@Test
	public void testAveMonthlyRentalDurationHonda() {
		assertEquals("Ave Monthly Rental Dur for Honda", ra.aveMonthlyRentalDur("Honda Fit", rList), 28.0, 0.0);
	}

	@Test
	public void testAveMonthlyRentalDurationToyota() {
		assertEquals("Ave Monthly Rental Dur for Toyota", ra.aveMonthlyRentalDur("Toyota Wish", rList), 26.0, 0.0);
	}
	
	@Test
	public void testtotalRevHonda() {
		assertEquals("Total rev for Honda", ra.totalRev("Honda Fit", rList), 10497.5, 0.0);
	}
	
	@Test
	public void testtotalRevToyota() {
		assertEquals("Total rev for Toyota", ra.totalRev("Toyota Wish", rList), 12160.0, 0.0);
	}
}
