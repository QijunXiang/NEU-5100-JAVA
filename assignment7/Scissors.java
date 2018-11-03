package psr;

public class Scissors extends Tool{

	public Scissors(int strength) {
		super();
		this.setStrength(strength);
		this.setType('s');
	}


	public boolean fight(Rock r) {
		int s_strength = this.getStrength()/2;
		int r_strength = r.getStrength();
		
		return s_strength > r_strength ? true : false;
	}
	
	public boolean fight(Paper p) {
		int s_strength = this.getStrength()*2;
		int p_strength = p.getStrength();
		System.out.println(s_strength);
		return s_strength > p_strength ? true : false;
	}
}
