import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class ptice {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] A = {'A', 'B', 'C'}, B = {'B', 'A', 'B', 'C'}, C = {'C', 'C', 'A', 'A', 'B', 'B'};
        int n = Integer.parseInt(br.readLine()), max = 0, a = 0, b = 0, c = 0;
        char[] l = br.readLine().toCharArray();
        for (int i = 0; i < n; i++) {
            if (A[i % 3] == l[i])
                a++;
            if (B[i % 4] == l[i]) 
                b++;
            if (C[i % 6] == l[i])
                c++;
        }
        max = Math.max(a, Math.max(b, c));
        bw.write(max + "\n");
        if (a == max) {
        	bw.write("Adrian" + "\n");
        }
        if (b == max) {
            bw.write("Bruno" + "\n");
        }
        if (c == max) {
            bw.write("Goran" + "\n");
        }
        bw.flush();
	}
}
