import java.io.*;
public class drmmessages {
		public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine();
			String[] one = s.substring(0,s.length()/2).split("");
			String[] two = s.substring(s.length()/2).split("");
			String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			a += a;
			int n = 0;
			int m = 0;
			for(int i = 0; i < s.length()/2; i++){
				n += (int) one[i].charAt(0)-'A';
				m += (int) two[i].charAt(0)-'A';
			}
			n %= 26;
			m %= 26;
			String w1 = "";
			String w2 = "";
			for(int i = 0; i < s.length()/2; i++){
				char x = a.charAt(((int) one[i].charAt(0)-'A')+n);
				String temp = "" + x;
				w1 += temp;
				char y = a.charAt(((int) two[i].charAt(0)-'A')+m);
				temp = "" + y;
				w2 += temp;
				System.out.print(a.charAt(((int) w2.charAt(i)-'A')+((int) w1.charAt(i)-'A')));
			}			
		}
}
