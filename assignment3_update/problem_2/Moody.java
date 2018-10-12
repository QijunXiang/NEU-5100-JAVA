
package problemTwo;

public abstract class Moody {
	protected String getMood() {
		throw new RuntimeException("Depending on which object sends the message");
	}
	public void queryMood() {
		
	}
	protected void expressFeelings() {
		throw new RuntimeException("Depending on which object sends the message");
	}
	
}


