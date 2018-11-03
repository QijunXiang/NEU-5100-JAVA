package psr;

public class MyIndexOutOfBoundException extends Exception {
	private int index;
	private int lowerBound;
	private int upperBound;
	
	public MyIndexOutOfBoundException(int index, int lo, int up) {
		this.index = index;
		lowerBound = lo;
		upperBound = up;
		
	}
	
	@Override
	public String toString() {
		String rs = String.format("Error Message: Index: %d, but Lower bound: %d, Upper bound: %d", this.index, this.lowerBound,this.upperBound);
		return rs;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = 10;
		int lo = 0;
		int up = 9;
		try {
			if(index > up || index < lo)
			throw new MyIndexOutOfBoundException(index, lo, up);
		} catch (MyIndexOutOfBoundException e) {
			System.out.println(e);
		}

	}

}
