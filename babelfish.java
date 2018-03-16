import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class babelfish{
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Map<String,String> words = new HashMap<>();
        
        while (true){
        	String temp = scan.nextLine();
        	if(temp.equals(""))
        		break;
        	String ar[] = temp.split(" ");
        	String value = ar[0];
            String key = ar[1];
            words.put(key,value);
        }    
        while(scan.hasNextLine()){
            String temp = scan.nextLine();
            if (!words.containsKey(temp))
            	System.out.print("eh"+"\n");
            else
            	System.out.print(words.get(temp)+"\n");
        }
	}
}
