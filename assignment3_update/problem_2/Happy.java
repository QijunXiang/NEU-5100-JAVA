package problemTwo;

public class Happy extends Moody {
	protected String getMood() {
		return new String("I feel happy today");
	}
	
	public String toString() {
		return new String("Observation: Subject laughs a lot");
	}
	public void expressFeelings() {
		System.out.println("hehehe...hahahah...HAHAHAHAHA!!!");
	}
}
