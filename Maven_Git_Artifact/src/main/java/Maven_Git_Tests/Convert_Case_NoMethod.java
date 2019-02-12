package Maven_Git_Tests;


public class Convert_Case_NoMethod 
{
	public static void main(String[] args) 
	{
		int i;
		String s="ConvertTheCasess";
		char[] c=s.toCharArray();
		for(i=0;i<c.length;i++)
		{
			if((int)c[i]>96&&(int)c[i]<123)
				c[i]=(char)((int)c[i]-32);
			
			else if((int)c[i]>64&&(int)c[i]<91)
				c[i]=(char)((int)c[i]+32);
		}
		System.out.println(s);
		for(i=0;i<c.length;i++)
			System.out.print(c[i]);
	}
}
