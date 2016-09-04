import java.util.Scanner;


public class ReverseWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
	    int	testCases=Integer.parseInt(in.nextLine());
		for (int i = 0; i < testCases; i++) 
		{
			String[] words=in.nextLine().split(" ");
			System.out.print("Case #"+(i+1)+": ");
			for(int j=(words.length-1);j>=0;j--)
			{
				System.out.print(words[j]+" ");
				
			}
			System.out.println("\n");
			
			
		}

	}

}
