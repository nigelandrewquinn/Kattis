import java.io.*;
public class statistics {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int count = 1; 
		
		while (s != null){
			int lowest = Integer.MAX_VALUE, highest = Integer.MIN_VALUE;
			String ar[] = s.split(" ");
			
			for(int i = 1; i < ar.length; i++){
				if(Integer.parseInt(ar[i]) < lowest)
					lowest = Integer.parseInt(ar[i]);
				if(Integer.parseInt(ar[i]) > highest)
					highest = Integer.parseInt(ar[i]);
			}

			System.out.println("Case " + count++ + ": " + lowest + " " + highest + " " + (highest - lowest));
			s = br.readLine();
		}
	}
}

