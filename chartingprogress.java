import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class chartingprogress {

    public static void main(String[] args) throws IOException{
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	int before, after=0;
		String s = reader.readLine();
    	while(s != null){
    		
    		int stars = 0;
    		int length = s.length();
    		
    		for(int i = 0; i < length; i++){
    			if(s.charAt(i)=='.') {
				}
    			if(s.charAt(i)=='*')
    				stars++;
    		}
    		before = (length - stars) - after;
    		
    		for(int i = 0; i < before; i++){
    			System.out.print(".");
    		}
    		for(int i = 0; i < stars; i++){
    			System.out.print("*");
    		}
    		if(after>0) {
    			for(int i = 0; i < after; i++){
        			System.out.print(".");
        		}    			
    		}
    		System.out.println();
    		after += stars;
    		if(before == 0)
    		{
    			//System.out.println("");
    			after = 0;
    		}
    		s = reader.readLine();
    	}	       
    }
}
