import java.util.*;
public class StackingCups 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int cups = Integer.parseInt(scan.next());
		int arrayRadius[] = new int[cups];
		String arrayColour[] = new String[cups];
		for (int i = 0; i < cups; i++)
		{
			String array[] = new String[2];
			for(int j = 0; j < array.length; j++){
				array[j] = scan.next();
			}
			if (array[0].matches("\\d+")) {
				int temp = Integer.parseInt(array[0]);
				temp = temp/2;
				arrayRadius[i] = temp;
				arrayColour[i] = array[1];
			}
			else{
				int temp = Integer.parseInt(array[1]);
				arrayRadius[i] = temp;
				arrayColour[i] = array[0];
			}
		}
		for(int i = 0; i < arrayRadius.length; i++) {
            for(int j = i+1; j < arrayRadius.length; j++) {
                if(arrayRadius[i] > arrayRadius[j]) 
                {
                    int temp = arrayRadius[i];
                    String tmp = arrayColour[i];
                    arrayRadius[i] = arrayRadius[j];
                    arrayColour[i] = arrayColour[j]; 
                    arrayRadius[j] = temp; 
                    arrayColour[j] = tmp;
                }
            }
		}
		for(int i = 0; i < cups; i++) {
			System.out.println(arrayColour[i]);
		}
	}
}
