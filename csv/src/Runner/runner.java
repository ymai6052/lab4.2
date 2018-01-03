package Runner;

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
	public static void main(String[]args)
	{
		File complaint = new File("complaint.csv");
		
		CSVUtilities csv = new CSVUtilities("complaint.csv");
		
		List<String> heading = csv.getColumnHeaders();
		for (String x: heading) 
		{
			System.out.println(x);
		}
		
		List<Integer> complaintnum = CSVUtilities.getDataInt(1);
		for(int x : complaintnum)
		{
			System.out.print(x+ " ");
		}
		List<String> status = CSVUtilities.getDataString(2);
		for(String x : status)
		{
			System.out.print(x+ " ");
		}
		List<Integer> housenum = CSVUtilities.getDataInt(3);
		for(Integer x : housenum)
		{
			System.out.print(x+ " ");
		}
		List<String> street = CSVUtilities.getDataString(4);
		for(String x : street)
		{
			System.out.print(x+ " ");
		}
	}
}