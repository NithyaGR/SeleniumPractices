package inteviewPracticePrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountCharsInString {

	public static void main(String[] args) {
					
			String str ="totalqa";
			Map<Character,Integer> map  = new HashMap<Character,Integer>();
			for(int i = 0;i<str.length();i++)
			{
				System.out.println(str.charAt(i));
			 
				if(map.get(str.charAt(i))==null)
				{
					map.put( str.charAt(i),1);
					System.out.println(map);
				}
				else
				{	 
					map.put(str.charAt(i),map.get(str.charAt(i))+1);
					System.out.println("Printing charAT "+str.charAt(i));
					System.out.println("Printing mapGet "+map.get(str.charAt(i)));
				}
			}
			System.out.println("size is " + map.size());
			Set<Character> set = map.keySet();
			Iterator<Character> it=set.iterator();
			 
			while(it.hasNext())
			{
				Character ch= it.next();
				System.out.println(ch + " -- "+map.get(ch));	 
				 
			}
		}

	}


