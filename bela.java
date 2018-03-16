import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class bela{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int ans = 0, answer = 0;
        String n = br.readLine();
        String ar[] = n.split(" ");
        int num = (Integer.parseInt(ar[0])*4);
        String dominant = ar[1];
		String cards[] = new String[num];
		String suits[] = new String[num];
		
		for(int i = 0; i < num; i++) {
			String temp = br.readLine();
			cards[i] = temp.split("")[0];
			suits[i] = temp.split("")[1];
		}
		for(int i = 0; i < num; i++) {
			if(suits[i].equals(dominant)) {
				String decision = cards[i];
				switch(decision) {
				case "A" : ans += 11; break;
				case "K" : ans += 4; break;
				case "Q" : ans += 3; break;
				case "J" : ans += 20; break;
				case "T" : ans += 10; break;
				case "9" : ans += 14; break;
				case "8" : ans += 0; break;
				case "7" : ans += 0; break;
				}
			}
			else{
				String decision = cards[i];
				switch(decision) {
				case "A" : ans += 11; break;
				case "K" : ans += 4; break;
				case "Q" : ans += 3; break;
				case "J" : ans += 2; break;
				case "T" : ans += 10; break;
				case "9" : ans += 0; break;
				case "8" : ans += 0; break;
				case "7" : ans += 0; break;
				}	
			}
		}
		System.out.print(ans);        
	}
}
