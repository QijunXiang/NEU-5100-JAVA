package psr;

public class Interval {
	int start;
	int end;
	Interval() { start = 0; end = 0; }
	Interval(int s, int e) { start = s; end = e; }
	
	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
	    if (!(o instanceof Interval)) {
	      return false;
	    }
	    Interval cc = (Interval)o;
	    return this.start == cc.start && cc.end == this.end;
	 }
}
