import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class acm {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = new int[26];
        int count = 0, right = 0;
        while(true) {
        	String temp = br.readLine();
        	String arr[] = temp.split(" ");
        	int time = Integer.parseInt(arr[0]);
        	if(time == -1)
        		break;
        	char question = arr[1].charAt(0);
        	String answer = arr[2];
        	if(answer.equals("right")) {
        		right++; 
        		count+= (time+(array[question-'A']*20));
        	}
        	else {
        		array[question-'A']++;
        	}
        }
        
        bw.write(right + " "+ count);
		bw.flush();
	}
}
