import java.util.Scanner;
class ReverseString
{
	public static void main(String[]args)
	{
		Scanner input= new Scanner(System.in);
		System.out.print("Enter String :");
			String str=input.nextLine();
			String rev="";
			for(int i=str.length()-1;i>=0;i--)
				rev= rev + str.charAt(i);
			{
					System.out.println("Reverse:"+rev);
			}
		//System.out.println("String Name:"+str.toUpperCase()+ '\t'+"String length:"+Length);//
		
				
	}
