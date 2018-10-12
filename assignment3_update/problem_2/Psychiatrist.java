package problemTwo;

public class Psychiatrist {
	public void examine(Moody m) {
		System.out.println("How are you feeling today?");
		System.out.println(m.getMood());
		System.out.println();
		m.expressFeelings();
	}
	public void observe(Moody m) {
		System.out.println(m.toString());	
	}
	
}