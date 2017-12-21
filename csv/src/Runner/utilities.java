package Runner;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class utilities {
	ArrayList<String> CSVData;
	int numColumns;
	//Constructor accepts a File and reads all the data into CSVData
	//initializes numColumns based on length of the first array
	public CSVUtilities(File csv)
	{
		Path pathtofile=Paths.get("complaint.csv");
		BufferedReader br=Files.newBufferedReader(pathtofile, StandardCharsets.US_ASCII));
		String line = br.readLine();
		while (line != null) 
		{ 
			String[] attributes = line.split(",");
			line = br.readLine();
		} 
	}
	
	//Return an ArrayList with the headers for each column
	public List<String> getColumnHeaders()
	{
		
	}
	
	//Return an ArrayList with the data for a column specified
	public List<String> getDataString(int column)
	{
		
	}
	
	//Return an ArrayList with the data converted to Integer
	public List<Integer> getDataInt(int column)
	{
		
	}
	
	//Return an ArrayList with the data converted to Double
	public List<Double> getDataDouble(int column)
	{
		
	}
}
