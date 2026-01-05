import java.util.Scanner;
class palindrome
{
	public static void main(String[]args)
	{
		Scanner input= new Scanner(System.in);
		System.out.print("Enter String :");
			String str=input.nextLine();
			String rev="";
			for(int i=str.length()-1;i>=0;i--)
			{
				rev= rev + str.charAt(i);
			}
				if(rev.equals(str))
				{
					System.out.println("Reverse:"+rev);
					System.out.println("Palindrome");
				}
				else
				{
					System.out.println("Not palindrome");
				}
	}
}
