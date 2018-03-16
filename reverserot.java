import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class reverserot {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.ABCDEFGHIJKLMNOPQRSTUVWXYZ_.".toCharArray();
        while(true) {
        	String temp = br.readLine();
        	String ans = "";
        	String ar[] = temp.split(" ");
        	int n = Integer.parseInt(ar[0]);
        	if(n == 0)
        		break;
        	String in = new StringBuilder(ar[1]).reverse().toString();
        	for(int i = 0; i < in.length(); i++) {
        		char c = in.charAt(i);
        		for(int j = 0; j < characters.length; j++) {
        			if(c == characters[j]) {
        				bw.write(characters[j+n]);
        				break;
        			}
        		}
        	}
        	bw.write("\n");
        }
		bw.flush();
	}
}
