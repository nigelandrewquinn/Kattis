import java.io.*;
import java.util.*;
public class estimatingtheareaofacircle {
		public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			while(true) {
				String ar[] = br.readLine().split(" "); 
				if(ar[0].equals("0"))
					break;
				double x = Double.parseDouble(ar[0]), y = Double.parseDouble(ar[1]), z = Double.parseDouble(ar[2]);
				System.out.print(Math.PI*(x*x) + " ");
				System.out.println((z/y)*4*(x*x));				
			}
		}
}
