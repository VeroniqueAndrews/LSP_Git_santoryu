package org.howard.edu.lsp.midterm.problem2;


public class Range {
	private int lower,upper;
	
	public Range(int lower, int upper) { 
		this.lower = lower;
		this.upper = upper;

}


public boolean DoRangesOverlap(int value) {

if (value >= lower && value <= upper) {

return true;

} else {

return false;

}

}


public boolean DoRangesOverlap(Range other) {

if ((other.lower <= lower && lower <= other.upper) || (lower <= other.lower && other.lower <= upper)) {

return true;

} else {

return false;

}

}


//number of integers in the range
public int size() {

return upper - lower + 1;

}

}
