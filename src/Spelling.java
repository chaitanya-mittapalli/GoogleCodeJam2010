import java.util.Scanner;


public class Spelling 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        String a="2";
        String b="22";
        String c="222";
        String d="3";
        String e="33";
        String f="333";
        String g="4";
        String h="44";
        String i="444";
        String j="5";
        String k="55";
        String l="555";
        String m="6";
        String n="66";
        String o="666";
        String p="7";
        String q="77";
        String r="777";
        String s="7777";
        String t="8";
        String u="88";
        String v="888";
        String w="9";
        String x="99";
        String y="999";
        String z="9999";
		Scanner in=new Scanner(System.in);
          if(in.hasNextLine())
          {
        	  int testCases=Integer.parseInt(in.nextLine());
        	  for (int temp = 0; temp < testCases; temp++) 
        	  {
      			System.out.print("Case #"+(i+1)+": ");
      			String out=new String();
      			String[] tokens=in.nextLine().split("");
      			for (String string : tokens)
      			{
      				System.out.println();
					
				}
      			
      			
			  }
        	  
        	  
          }
          else
          {
        	System.out.println("Empty File");
          }
         

	}

}
