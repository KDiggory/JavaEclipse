package com.qa.mementoDesign2;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
	
	private List<Memento> mementoList= new ArrayList<Memento>();
	
	public void add(Memento m) {
		mementoList.add(m);
	}
	
	public Memento get(int id) {
		return mementoList.get(id);
	}

	@Override
	public String toString() {
		return "Caretaker [mementoList=" + mementoList + "]";
	}
		
   }
	
		

	


