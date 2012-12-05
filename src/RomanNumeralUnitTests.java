import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralUnitTests 
{

	private RomanNumerals number = new RomanNumerals();

	@Test
	public void testThat1ReturnsI() 
	{
		assertEquals("I", number.toRoman(1));
		assertEquals("II", number.toRoman(2));
		assertEquals("III", number.toRoman(3));
		assertEquals("IV", number.toRoman(4));
		assertEquals("V", number.toRoman(5));
		assertEquals("VI", number.toRoman(6));
		assertEquals("VII", number.toRoman(7));
		assertEquals("VIII", number.toRoman(8));
		assertEquals("IX", number.toRoman(9));
		assertEquals("X", number.toRoman(10));
		assertEquals("XI", number.toRoman(11));
		assertEquals("XII", number.toRoman(12));
		assertEquals("XIII", number.toRoman(13));
		assertEquals("XIV", number.toRoman(14));
		assertEquals("L", number.toRoman(50));
		assertEquals("C", number.toRoman(100));
		assertEquals("MMMCMXCVIII", number.toRoman(3998));
	}
	

}
