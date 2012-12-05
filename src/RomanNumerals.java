
public class RomanNumerals 
{

	public String toRoman(int nmber) 
	{
		String num = "";
		int[] aArray = {50,40,10,9,5,4,1};
		String[] rArray = {"L","XL","X","IX","V","IV","I"}; 
		for(int i=0; i<aArray.length; i++)
		{
			while(nmber >= aArray[i])
			{
			num += rArray[i];
			nmber -= aArray[i];
			}
		}
			 
		return num;
	}	
}
