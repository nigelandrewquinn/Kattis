import java.io.*;
import java.util.*;
public class zoo {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int list = 1;
        while(true) {
        	HashMap<String , Integer> counts = new HashMap<>();
        	ArrayList<String> names = new ArrayList<>();
        	
        	int n = Integer.parseInt(br.readLine());
        	if(n==0)
        		break;
        	else {
        		bw.write("list " + list + ":" + "\n");
        		list++;
        	}
        	for(int i = 0; i < n; i++) {
        		String s = br.readLine();
        		s = s.substring(s.lastIndexOf(" ") + 1).toLowerCase();
        		if(!names.contains(s)) {
        			names.add(s);
        			counts.put(s,1);
        		}
        		else
        			counts.put(s, counts.get(s)+1);
        	}
        	Collections.sort(names);
        	for (int i = 0; i < names.size(); i++)
        		bw.write(names.get(i) + " | " + counts.get(names.get(i)) + "\n");
        	}
        bw.flush();
	}         
}
