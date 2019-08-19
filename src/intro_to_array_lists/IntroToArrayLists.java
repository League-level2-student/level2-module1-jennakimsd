package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> cool = new ArrayList<String>();
		//2. Add five Strings to your list
		cool.add("pig");
		cool.add("polar bear");
		cool.add("dog");
		cool.add("giraffe");
		cool.add("cheetah");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < cool.size(); i++) {
			String s = cool.get(i);
			System.out.println(s);	
		}
		//4. Print all the Strings using a for-each loop
		for(String s : cool){
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < cool.size(); i++) {
			if (i%2==0) {
				String s = cool.get(i);
				System.out.println(s);	
			}
		}
		//6. Print all the Strings in reverse order.
		for (int i = cool.size()-1; i >= 0; i--) {
			String s = cool.get(i);
			System.out.println(s);
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < cool.size(); i++) {
			String s = cool.get(i);
			if (s.contains("e")) {
				System.out.println(s);
			}
		}
	}
}
