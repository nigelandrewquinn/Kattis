import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class quiteaproblem  {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        while (line != null) {
            line = line.toLowerCase();
            System.out.println(line.contains("problem") ? "yes" : "no");

            line = br.readLine();
        }
    }
}


