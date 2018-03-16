import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class backsapce {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        char[] array = s.toCharArray();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--){
        	if (array[i] == '<'){
        		array[i] = ' ';
        		count++;
        	}
        	else if (count > 0){
    		array[i] = ' ';
    		count--;
        	}
    	}
        for(int i = 0; i <array.length; i++) {
        	if(array[i] != ' ')
        		bw.write(array[i]);
        }
		bw.flush();
	}
}
