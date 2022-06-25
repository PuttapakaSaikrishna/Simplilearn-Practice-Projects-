package assignments;
import java.util.ArrayList;

public class emailIDs {

	public static void main(String[] args) {
		 ArrayList<String> emailID = new ArrayList<String>();
	        
	        emailID.add("Skrishna694@gmail.com");
	        emailID.add("SAndhya123@gmail.com");
	        emailID.add("rakesh.hotmail@gmx.com");
	        emailID.add("max.neumann@gmx.com");
	        emailID.add("niharika.son@gmx.com");
	        emailID.add("rabada.km@gmx.com");
	        emailID.add("Anusha.n@gmx.com");
	        
	   
	        String searchElement = "Skrishna694@gmail.com";
	        
	                for( int i=0; i < emailID.size(); i++ ) {
	                    
	                    System.out.println(emailID.get(i));
	                    
	                    if(searchElement==emailID.get(i)) {
	                        
	                        System.out.println("\n");
	                        
	                        System.out.println("email ID : " + "  " + searchElement + "  " + "found");
	                        
	                        break;
	                        
	                    }
	                }

	    

	

	}

}
