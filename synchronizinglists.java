import java.io.*;
import java.util.*;
public class synchronizinglists{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true){
			int n = Integer.parseInt(br.readLine());
			if(n==0) break;

			HashMap<Integer,Integer> map = new HashMap<>();

			int a[] = new int[n];
			int b[] = new int[n];
			int as[] = new int[n];
			for(int i = 0; i < n; i++){ 
				a[i] = Integer.parseInt(br.readLine());
				as[i] = a[i];
			}

			for(int i = 0; i < n; i++) 
				b[i] = Integer.parseInt(br.readLine());

			Arrays.sort(as);
			Arrays.sort(b);

			for(int i = 0; i < n; i++)
				map.put(as[i], b[i]);

			for(int i = 0; i < n; i++)
				bw.write(("" + map.get(a[i])) + "\n");

			bw.write("\n");

		}        
		bw.flush();
	}
}
