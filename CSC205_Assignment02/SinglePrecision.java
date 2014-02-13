/**
 * Class Name: SinglePrecision
 * Description: A class for 32 bit floating point. Converts to decimal to binary string and vice versa
 * @author Abdelaal Ali
 *
 */
public class SinglePrecision 
{
	/**
	 * Method Name: singletoBinary
	 * Description: Returns a 32-bit binary representation of the decimal
	 * @param single decimal number
	 * @return a binary string
	 */
	public String singletoBinary(float single)
	{
		return Integer.toBinaryString(Float.floatToIntBits(single));
	}
	
	/**
	 * Method Name: binarytoSingle
	 * Description: Returns the decimal number of a 32-bit binary string
	 * @param binary string
	 * @return decimal number of string
	 */
	public float binarytoSingle(String binary)
	{
		// Changes the first bit to 0 since negative numbers can't be parsed
		char first = binary.charAt(0);
		if (first == '1')
		{
			String change = binary.replaceFirst("1", "0");
			float positive = Float.intBitsToFloat(Integer.parseInt(change, 2));
			
			// Changes back to negative
			return positive * -1;
		}
		else
			return Float.intBitsToFloat(Integer.parseInt(binary, 2));
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
