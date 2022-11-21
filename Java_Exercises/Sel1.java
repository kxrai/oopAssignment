//Ask the user for a number between 1 and 10. If the value is larger than or equal to 5, then output the words “You won!”.

import java.util.Scanner;

class Sel1 {
  public static void main(String[] args) {

    System.out.println("Enter a number between 1 and 10");

    Scanner input = new Scanner(System.in);

    int user_input = Integer.valueOf(input.nextLine());

    if (user_input < 5) {
      System.out.println("You lost");

      } else if (user_input >= 5) {
        System.out.println("You won!");
        }
      input.close();
  }
  
}