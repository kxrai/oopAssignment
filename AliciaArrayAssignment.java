
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class AliciaArrayAssignment {

    /**
     * Reading the file for student data
     * @param studentDataArray The array that contains student data
     * @param file file path to csv
     */
    public static void readFile(String[][] studentDataArray, String file) {
        BufferedReader br = null;
        try{	
            br = new BufferedReader(new FileReader(file));	
            int count = 0;
            //One way of reading the file
            //System.out.println("Reading the file using readLine() method:");
            br.readLine(); // reads the first line so that the while loop can start on the second line
            String contentLine = br.readLine();
            while (contentLine != null) {
                //System.out.println(contentLine);
                //studentDataArray[count] = contentLine.toLowerCase().split(","); // makes question file lowercase
                studentDataArray[count] = contentLine.split(",",-1);
                count++;
                contentLine = br.readLine();
            }
        }

        catch (IOException e){
            e.printStackTrace();
          
        } 
        finally{
            try{
                if (br != null){
                    br.close();
                } 
            }
                catch (IOException ioe) 
                {
                    System.out.println("Error in closing the BufferedReader");
                }
            }
    }

    /**
     * need to make it to regular Array so that I can replace spaces
     * Reads data from student question files and ignores spaces
     * @param studentDataArray Array that contains student data
     * @param file file path to csv
     */
    public static void readQuestionData(String[] studentDataArray, String file) {
        BufferedReader br = null;
        try{	
            br = new BufferedReader(new FileReader(file));	
            int count = 0;
           
            String contentLine = br.readLine();
            while (contentLine != null) {
                // ignores the spaces between lines
                
                if (contentLine.length() == 0) {
                    contentLine= br.readLine();
                    continue;
                }
                 
                studentDataArray[count] = contentLine.toLowerCase().replace(" ", ""); // makes question file lowercase
                count++;
                contentLine = br.readLine();

            }
        }

        catch (IOException e){
            e.printStackTrace();
          
        } 
        finally{
            try{
                if (br != null){
                    br.close();
                } 
            }
                catch (IOException ioe) 
                {
                    System.out.println("Error in closing the BufferedReader");
                }
            }
    }

    
    /**
     * Retrieves user input for student data and outputs file data as a 2D array
     * @return returns file data as 2D array
     */
    public static String studentDataInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the student file that you would like to load (INCLUDE FILE EXTENSION): ");

        String fileName = input.nextLine().toLowerCase();
        //System.out.println("You entered: " + fileName);

        // Makes it so that they can only open student data file and not any other file
        File file = new File("student_data/" + fileName); //student_data/ is the folder we are restricting user input to
        while(!file.exists()) {
            System.out.println("You entered: " + fileName);
            System.out.println("Enter a valid file name.");
    
            fileName = input.nextLine().toLowerCase();
            file = new File("student_data/" + fileName);
        }
        System.out.println("You entered: " + fileName);
        System.out.println("");
        return "student_data/" + fileName;
            
    }

    /**
     * Gives user option to skip part 2b and 2c
     * If user types no, they will be asked to enter the question file name they want to load, followed by the response data
     * Afterwards, the solutions will be outputed along with the amount of questions each student got correct
     * 
     * If I had completed 2c and the user enters yes, then the program would solve the question for them
     */
    public static void shortCut() {

        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.println("Type 'yes' to solve the question or 'no' to get the solutions: ");
        
        String option = input.nextLine().toLowerCase();
        String yes = "yes";
        String no = "no";

        // if and else statements that allow the student to skip steps
        if (option.equals(no)) {
            
            String qFile = questionDataInput();
            int questionRows = numberOfRows(qFile);
            String[] questionArray = new String[questionRows];
            readQuestionData(questionArray, qFile);

            for(String word: questionArray) {
                System.out.print(word + " ");
                System.out.println("");
            }
        }

        else if (option.equals(yes)) {
            // if the student enters 'yes', this if statement will ask them to enter the question file that they would like to load and open it


            String qFile = questionDataInput();
            int questionRows = numberOfRows(qFile);
            String[] questionArray = new String[questionRows];
            readQuestionData(questionArray, qFile);

            for(String word: questionArray) {
                System.out.print(word + " ");
                System.out.println("");
            }
            //Program would have showed how to solve question here...

        }

        System.out.println("");
        
    }

    /**
     * Asks the user to input question file that they want to load
     * Outputs data as a 2D array
     * @return
     */
    public static String questionDataInput() {
        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the question file that you would like to load (INCLUDE FILE EXTENSION): ");

        String fileName = input.nextLine().toLowerCase();
        //System.out.println("You entered: " + questionFile);
        File file = new File("question_data/" + fileName);

        while(!file.exists()) {
            System.out.println("You entered: " + fileName);
            System.out.println("Enter a valid file name.");
            fileName = input.nextLine().toLowerCase();
            file = new File("question_data/" + fileName);
        }
        System.out.println("You entered: " + fileName);
        System.out.println("");
        return "question_data/" + fileName;
    }
    
    /**
     * Asks user to input response file name that they want to load
     * Only allows user to load file that is in response folder
     * @return returns response data as 2D array
     */
    public static String responseDataInput() {
        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the response file that you would like to load (INCLUDE FILE EXTENSION): ");

        String fileName = input.nextLine().toLowerCase();
        //System.out.println("You entered: " + questionFile);
        File file = new File("response_data/" + fileName);

        while(!file.exists()) {
            System.out.println("You entered: " + fileName);
            System.out.println("Enter a valid file name.");
            fileName = input.nextLine().toLowerCase();
            file = new File("response_data/" + fileName);
        }
        System.out.println("You entered: " + fileName);
        System.out.println("");
        return "response_data/" + fileName;
    }
    
    /**
     * Only accepts file names that are in the answer_data folder
     * @return returns the file printed out as an array
     */
    public static String answerDataInput() {
        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the answer file that you would like to load (INCLUDE FILE EXTENSION): ");

        String fileName = input.nextLine().toLowerCase();
        File file = new File("answer_data/" + fileName);

        while(!file.exists()) {
            System.out.println("You entered: " + fileName);
            System.out.println("Enter a valid file name.");
            fileName = input.nextLine().toLowerCase();
            file = new File("answer_data/" + fileName);
        }
        System.out.println("You entered: " + fileName);
        System.out.println("");
        return "answer_data/" + fileName;

    }
    
    /**
     * This would be the csv file for the answers if I had completed 2c
     * Answers update according to the response file that the user inputs
     * @param file file path for the csv file
     */
    public static void createAnswerFile(String file) {
        try {
            FileWriter csvFile = new FileWriter(file);
            csvFile.write("This is where the solutions would be posted if I had done 2c");
            csvFile.close();
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }

    /**
     * @param scoreData A csv file that contains the scores of the students
     * @param responseArray Array that contains the response data
     * @param answerArray Array that contains the answer data that I use to compare solutions to response
     */
    public static void compareSolution(String[][] scoreData, String[][] responseArray, String[] answerArray) {
        // pass in response data array and answer data array
        for(int i = 0; i < responseArray.length; i++) {
            int score = 0;
            for(int j = 0; j < answerArray.length/2; j++) { //divide by 2 to skip a1, a2, a3
                if(responseArray[i][j + 4].equals(answerArray[j*2 + 1])) {
                    score += 1;
                } //j + 4 is index for when it starts 
                //j*2 + 1 so that you get to answer row instead of a1
            }
            scoreData[i][4] = Integer.toString(score);
        }
    }

    /**
     * Creates csv file for the student's score
     * Updates according to the whatever file the user inputs
     * @param scoreData Parameter for the scores of the students
     */
    public static void createScoreFile(String[][] scoreData) {
        try {
            FileWriter csvFile = new FileWriter("homeworkGrades.csv");
            csvFile.write("Student Number, First Name, Last Name, Email, Score\n");
            
            for(int x = 0; x < scoreData.length; x++) {
                csvFile.write(String.join(",", scoreData[x]) + "\n"); // use , to connect info
                
            }
            csvFile.close();
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
        
    }
    
    // Matrix is all the coefficients of the variables, the constant is at the end. The constant is all the numbers without variables.
    // Coefficients are all the numbers infront of the variables

    // Insert matrix code here

    /**
     * Counts the number of rows in the file so that the program knows how many rows
     * there are in each file
     * @param file file parameter to count number of rows
     * @return returns number of rows in file
     */
    public static int numberOfRows(String file) {
        BufferedReader br = null;
        try{	
            br = new BufferedReader(new FileReader(file));	
            int count = 0;
            String contentLine = br.readLine();
            while (contentLine != null) {
                if(contentLine.equals("")){
                    count--;
                }
                count++;
                contentLine = br.readLine();
            }
            //return number of rows in file
            return count;
        }

        catch (IOException e){
            e.printStackTrace();
            return 0;
        } 
        finally{
            try{
                if (br != null){
                    br.close();
                }
                else {
                    System.out.println();
                } 
            }
            catch (IOException ioe) {
                {
                    System.out.println("Error in closing the BufferedReader");
                }
            }
        }
    }

    public static void main(String[] args) {
        // student Data 
        String file = studentDataInput();
        int studentRows = numberOfRows(file);
        String[][] studentDataArray = new String[studentRows-1][]; // extra row so need to -1
        readFile(studentDataArray, file);
        
        // Printing out data in their own rows
        for(String[] row: studentDataArray ) {
            for(String word: row) {
                System.out.print(word + " ");
            }
            System.out.println();
        }

        shortCut();

        // Response Array
        String rFile = responseDataInput();
        int responseRows = numberOfRows(rFile);
        String[][] responseArray = new String[responseRows-1][];
        readFile(responseArray, rFile);

        for(String[] row: responseArray ) {
            for(String word: row) {
                System.out.print(word + " ");
            }
            System.out.println();
        }
        String aFile; 
        // Ansewer Array
        if (rFile.equals("response_data/student_data_q1_response.csv")) {
            aFile = "answer_data/sample_a_1.txt";
        }
        else {
            aFile = "answer_data/sample_a_2.txt";
        }
        int answerRows = numberOfRows(aFile);
        String[] answerArray = new String[answerRows];
        readQuestionData(answerArray, aFile);

        for(String row: answerArray ) {
            System.out.println(row);
        }
        
        String[][] scoreData = new String[responseRows-1][5];
        for(int i = 0; i < responseRows-1; i ++) {
            for(int x = 0; x < 4; x++ ) {
                scoreData[i][x] = responseArray[i][x];
            }
        }
        
        compareSolution(scoreData, responseArray, answerArray); // this stores the score array
       
        for(String[] row: scoreData) {
            for(String a: row) {
                System.out.print(a+ " ");
            }
            System.out.println();
        }
        createScoreFile(scoreData); //creates csv of score data with students
    }
}