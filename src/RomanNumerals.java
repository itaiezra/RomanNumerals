
public class RomanNumerals 
{

	public String toRoman(int nmber) 
	{
		String num = "";
		if (nmber<4)
		for(int i=0;i<nmber;i++)
			num+='I';
		else 
			num = "IV";
		return num;
	}

}
