/*
 * File: PostalLookup.java
 * --------------------------------
 * This program displays the name of a state given its two-letter postal abbreviation.
 */

import java.util.*;

import acm.program.*;

/**
 * This program finds the name corresponding to a two-letter
 * abbreviation of a state.
 */
public class PostalLookup extends ConsoleProgram {

	public void run() {
		HashMap<String,String> stateMap = new HashMap<String,String>();
		initStateMap(stateMap);
		while (true) {
			String code = readLine("Enter two-letter state abbreviation: ");
			// Your code starts here
			
			// Your code ends here
		}
	}

	private void initStateMap(HashMap<String,String> map) {
		map.put("AL", "Alabama");
		map.put("AK", "Alaska");
		map.put("AZ", "Arizona");
		map.put("FL", "Florida");
		map.put("GA", "Georgia");
		map.put("HI", "Hawaii");
		map.put("WI", "Wisconsin");
		map.put("WY", "Wyoming");
	}

}