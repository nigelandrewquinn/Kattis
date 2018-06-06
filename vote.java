import java.io.*;
import java.util.*;
public class vote {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++){
			int majority = 0;
			boolean noWinner = false;
			int n = Integer.parseInt(br.readLine());
			int ar[] = new int[n];
			int greatest = 0;
			int num = 1;
			
			for(int j = 0; j < n; j++){
				ar[j] = Integer.parseInt(br.readLine());
				majority+=ar[j];
				if(ar[j] == greatest)
					noWinner = true;
				if(ar[j] > greatest){
					greatest = ar[j];
					num = j+1;
					noWinner = false;
				}
			}

			majority /=2;
			if(noWinner)
				bw.write("no winner" + "\n");
			else{
				if(greatest>majority)
					bw.write("majority winner " + String.valueOf(num) + "\n");
				else
					bw.write("minority winner " + String.valueOf(num) + "\n");
			}
		}
		bw.flush();
	}
}
