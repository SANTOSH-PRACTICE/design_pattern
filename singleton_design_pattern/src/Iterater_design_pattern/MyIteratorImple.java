package Iterater_design_pattern;

import java.util.List;

public class MyIteratorImple implements MyIterater {

	private List<User>list;
	private int length;
	private int position=0;
	
	public  MyIteratorImple(List<User>list) {
		this.list=list;
		this.length=list.size();
		
	}

	@Override
	public boolean hasNext() {
		if(position >= length)
		{
			return false;
		}
		
		return true;
	}

	@Override
	public Object next() {
		User user=list.get(position);
		position +=1;
		return user;
	}
}
