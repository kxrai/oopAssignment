import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class javaCountingBees {
	public static void printLines(String file){
		BufferedReader br = null;
       	try{		
           	br = new BufferedReader(new FileReader("beemovie.txt"));		

           	//One way of reading the file
			System.out.println("Reading the file using readLine() method:");
			String contentLine = br.readLine();
			while (contentLine != null) {
				//System.out.println(contentLine);
				contentLine = br.readLine();
			}			
       	} 
		catch (IOException e){
	   		e.printStackTrace();
       	} 
       	finally{
	   		try {
	      		if (br != null){
					br.close();
				}
	   		} 
	   		catch (IOException e) {
				System.out.println("Error in closing the BufferedReader");
	   		}
		}
  	}
	/**
	 * Counts the number of rows within a text file
	 * @param file path of the text tile
	 * @return the number of rows inside the text file. If file is invalid, method returns -1
	 */
	public static int countLines(String file){
		BufferedReader br = null;
		int count = 0;
       	try{		
           	br = new BufferedReader(new FileReader(file));		

           	//One way of reading the file
			System.out.println("Counting the number of lines...");
			String contentLine = br.readLine();
			while (contentLine != null) {
				count++;
				//System.out.println(contentLine);
				contentLine = br.readLine();
			}
			return count;		
       	} 
		catch (IOException e){
	   		e.printStackTrace();
			return -1;
       	} 
       	finally{
	   		try {
	      		if (br != null){
					br.close();
				}
	   		} 
	   		catch (IOException e) {
				System.out.println("Error in closing the BufferedReader");
	   		}
		}
  	}
	//helo
	public static void populateArray(String file, String[][] script){
		BufferedReader br = null;
		int lineNum = 0;
		String delin = " ";
       	try{		
           	br = new BufferedReader(new FileReader("beemovie.txt"));		

           	//One way of reading the file
			System.out.println("Populating 2D array...");
			String contentLine = br.readLine();
			while (contentLine != null) {
				//System.out.println(contentLine);
				// We will conver the string contetLine
				// into an array
				script[lineNum] = contentLine.split(delin);
				lineNum++;
				contentLine = br.readLine();
			}			
       	} 
		catch (IOException e){
	   		e.printStackTrace();
       	} 
       	finally{
	   		try {
	      		if (br != null){
					br.close();
				}
	   		} 
	   		catch (IOException e) {
				System.out.println("Error in closing the BufferedReader");
	   		}
		}
  	}
	/**
	 * Print each word inside the row of our 2D array
	 * @param arr A one dimentional array representing the row of the script
	 */
	public static void printRow(String[] arr){
		for(String word: arr){
			System.out.print(word + " ");
		}
		System.out.println();
	}
	public static int countWords(String word, String[][] arr){
		int count = 0;
		for(String[] row: arr){
			for(int i = 0; i < row.length; i++){
				if(row[i].toLowerCase().contains(word.toLowerCase())){
					count++;
				}
			}
		}

		return count;
	}
	public static void main(String[] args) {
		String script = "beemovie.txt";
		//printLines(script);
		int totalLines = countLines(script);
		System.out.println(totalLines);
		String[][] movieScript = new String[totalLines][];
		populateArray(script, movieScript);
		/* 
		for(String[] line: movieScript){
			printRow(line);
		}
		*/
		int beeCount = countWords("bee", movieScript);
		System.out.println("The number of times bee is mentioned in the bee movie is: " + beeCount);
  	}
}