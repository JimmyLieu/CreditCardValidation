package creditCard;

import java.util.Random;

public class CCValidation {
  public static void main(String[] args) {
    //Set up the scanner to read in new variables.
    Scanner scanner = new Scanner(System.in);
    
    //Prompt user to enter their CC info and store it
    System.out.print("Please enter your credit card number: ");
    String potentialCCN = scanner.next();
    System.outprintln(""+potentialCCN);
    
    //This will be verifying using the Luhn method
    //Using parse Int changes the String to an Integer
    int lastDigit = Integer.parseInt(potentialCCN.substring(potentialCCN.length() - 1));
    //Print out lastDigit to test the case
    
    //System.out.println(lastDigit);
    potentialCCN = potentialCCN.substring(0, potentialCCN.length() - 1));
    //System.out.println(potentialCCN);
    //Creating a string for the reverse CCN from Luhn's method
    String reversedCCN = "";
    char character;
    for (int i = 0; i < potentialCCN.length(); i ++) {
      character = potentialCCN.charAt(i);
      reversedCCN = character + reversedCCN;
    }
    
