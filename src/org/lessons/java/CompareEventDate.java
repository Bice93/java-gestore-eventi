package org.lessons.java;

import java.util.Comparator;

public class CompareEventDate implements Comparator<Evento> {

	@Override
	public int compare(Evento o1, Evento o2) {
		return o1.getData().compareTo(o2.getData());
	}

}
