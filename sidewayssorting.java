import java.io.*;
import java.util.*;
public class sidewayssorting{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while(true) {
        	String ar[] = br.readLine().split(" ");
			int r = Integer.parseInt(ar[0]);
    		int c = Integer.parseInt(ar[1]);

    		if(r == 0 && c == 0)
    			break;

        	ar = new String[c];
	
			for (int i = 0; i < ar.length; i++)
				ar[i] = "";
	
			for (int i = 0; i < r; i++){
				String a[] = br.readLine().split("");
		
				for (int j = 0; j < c; j++)
					ar[j] += a[j];
			}
	
			Arrays.sort(ar , new Comparator<String>() {
				public int compare(String str1, String str2) {
				str1 = str1.toUpperCase();
				str2 = str2.toUpperCase();
			
				return str1.compareTo(str2);
			}
			});
	
			for (int i = 0; i < r; i++){
				for (int j = 0; j < ar.length; j++)
					bw.write(""+ar[j].charAt(i));
		
				bw.write("\n");
			}
			bw.write("\n");
		}
		bw.flush();
	}
}
