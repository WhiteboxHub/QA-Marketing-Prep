package com.innovapath.programs.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SortMapByValue {

	public static void main(String[] args) {
		
			HashMap<String,String> hm=new HashMap<String,String>();
			hm.put("1","One");
			hm.put("2", "Two");
			hm.put("3","Three");
			hm.put("4","Four");
			hm.put("5","Five");
			hm.put("6","Six");
			hm.put("7","Seven");
			hm.put("8","Eight");
			hm.put("9","Nine");
			hm.put("0","Zero");
			hm.put("10","Ten");
			hm.put("11","Eleven");
			hm.put("5","Twelve");
			
			System.out.println(hm);
			
			
			System.out.println("Printing only Values");
			Set s = hm.keySet();
			Iterator<String> it = s.iterator();
			while(it.hasNext())
			{
				System.out.println(hm.get(it.next()));
			}
			
			Collection<String> s1 = hm.values();
			List<String> ls = new ArrayList<String>(s1);
			
			Collections.sort(ls, Collections.reverseOrder());
			System.out.println("Sorted Values :" +ls);
		}

	


	}


