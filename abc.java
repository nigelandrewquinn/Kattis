import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
public class abc {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        String a[] = s.split(" ");
        int[] array = new int[3];
        for(int i = 0; i < a.length; i++) {
        	array[i] = Integer.parseInt(a[i]);
        }
        Arrays.sort(array);
        s = br.readLine();
        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i)=='A')
        		bw.write(array[0]+" ");
        	if(s.charAt(i)=='B')
        		bw.write(array[1]+" ");
        	if(s.charAt(i)=='C')
        		bw.write(array[2]+" ");
        }
		bw.flush();
	}
}
