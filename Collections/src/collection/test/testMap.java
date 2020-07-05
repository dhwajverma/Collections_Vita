package collection.test;

import com.dhwaj.utils.map.*;;


public class testMap {
	public static void main(String args[])
	{
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		map.put("Dhwaj", 29);
		map.put("Harsh", 28);
		map.put("Sarang", 26);
		map.put("Naman", 27);
		
		System.out.println("Age of Dhwaj=="+map.get("Dhwaj"));
		System.out.println("Age of Sarang=="+map.get("Sarang"));
		System.out.println(map);
		
	}
}
