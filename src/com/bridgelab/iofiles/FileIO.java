package com.bridgelab.iofiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FileIO {

	public static void main(String[] args) throws IOException {
//
//	        1..// Reading lines from file and storing in List
//	        List<String> lines = Files.readAllLines(Paths.get("D:\\sample\\employee.txt"));
//
//	        // Printing Lines Read
//	        for (String line : lines) {
//	            System.out.println(line);
//	        }

		/*
		 * 1. Write into a file 2. file ==> Override Line3 3. file ==> Append Org + new
		 * Data
		 */

//	    	List<String> somelines = new ArrayList<String>();
//
//	        somelines.add("Good Evening  ....");
//	        somelines.add("I hope you are fine?");
//	        somelines.add("Bye..");

//	        2..// Will create new file if not exist
//	        Files.write(Paths.get("D:\\sample\\Hello123.txt"), somelines, StandardOpenOption.CREATE);
//
//	        3..// Append to existing file
//	        Files.write(Paths.get("D:\\sample\\Hello123.txt"), somelines, StandardOpenOption.APPEND);
//
//	        4..// Override existing file
//	        Files.write(Paths.get("C:\\Users\\DELL\\Downloads\\Hello123.txt"), somelines, StandardOpenOption.APPEND);
//
//	        5...// Delete if a file exist
		Boolean isDeleted = Files.deleteIfExists(Paths.get("D:\\sample\\Hello123.txt"));
		System.out.println("Deleted File? " + isDeleted);
	}

}
