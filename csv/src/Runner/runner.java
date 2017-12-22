package Runner;

import java.io.BufferedReader;
import java.io.File;
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
		
		CSVUtilities csv = new CSVUtilities(complaint);
		
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
	
	}
}