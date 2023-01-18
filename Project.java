import java.io.*;
import java.util.*;

public class Project {

public static void main(String[] args) throws IOException {
			
            //variables
			TreeClass tr = new TreeClass();
			String fileName;
			ArrayList<String> distinctWords = new ArrayList<String>();
			ArrayList<String> threeLettersDistinctWords = new ArrayList<String>();
			int totalwords = 0;
			int totalNonBlanks = 0;
			int totalSentences = 0;
			int averageWordLength = 0;
			int averageSentenceLength = 0;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the name of the file:");
			fileName = sc.nextLine();
			
			File file = new File(fileName);
			Scanner input = new Scanner(file);
			
			
			StringBuilder l = new StringBuilder();
			
			while(input.hasNext()) {
				
				l.append(input.next() + " ");
			}
			
			String str = l.toString().toLowerCase();
			
			//Split spaces
			String[] wordArray = str.split("\\s+");
			
			//Split to form sentences
			String[] sentences = str.split("[!.?]");
			
			totalSentences = sentences.length;
			
			// add each word to the tree
			for(int i = 0; i < wordArray.length; i++) {
				
				tr.insertWord(new NodeClass(wordArray[i]));
			}
			
			//Files total words
			totalwords = wordArray.length;
			
			//Total number of non blank characters
			for(int i = 0; i < str.length(); i++) {
				
				if(str.charAt(i) != ' ')
					totalNonBlanks++;
			}
			
			// Total amount of sentences
			totalSentences = sentences.length;
			
			//Average word length 
			 averageWordLength = totalNonBlanks / totalwords;
			 
			 
			 //average sentence length
			 averageSentenceLength = totalwords / totalSentences;
			 
			 //Distinct words
			 for(int i = 0; i < wordArray.length; i++) {
				 if(!distinctWords.contains(wordArray[i]))
					 distinctWords.add(wordArray[i]);
			 }
			 
			 //Distinct words of more than three letters
			 for(int i = 0; i < wordArray.length; i++) {
				 if(!threeLettersDistinctWords.contains(wordArray[i]) && wordArray[i].length() >= 3)  {
					 threeLettersDistinctWords.add(wordArray[i]);
				}
			 }
			 
			 
			System.out.println();
			System.out.println("Statictics: ");
			
			//Statistical data
			System.out.println("The total amount of words in the files is: " + totalwords);
			System.out.println("The total amount of non blank characters is: " + totalNonBlanks);
			System.out.println("The total amount of sentences is: " + totalSentences);
			System.out.println("The average word length is: " + averageWordLength);
			System.out.println("The average sentence length is: " + averageSentenceLength);
			System.out.println("The amount of distinct words is: " + distinctWords.size());
			System.out.println("The amount of more than three letter distinct words is: " + threeLettersDistinctWords.size() );
			
			
			// prints the words
			
			System.out.println();
			System.out.println("*****************************************************************************");
			System.out.println("The words in the file are (in alphabetical order): ");
			tr.display();
		}

	}


