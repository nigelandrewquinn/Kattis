import java.io.*;
public class differentdistances {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String s = br.readLine();
			if(s.equals("0"))
				break;
			String array[] = s.split(" ");
			double x1 = Double.parseDouble(array[0]);
			double y1 = Double.parseDouble(array[1]);
			double x2 = Double.parseDouble(array[2]);
			double y2 = Double.parseDouble(array[3]);
			double p = Double.parseDouble(array[4]);
			
			bw.write(Math.pow(Math.pow(Math.abs(x1-x2),p) + Math.pow(Math.abs(y1-y2),p), 1/p) + "\n");
		}      
        bw.flush();
	}
}
