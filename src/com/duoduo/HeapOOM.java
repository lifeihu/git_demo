package com.duoduo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class HeapOOM {

	static class OOMObject{
		
	}
	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<OOMObject>();
		Iterator<OOMObject> it = list.iterator();
		while (true) {
			list.add(new OOMObject());
		}
	}
}

