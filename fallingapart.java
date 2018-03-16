import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
public class fallingapart{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = 0;
        int b = 0;
        int n = Integer.parseInt(br.readLine());
        int array[] = new int [n];
        String s = br.readLine();
        String arr[] = s.split(" ");
        for(int i = 0; i < n; i++) {
        	 array[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++) {
        	if(i%2==0)
        		a += array[n-i-1];
        	else
        		b+=array[n-i-1];
        }
		
		bw.write(a + " " + b);        
        bw.flush();
	}
}
