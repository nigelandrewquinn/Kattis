import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class pizzaCrust {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        String array[] = s.split(" ");
        double r = Double.parseDouble(array[0]),c = Double.parseDouble(array[1]);
        System.out.print(100 * ((r-c)*(r-c)) / (r*r));
		bw.flush();
	}
}
