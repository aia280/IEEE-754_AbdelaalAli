import java.util.Scanner;

/**
 * Class Name: IEEE754
 * Description: Runs the program. Asks user to pick a set of options to either convert decimal to IEEE-754 binary or vice versa
 * @author Abdelaal Ali
 *
 */
public class IEEE754 
{
	public static void main(String[] args) 
	{
		// Declaring variables
		double dInput;
		float fInput;
		String fBinary, dBinary;
		int choice;
		Scanner keyboard = new Scanner(System.in);
		String again;
		
		
		do		// loop to run program again if user wants
		{
			// User chooses from options
			System.out.println("Select either: \n" +
								"1 for float to binary(32-bit) \n" +
								"2 for double to binary (64-bit) \n" + 
								"3 for binary (32-bit) to float \n" +
								"4 for binary (64-bit) to double");
		
			choice = keyboard.nextInt();
		
			if (choice == 1)
			{
				// User enters number
				System.out.println("Enter a single precision floating point number: ");
				fInput = keyboard.nextFloat();
			
				//Instantiates an object from SinglePrecision class
				SinglePrecision single = new SinglePrecision();
			
				// Adds leading zeros
				String sformat = String.format("%32s", single.singletoBinary(fInput)).replace(' ', '0');
			
				System.out.println("The binary for this number is " + sformat);
				System.out.println();
			
				if (single.isNegative(sformat))
					System.out.println("The sign is negative");
				else
					System.out.println("The sign is positive");
			
				System.out.println("The exponent is " + sformat.substring(1, 9));
				System.out.println("The mantissa is " + sformat.substring(9));
			}
		
			if (choice == 2)
			{
				// User enters number
				System.out.println("Enter a double precision floating point number: ");
				dInput = keyboard.nextDouble();
			
				//Instantiates an object from SinglePrecision class
				DoublePrecision doub = new DoublePrecision();
			
				// Adds the leading zeros
				String dformat = String.format("%64s", doub.doubletoBinary(dInput)).replace(' ', '0');
			
				System.out.println("The binary for this number is " + dformat);
				System.out.println();
			
				if (doub.isNegative(dformat))
					System.out.println("The sign is negative");
				else
					System.out.println("The sign is positive");
			
				System.out.println("The exponent is " + dformat.substring(1, 12));
				System.out.println("The mantissa is " + dformat.substring(12));
			}
		
			if (choice == 3)
			{
				System.out.println("Enter a 32-bit binary string: ");
				fBinary = keyboard.next();
			
				SinglePrecision single = new SinglePrecision();
			
				System.out.println("The binary for this number is " + single.binarytoSingle(fBinary));
			}
		
			if (choice == 4)
			{
				System.out.println("Enter a 64-bit binary string: ");
				dBinary = keyboard.next();
			
				DoublePrecision doub = new DoublePrecision();
			
				System.out.println("The binary for this number is " + doub.binarytoDouble(dBinary));
			}
			
			System.out.println();
			System.out.print("Would you like to run this program again? [Y/N]");
			again = keyboard.next();
			System.out.println();
			
		} while(again.toLowerCase().charAt(0) == 'y');
		
		System.exit(0);
		
	}

}
