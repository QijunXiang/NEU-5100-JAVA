package problemTwo;

public class RunMoodyTest {
	public static void main(String[] args) {
		Psychiatrist p = new Psychiatrist();
		Happy h = new Happy();
		Sad s = new Sad();
		p.examine(h);
		p.observe(h);
		System.out.println();
		p.examine(s);
		p.observe(s);
		
	}
}
