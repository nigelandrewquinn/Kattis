import java.io.*;
import java.util.*;
public class pauleigon{
		public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine();
			int N = Integer.parseInt(s.split(" ")[0]), P = Integer.parseInt(s.split(" ")[1]), Q = Integer.parseInt(s.split(" ")[2]);
			if((P+Q)/N%2==0)
				System.out.print("paul");
			else
				System.out.print("opponent");
		}
}
