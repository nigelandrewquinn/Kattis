import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class detailedDifferences {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tests = Integer.parseInt(br.readLine());
        for(int i = 0; i < tests; i++) {
        	String s1 = br.readLine();
        	String s2 = br.readLine();
        	bw.write(s1 + "\n" + s2 + "\n");
        	for(int j = 0; j < s1.length(); j++) {
        		if(((int) s1.charAt(j))==((int) s2.charAt(j)))
        			bw.write(".");
        		else 
        			bw.write("*");
        	}
        	bw.write("\n"+"\n");
        }
		bw.flush();
	}
}
