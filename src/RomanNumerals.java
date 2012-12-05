
public class RomanNumerals 
{

	public String toRoman(int nmber) 
	{
		String num = "";
		int[] aArray = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] rArray = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"}; 
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
