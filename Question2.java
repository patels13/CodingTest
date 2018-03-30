package question2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Solution2 {
	public static void main(String[] args){
		ArrayList<Integer> C1=new ArrayList<Integer>();
		Collections.addAll(C1,1,2,3,4,5,6,7,8,9,10);
		Collections.shuffle(C1);
		
		ArrayList<Integer> C2=new ArrayList<Integer>();
		Collections.addAll(C2, 6,7,8,9,10,11,12,13,14,15);
		Collections.shuffle(C2);
		

		String output="Collection 1:";
		for (int i=0;i<C1.size();++i){
			output+=" "+ Integer.toString(C1.get(i));
		}
		
		System.out.println(output);
		

		output="Collection 2:";
		for (int i=0;i<C2.size();++i){
			output+=" "+Integer.toString(C2.get(i));
		}
		
		System.out.println(output);
		
		System.out.println("Collection 1 Size: "+ C1.size());
		System.out.println("Collection 2 Size: "+C2.size());
		
		//I wasn't sure if you wanted a raw implementation of 
		//sort or just use the library functions. If 
		//I were to do a raw implementation, I would do 
		//mergesort.
		Collections.sort(C1);
		Collections.sort(C2);
		ArrayList<Integer> C3=new ArrayList<Integer>();
		int i=0;
		int j=0;
		while (i!=C1.size() && j!=C2.size()){
			if (C1.get(i)==C2.get(j)){
				C3.add(C1.get(i));
				i++;
				j++;
			}
			else if (C1.get(i)<C2.get(j)){
				C3.add(C1.get(i));
				i++;
			} 
			else{
				C3.add(C2.get(j));
				j++;
			} 
			
		}
		
		while (j!=C2.size()){
			C3.add(C2.get(j));
			j++;
		}
		
		C3.remove(C3.get((C3.size()-1)/2));  
		output= "Collection 3:";
		for (i=C3.size()-1;i>-1;--i){
			output+=" "+Integer.toString(C3.get(i));
		}
		System.out.println(output);
		System.out.println("Collection 3 Size: "+C3.size());
		
		HashMap<String, Integer> KV=new HashMap<String, Integer>();
		for (i=0;i<5;++i){
			KV.put("Sample"+Integer.toString(i), i);
		}
		
		if (KV.containsKey("Sample0")){
			System.out.println("Key: Sample0"+", Value:"+KV.get("Sample0")+" already exists.");
		}
		else{
			KV.put("Sample0",0);
		}
		
		for (String k:KV.keySet()){
			System.out.println("KEY:"+k+", Value:"+Integer.toString(KV.get(k)));
		}
		System.out.println("KEY VALUE COLLECTION SIZE "+KV.size());
		
		//I used a HashMap for the key,value collection because of the maps' 
		//ability to store key,value pairs with unique keys and lower
		//runtime in access time
		
		
		
	}
}
