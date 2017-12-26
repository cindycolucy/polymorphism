package ohMy;

import java.util.Iterator;

public class OhMyIterator implements Iterator<String> {

	String[] values = {"lions", "tigers", "bears"};
	int index = 0;
	
	@Override//This is misleading, it's really *implementing*
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return index < values.length;
	}

	@Override
	public String next() {
		//would usually be: return values[index++];
		String nextValue = values[index];
		index++;
		return nextValue;
	}

}
