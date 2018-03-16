import java.util.*;
public class closingtheloop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tests = Integer.parseInt(scan.next());
		int ans = 0;
		int count = 1;
		for(int i = 0; i < tests; i++){
			int ropes = Integer.parseInt(scan.next());
			if(ropes == 1){
				String s = scan.next();
				System.out.println("Case #" + count + ": 0");
				count++;
			}
			//sort through and see how many of each
			else {
				int countR = 0;
				int countB = 0;
				String array[] = new String[ropes];
				for(int j = 0; j < ropes; j++) {
					array[j] = scan.next();
					String temp = array[j];
					if(temp.charAt((temp.length()-1))=='R') {
						countR++;
						}
					else {
						countB++;
						}
				}

				//now we have the counts, fill up both arrays
				int red[] = new int[countR];
				int blue[] = new int[countB];
				//fill both arrays
				countR=0;
				countB=0;
				for(int j = 0; j < ropes; j++) {
					String temp = array[j];
					if(temp.charAt(temp.length()-1)=='R') {
						red[countR] = Integer.parseInt(temp.substring(0, temp.length()-1));
						countR++;
					}
					else if(temp.charAt(temp.length()-1)=='B') {
						blue[countB] = Integer.parseInt(temp.substring(0, temp.length()-1));
						countB++;
					}
				}
				//sort both arrays
				Arrays.sort(red);
				Arrays.sort(blue);
				for(int j = 0; j < red.length/2; j++)
				{
					int temp = red[j];
					red[j] = red[red.length-1-j];
					red[red.length-1-j]=temp;
				}
				for(int j = 0; j < blue.length/2; j++)
				{
					int temp = blue[j];
					blue[j] = blue[blue.length-1-j];
					blue[blue.length-1-j]=temp;
				}
				//find the length of the loop
				int length = red.length;
				if(blue.length < length)length = blue.length;
				countR=0;countB=0;
				for(int j = 0; j < length; j++) {
					ans =ans + (red[countR]-1) + (blue[countB]-1);
					countR++;countB++;
				}
				System.out.println("Case #" + count + ": " + ans);
				count++;			
				ans = 0;
			}
		}
	}

}
