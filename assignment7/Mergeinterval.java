package psr;

import java.util.LinkedList;
import java.util.List;

public class Mergeinterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public List<Interval> merge(List<Interval> intervals) {
	        List<Interval> rs = new LinkedList<>();
	        if(intervals.size() <= 1) return intervals;
	
	        intervals.sort((i1, i2)->Integer.compare(i1.start, i2.start));
	        int lastIndex = -1;
	                        
	        for(Interval interval : intervals) {
	            if(rs.isEmpty() || interval.start > rs.get(lastIndex).end) {
	                rs.add(interval);
	                lastIndex++;
	            } else {
	                rs.get(lastIndex).end = Math.max(rs.get(lastIndex).end, interval.end);
	            }
	        }
	        return rs; 
   }
}
