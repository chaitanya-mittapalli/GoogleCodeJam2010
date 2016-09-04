import java.util.*;
public class StoreCredit 
{

	/**
	 * @param args
	 */
	public void compare(String[] strings)
	{
		
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        int testCases=0;
        int credit=0;
        int noItems=0;
		Scanner in=new Scanner(System.in);
		
		int j=0;
		int j2=0;
		testCases=Integer.parseInt(in.nextLine());
	    for (int i = 0; i < testCases; i++) 
	    {
	    	credit=Integer.parseInt(in.nextLine());
	    	
	    	noItems=Integer.parseInt(in.nextLine());
	    	
	    
	    	String [] prices=in.nextLine().split(" ");
	    	outerloop:
	    	for (int x=0; x < prices.length; x++)
	    	{
	    		for (int x2 = x+1; x2 < prices.length; x2++) 
	    		{
	    			if(credit==Integer.parseInt(prices[x])+Integer.parseInt(prices[x2]))	
	    			{
	    				j=x+1;
	    				j2=x2+1;
	    				break outerloop;
	    				
	    			}
					
				}
				
			}
	    	System.out.println("Case #"+(i+1)+": "+j+" "+j2);
	    	
	    }	
			
		
	 }

}


