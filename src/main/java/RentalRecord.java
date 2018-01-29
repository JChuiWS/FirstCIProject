
public class RentalRecord {

	private  String carModel;
	private String month;
	private double mRev;
	private int rDuration;
	
	public RentalRecord() {}
	
	public RentalRecord(String mod, String m, double rev, int duration){
		carModel = mod;
		month = m;
		mRev = rev;
		rDuration = duration;
	}
	
	public String getModel() {
		return carModel;
	}
	
	public String getMonth() {
		return month;
	}
	
	public double getRevenue() {
		return mRev;
	}
	
	public int getDuration() {
		return rDuration;
	}
	
		
}
