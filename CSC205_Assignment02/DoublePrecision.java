/**
 * Class Name: DoublePrecision
 * Description: A class for 64 bit floating point. Converts to decimal to binary string and vice versa
 * @author Abdelaal Ali
 *
 */
public class DoublePrecision 
{
	/**
	 * Method Name: doubletoBinary
	 * Description: Returns a 64-bit binary representation of the decimal
	 * @param doub decimal number
	 * @return a binary string
	 */
	public String doubletoBinary(double doub)
	{
		return Long.toBinaryString(Double.doubleToLongBits(doub));
	}
	
	/**
	 * Method Name: binarytoDouble
	 * Description: Returns the decimal number of a 64-bit binary string
	 * @param binary string
	 * @return decimal number of string
	 */
	public double binarytoDouble(String binary)
	{
		// Changes the first bit to 0 since negative numbers can't be parsed
		char first = binary.charAt(0);
		if (first == '1')
		{
			String change = binary.replaceFirst("1", "0");
			double positive = Double.longBitsToDouble(Long.parseLong(change, 2));
			
			// Changes back to negative
			return positive * -1;
		}
		
		else
			return Double.longBitsToDouble(Long.parseLong(binary, 2));
	}
	
	/**
	 * Method Name: isNegative
	 * Description: checks to see if the string is positive or negative
	 * @param neg
	 * @return
	 */
	public boolean isNegative(String neg)
	{
		if(neg.charAt(0) == '1')
			return true;
		else
			return false;
	}
}
