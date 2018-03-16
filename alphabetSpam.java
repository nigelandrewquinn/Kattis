import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class alphabetSpam {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line= br.readLine();
        double w = 0, l = 0, u = 0, s = 0;
        for(int i = 0; i < line.length(); i++) {
        	int temp = (int) line.charAt(i);
        	if(temp == 95)
        		w++;
        	else if(temp >96 && temp < 123)
        		l++;
        	else if(temp > 64 && temp < 91)
        		u++;
        	else
        		s++;
        }
        bw.write(w/line.length() + "\n" + l/line.length() + "\n" + u/line.length() + "\n" + s/line.length() + "\n");
		bw.flush();
	}
}
