package constructors;

import java.util.*;

public class PrintSetGet {
	

	public static void main(String[] args) {
		PractiseSetGet printSetGet = new PractiseSetGet();
		
		// Set the name.
		printSetGet.setName("USFCA");
	
		// Set the number.
		printSetGet.setNumber(9);
		System.out.println(printSetGet.getName() + " stands " + printSetGet.getNumber() + "th in the MSCS studies.");
		
		// Settings and getting the titles.
		List<String> titles1 = new ArrayList<>(Arrays.asList("Name", "Address", "Email", "Job"));
        printSetGet.setListTitles(titles1);
        System.out.println("Titles are:" + printSetGet.getListTitles());
		        
		// Setting and getting the scores.
		ArrayList<Integer> scores = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));
		scores.add(6);
		printSetGet.setScores(scores);
		System.out.println("Scores available:" + printSetGet.getScores());
	}

}
