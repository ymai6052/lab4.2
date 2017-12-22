package Runner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVUtilities {
	private static ArrayList<String> CSVData;
	int numColumns;
	//Constructor accepts a File and reads all the data into CSVData
	//initializes numColumns based on length of the first array
	public CSVUtilities(File csv)
	{
		FileReader csv2 = null;
		try {
			csv2 = new FileReader(csv);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try (BufferedReader br = new BufferedReader(csv2)) {
			String line = br.readLine();
			while (line != null) {
				CSVData.add(line);
				line = br.readLine();
			}
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		this.numColumns = getColumnHeaders().size();
	}
	
	//Return an ArrayList with the headers for each column
	public List<String> getColumnHeaders()
	{
		return Arrays.asList(CSVData.get(0).split(","));
	}
	
	//Return an ArrayList with the data for a column specified
	public List<String> getDataString(int column)
	{
		List<String> dataString=new ArrayList<String>();
		for (int i = 1; i < CSVData.size(); i++) {
			String[] row = CSVData.get(i).split(",");
			dataString.add(row[column]);
		}
		return dataString;
	}
	
	//Return an ArrayList with the data converted to Integer
	public static List<Integer> getDataInt(int column)
	{
		List<Integer> dataInt=new ArrayList<Integer>();
		for (int i = 1; i < CSVData.size(); i++) {
			String[] row = CSVData.get(i).split(",");
			Integer data= Integer.parseInt(row[column]);
			dataInt.add(data);
		}
		return dataInt;
	}
	
	//Return an ArrayList with the data converted to Double
	public List<Double> getDataDouble(int column)
	{
		List<Double> dataDouble=new ArrayList<Double>();
		for (int i = 1; i < CSVData.size(); i++) {
			String[] row = CSVData.get(i).split(",");
			Double data= Double.parseDouble(row[column]);
			dataDouble.add(data);
		}
		return dataDouble;
	}
}
