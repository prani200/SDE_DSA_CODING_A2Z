public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		String[] strs = {"flower", "flow", "flight"};
		String prefix = strs[0]; // Take First String as Prefix
		
		for(int i=1;i<strs.length;i++) // Traverse the String array
		{
		    //Reduce Prefix Until it matches
		    while(!strs[i].startsWith(prefix))
		    {
		        prefix = prefix.substring(0,prefix.length()-1); //Remove last Character
		        
		        if(prefix.isEmpty())
		        {
		            System.out.println("0");
		            return;
		        }
		        
		    }
		    
		}
		
		System.out.println(prefix);
		
	}
}
