package problemTwo;

public class Sad extends Moody {
	protected String getMood() {
		return new String("I feel sad today");
		
	}
	public String toString() {
		return new String("Observation: Subject cries a lot");
	}
	public void expressFeelings() {
		System.out.println("\'wah\' \'boo boo\' \'weep\' \'sob\' \'weep\'");
	}
}
