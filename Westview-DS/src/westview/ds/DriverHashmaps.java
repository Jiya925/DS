package westview.ds;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DriverHashmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap m = new HashMap<String, String>();
		
		//adding entries to our map ("dictionary")
		m.put("nice", "meam");
		m.put("motivated", "lazy");
		m.put("rich", "poor");
		
		//query the map for a non-existing key
		System.out.println(m.get("sunny"));
		
		//query map for smth that exists
		System.out.println(m.get("motivated"));
		
		System.out.println(m.size());
		
		HashMap m2 = new HashMap<String, ArrayList<String>>();
		
		//list of fav food
		ArrayList<String> food = new ArrayList<String>();
		food.add("Pasta");
		food.add("Coffee");
		food.add("Cake");
		food.add("Boba");
		
		m2.put("Jiya", food);
		
		System.out.println(m2.get("Jiya"));
		
		
		
		//Get the scanner going to read the csv file
		try {

		    Scanner scanner = new Scanner(new File("covid417.csv"));
		    HashMap states = new HashMap<String, ArrayList<City>>();
		    ArrayList<City> cities = new ArrayList<City>();
		    
		    while(scanner.hasNextLine()) {
		    	String[] row = scanner.nextLine().split(",");
		    	City city = new City();
		    	city.setName(row[1]);
		    	city.setConfirmed(Integer.valueOf(row[2]));
		    	city.setDeaths(Integer.valueOf(row[3]));
		    	city.setRecovered(Integer.valueOf(row[4]));
		    	city.setActive(Integer.valueOf(row[5]));
		    	states.put(row[0], city);
		    	
		    }
		    scanner.close();
		    
		    //User input 
		    while(true){
		    	
		    }
		    
		} catch (FileNotFoundException e) {

			System.out.println(e);
			
		}

	}

}