package Runner;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class runner {
	public static void main(String[]args)
	{
		List<complaint> complaints = readBooksFromCSV("complaint.csv");
		// let's print all the person read from CSV file 
		for (complaint b : complaints) 
		{ 
			System.out.println(b); 
		} 
	} 
	private static List<complaint> readBooksFromCSV(String fileName)
	{
		List<complaint> complaints = new ArrayList<>();
		Path pathToFile = Paths.get(fileName);
		// create an instance of BufferedReader
		// using try with resource, Java 7 feature to close resources
		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII))
		{ 
			// read the first line from the text file
			String line = br.readLine();
			// loop until all lines are read 
			while (line != null) 
			{ 
				// use string.split to load a string array with the values from 
				// each line of 
				// the file, using a comma as the delimiter 
				String[] attributes = line.split(",");
				complaint complaint = createcomplaint(attributes);
				// adding book into 
				complaints.add(complaint);
				// read next line before looping
				// if end of file reached, line would be null 
				line = br.readLine();
			} 
		}
	
		catch (IOException ioe) 
		{
			ioe.printStackTrace();
		}
		return complaints;
	} 
	private static complaint createcomplaint(String[] metadata) 
	{ 
		int number = Integer.parseInt(metadata[0]);
		String status = metadata[1];
		String date = metadata[2];
		int housenum=Integer.parseInt(metadata[3]);
		String street=metadata[4];
		// create and return book of this metadata 
		return new complaint(number,status,date,housenum,street);
	} 
}
 class complaint{ 
	private int number;
	private String status;
	private String date;
	private int housenum;
	private String street;
	
	public complaint(int number, String status, String date,int housenum,String street) 
	{
		this.number = number; 
		this.status = status;
		this.date = date;
		this.housenum=housenum;
		this.street=street;
	} 
	public int getcomplaintnum()
	{
		return number;
	}
	public String getStatus()
	{
		return status;
	}
	public void setStatus(String status)
	{ 
		this.status = status;
	}
	public String getdate()
	{ 
		return date;
	} 
	public int gethousenum()
	{
		return housenum;
	}
	public String getstreet()
	{
		return street;
	}
	@Override 
	public String toString()
	{
		return "complaint [complaint#: " + number + ", status: " + status + ", date: " + date +", house#: "+ housenum+", street: "+street+ "]";
	}
}
