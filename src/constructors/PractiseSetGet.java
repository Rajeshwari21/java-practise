package constructors;

import java.util.ArrayList;
import java.util.List;

public class PractiseSetGet {
	private int number;
	private String name;
	private List<String> listTitles;
	private ArrayList<Integer> scores;
	
	public int getNumber() {
		return this.number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Integer> getScores() {
		return this.scores;
	}
	
	 
    public void setListTitles(List<String> titles) {
    	this.listTitles = titles;
    }
    
    public List<String> getListTitles() {
        return this.listTitles;
    }
    
    public void setScores(ArrayList<Integer> scores) {
    	this.scores = scores;
    }
 
   public void displayScores() {
	   System.out.println("Scores available are:" );
	   for (int i =0; i<this.scores.size(); i++) {
		   System.out.println(this.scores.get(i));
	   }
   }
}
