package db;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class CountryIO {

	// This class represents I/O to and from our
	// countries.txt file.
	// We will store the countries in an ArrayList
	// named countries and will write that list to
	// counties.txt whenever we change the list.

	// Reference Page 481 - ProductTextFile for an example.
	private List<String> countries = null;
	private Path countriesPath = null;
	private File countriesFile = null;
	// no need for a field separator as this list only contains Strings 
	
	public CountryIO() {
		countriesPath = Paths.get("countries.txt");
		countriesFile = countriesPath.toFile();
			//TODO populate list of countries 
	}
	
	public List<String> getCountries(){
		// only read the countries.txt file if countries is null
		if (countries == null) {
			countries = new ArrayList<String>();
			if (Files.exists(countriesPath)) {
				try (BufferedReader in = new BufferedReader(
										 new FileReader(countriesFile))){
					
					String line = in.readLine();
					while (line != null) {
						countries.add(line);
						line = in.readLine();
						
					}
				}  catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				// create the file 
				try {
					Files.createFile(countriesPath);
					System.out.println("**  countries file created!");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		return countries;
		
	} /* get countries  */
	
	public boolean saveCountries() {
		boolean success = false;
		try (PrintWriter out = new PrintWriter(
							   new BufferedWriter(
							   new FileWriter(countriesFile)))){
			//write all countris from our list to the file 
			for (String country: countries) {
				out.println(country);
			}
			success = true;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return success;
		
	}
	public void addCountry(String country) {
		countries.add(country);
		saveCountries();
	}
}
