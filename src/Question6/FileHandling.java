package Question6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileHandling {
	
	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("C:\\Users\\Ravi\\Desktop\\Day_6_Assignment\\Core_Java_Day_6\\src\\Question6\\hello.txt");
			BufferedReader reader = new BufferedReader(file);
			String line ;
			
			while((line = reader.readLine()) != null) {
				System.out.println(line);
				
			}
			reader.close();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		// Write to a Text File:
		
		try {
			FileWriter file = new FileWriter("C:\\Users\\Ravi\\Desktop\\Day_6_Assignment\\Core_Java_Day_6\\src\\Question6\\hello.txt" , true);
			BufferedWriter writer = new BufferedWriter(file);
			
			System.out.print("Enter text to write to the file: ");
			Scanner sc = new Scanner(System.in);
			
			String text = sc.nextLine();
			writer.write(text);
			writer.newLine();
			
			
		
			writer.close();
			
			System.out.println("Text written to the file successfully.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error writing to the file: " + e.getMessage());
		}
		
		// 
		
		try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Ravi\\Desktop\\Day_6_Assignment\\Core_Java_Day_6\\src\\Question6\\hello.txt"));
            String line;
            Map<String, Integer> wordFrequency = new HashMap<>();
            int totalWords = 0;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    word = word.toLowerCase(); // Convert to lowercase for case-insensitive analysis
                    wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
                    totalWords++;
                }
            }
            reader.close();

            // Display analysis results
            System.out.println("\nAnalysis Results:");
            System.out.println("Total number of words: " + totalWords);
            System.out.println("Number of unique words: " + wordFrequency.size());
            System.out.println("Word frequency:");
            for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (IOException e) {
            System.err.println("Error analyzing the file: " + e.getMessage());
        }
		
		
		
	}

}
