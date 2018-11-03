package psr;

public class Paper extends Tool{
	
	public Paper(int strength) {
		super();
		this.setType('p');
	}
	


	public boolean fight(Scissors s) {
		int p_strength = this.getStrength()/2;
		int s_strength = s.getStrength();
		
		return p_strength > s_strength ? true : false;
	}
	
	public boolean fight(Rock r) {
		int p_strength = this.getStrength()*2;
		int r_strength = r.getStrength();
		
		return p_strength > r_strength ? true : false;
	}
}
