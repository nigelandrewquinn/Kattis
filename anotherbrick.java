import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class anotherbrick {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s[] = br.readLine().split(" ");
        int h = Integer.parseInt(s[0]);
        int w = Integer.parseInt(s[1]);
        int n = Integer.parseInt(s[2]);
        String bricks = br.readLine();
        String brick[] = bricks.split(" ");
        int[] array = new int [brick.length];
		for(int i = 0; i < n; i++) {
        	array [i] = Integer.parseInt(brick[i]);
        }
		
        boolean end = false;
        int j = 0;
        while(h > 0) {
        	int temp = w;
        	while(j < array.length) {
        		temp -= array[j];
        		j++;
        		if(temp==0)
        			break;
        		if(temp < 0) {
        			end = true;
        			break;
        		}
        	}
        	h--;
        	if(end == true)
        		break;
        }
        
        if(end == true)
        	bw.write("NO"); 
        else
        	bw.write("YES");
        bw.flush();
	}
}
