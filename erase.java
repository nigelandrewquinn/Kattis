import java.io.*;
public class erase {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String in = br.readLine();
		String out = br.readLine();
		if(n%2==0) 
			if(in.equals(out))
				bw.write("Deletion succeeded");
			else
				bw.write("Deletion failed");
		else {
			boolean right = true;
			for(int i = 0; i < in.length(); i++) {
				if(in.charAt(i)== out.charAt(i))
					right = false;
			}
			if(right)
				bw.write("Deletion succeeded");
			else
				bw.write("Deletion failed");
			
		}
		
        bw.write("\n");        
        bw.flush();
	}
}
