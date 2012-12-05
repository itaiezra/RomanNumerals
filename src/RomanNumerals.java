
public class RomanNumerals 
{

	public String toRoman(int nmber) 
	{
		String num = "";
		
		for(int i=1;i<=nmber;i++)
		{
			num+='I';
			if (i==4)
				num="IV";
			if (i==5)
				num="V";
			if (i==9)
				num="IX";
			if (i==10)
				num="X";
		}
		
		return num;
	}

}
