public class Program2CCValidation {

	public static void main(String[] args) {
		//seat up a Scanner
		Scanner scanner = new Scanner(System.in);
		//set up a boolean named validCreditCard and set it to false       
		boolean validCreditCard = false;
		//loop while not a valid credit card  
		do {
			//prompt the user for a potential credit card number                     
			System.out.print("Please enter your credit card number: ");
			//Get the credit card number as next String - store in potentialCCN (use scanner's nextLine)
			String potentialCCN = scanner.next();
			System.out.println("This is what you entered: "+potentialCCN);

			//use Luhn to validate credit card using the following steps:

			//store the digit AS AN INT for later use in lastDigit (probably requires Integer.parseInt(String)
			int lastDigit = Integer.parseInt(potentialCCN.substring(potentialCCN.length() - 1));
			System.out.println("This is the last digit: "+lastDigit);

			//TEST then comment out! - check the last digit - System.out.println(lastDigit);
			//remove the last digit from potentialCCN and store in potentialCCN using String's substring
			// the 0 would be the start and -1 would be the end without the last digit
			potentialCCN = potentialCCN.substring(0, potentialCCN.length() - 1);
			System.out.println("This is the credit card number without the last digit: "+potentialCCN);
			//TEST then comment out! - check potentialCCN - System.out.println(potentialCCN);

			//create reversedCCN as a empty
			String reversedCCN = "";
			char Array;
			//reverse the digits using a for loop by adding characters to reversedCCN
			for (int i = 0; i < potentialCCN.length(); i ++) {
				Array = potentialCCN.charAt(i);
				reversedCCN = Array + reversedCCN;
			}

			//TEST then comment out! - check reversedCCN - System.out.println(reversedCCN);
			System.out.println("This is the reverse CCN (no last digit): " +reversedCCN);
			//set boolean isOddDigit to false
			boolean isOddDigit = false;
			//set up an integer called current digit and set it to 0
			int currentDigit = 0;
			//create an integer named sum and set it to 0
		
			//multiply the digits in odd positions by 2, then subtract 9 from any number higher than 9 using:\
			int [] ints = new int [reversedCCN.length()];
			for ( int i = 0; i < reversedCCN.length(); i++) {
				ints[i] = Integer.parseInt(reversedCCN.substring(i, i + 1));
			}
			for (int i = ints.length - 2; i >= 0; i = i - 2) {
				int j = ints[i];
				j = j * 2;
				if (j > 9) {
					j = j % 10 + 1;
				}
				ints[i] = j;
			}
			int sum = 0;
			for (int i = 0; i < ints.length; i ++) {
				sum += ints[i];
			}
			if (sum % 10 == 0) {
				System.out.println(potentialCCN+ " is a valid credit card number. ");
			}else {
				System.out.println(potentialCCN+ " is not a valid credit card number.");
			}
			//(for loop running 0 to less than length of reversed CCN)
			for (int i = 0; i <= reversedCCN.length()-1; i++) {
				if (isOddDigit = !isOddDigit) {
					//first we assign current digit the current char at index i
					//currentDigit = Integer.parseInt();
					currentDigit = currentDigit * 2;
					System.out.println(+currentDigit);
				}

			
		
			}while(validCreditCard != true);
	

//set currentDigit equal to the integer version of the current character

//Test then comment out! - currentDigit -System.out.print(currentDigit);
//System.out.print(currentDigit);
//toggle isOddDigit

//if isOddDigit

//multiply currentDigit by 2 and store in currentDigit

//if currentDigit > 9, subtract 9 from currentDigit and store in currentDigit

//TEST then comment out - Check currentDigit - System.out.println(currentDigit);

//end if isOddDigit

//Comment in this segment for a useful test output string

//System.out.print(currentDigit);


//if (i>=reversedCCN.length()-1)

//System.out.println();

//else

//System.out.print(" + ");

//end of segment



// add currentDigit to sum and store in sum     
//sum = currentDigit + sum;
//end reverse the string     

//TEST and comment out -  System.out.println("sum:"+sum);

//if the last digit of sum + the last Digit ends in a zero, set isValidCreditCard to true

//if validCreditCard is false, output an appropriate message

//end while that checks for valid credit card

//issue a RANDOM PIN and print it out - no more help :)
Random random = new Random();
int pin = random.nextInt(9999);
System.out.println(pin);
		
	}while(validCreditCard != true);
}
}


//close the scanner
