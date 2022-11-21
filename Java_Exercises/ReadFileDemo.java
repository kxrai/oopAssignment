import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo {
	public static void main(String[] args) {
       BufferedReader br = null;
	   try{	
			String[][] stringArray = new String[conutFilelength(path: "myFile.text")][];
			//String[] stringArray = new String[conutFilelength(path: "myFile.text")];
			br = new BufferedReader(new FileReader("myfile.txt"));	
			int count = 0;

           	//One way of reading the file
	   		System.out.println("Reading the file using readLine() method:");
	   		String contentLine = br.readLine();
	   		while (contentLine != null) {
	      		//System.out.println(contentLine);
	      		stringArray[count] = contentLine.split(",");
				count++;
				contentLine = br.readLine();
	   		}
			System.out.println(stringArray[0][1]);

		}
		catch (IOException e){
			e.printStackTrace();
		} 
		finally{
			try{
				if (br != null){
					br.close();
				} 
				catch (IOException ioe) 
           		{
					System.out.println("Error in closing the BufferedReader");
				}
			}
		}
	}
	public static int conutFilelength(String Path){
		BufferedReader br = null;
		int lineCount = 0;
		System.out.println("We are counting the file length");
		try{	
			br = new BufferedReader(new FileReader("myfile.txt"));		

			//One way of reading the file
			System.out.println("Reading the file using readLine() method:");
			String contentLine = br.readLine();
			System.out.println(contentLine);
			while (contentLine != null) {
				System.out.println(contentLine);
			   	contentLine = br.readLine();
				lineCount++;
			}
			System.out.println(lineCount);
			return lineCount;
		} 
		catch (IOException e){
			e.printStackTrace();
			return 0;
		}
		finally{
			try {
				if (br != null){
					br.close();
				}
			}
			catch (IOException ioe){
				System.out.println("Error in closing the BufferedReader");
			}
		}
	}
}

