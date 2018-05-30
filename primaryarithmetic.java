import java.io.*;
import java.util.*;
public class primaryarithmetic {
		public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			while(true) {
				String ar[] = br.readLine().split(" ");
				if(ar[0].equals("0") && ar[1].equals("0"))
					break;
				String n[] = ar[0].split("");
				String m[] = ar[1].split("");
				boolean carry = false;
				int count = 0;
				int nl = n.length;
				int ml = m.length;
				int x = 0;
				int y = 0;

				while (ml > 0 || nl > 0){
					ml--;
					nl--;
					if(ml < 0) 
						x = 0;
					else 
						x = Integer.parseInt(m[ml]);
					
					if(nl < 0) 
						y = 0;
					else
						y = Integer.parseInt(n[nl]);

					if(carry)
						if((x+y+1)<10){
							carry = false;
						}
						else 
							count++;
					else
						if((x+y)>9){
							carry = true; 
							count++;
						}

				}

				if(count == 0)
                	bw.write("No carry operation." + "\n");
           		else if(count == 1)
                	bw.write((""+count) + " carry operation." + "\n");
            	else 
                	bw.write((""+count) + " carry operations." + "\n");	
			}		
		

		bw.flush();		
		}
}
