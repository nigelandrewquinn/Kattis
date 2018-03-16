import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class guess {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int min = 1;
		int max = 1000;
		int X = (min + max) / 2;
		bw.write(X + "\n");
		bw.flush();
		while (true){
			String s = br.readLine();
			if (s.equals("higher")){
				min = X;
				X = (min + max + 1) / 2;
			}
			if (s.equals("lower")){
				max = X;
				X = (min + max) / 2;
			}
			if (s.equals("correct"))
				break;
			bw.write(X + "\n");
			bw.flush();
		}
	}
}
