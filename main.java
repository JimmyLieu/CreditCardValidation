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
    
