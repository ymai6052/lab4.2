package Runner;
// Yiren Mai
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class runner {
	public static void main(String[]args) throws IOException
	{
		File scores= new File("scores.csv");
		
		CSVUtilities csv = new CSVUtilities(scores);
		
		List<String> heading = csv.getColumnHeaders();
		for (String x: heading) 
		{
			System.out.println(x);
		}
		
		List<Integer>reading = CSVUtilities.getDataInt(0);
		for(int x : reading)
		{
			System.out.println(x+ " ");
		}
		List<Integer> math = CSVUtilities.getDataInt(1);
		for(Integer x : math)
		{
			System.out.println(x+ " ");
		}
		List<Integer> writing = CSVUtilities.getDataInt(2);
		for(Integer x : writing)
		{
			System.out.println(x+ " ");
		}
	}
}