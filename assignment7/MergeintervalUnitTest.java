package psr;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MergeintervalUnitTest {
	Mergeinterval mi = new Mergeinterval();
	
	@Test
	void TestMerge() {
		Interval a = new Interval(1,3);
		Interval b = new Interval(2,4);
		Interval c = new Interval(5,7);
		Interval d = new Interval(6,8);
		List<Interval> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.add(d);
		List<Interval> test_rs = mi.merge(list);
		
		Interval e = new Interval(1,4);
		Interval f = new Interval(5,8);
		List<Interval> expected_rs = new ArrayList<>();
		expected_rs.add(e);
		expected_rs.add(f);
		Assertions.assertIterableEquals(test_rs, expected_rs);
	}
}
