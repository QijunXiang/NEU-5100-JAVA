package psr;

public class Rock extends Tool{
	
	
	public Rock(int strength) {
		super();
		this.setStrength(strength);
		this.setType('r');
	}
	
	public boolean fight(Paper p ) {
		int r_strength = this.getStrength()*2;
		int p_strength = p.getStrength();
		
		return r_strength > p_strength ? true : false;
		
	}
	
	public boolean fight(Scissors s) {
		int r_strength = this.getStrength()/2;
		int s_strength = s.getStrength();
		
		return r_strength > s_strength ? true : false;
	}
	

}
