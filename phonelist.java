import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
public class phonelist {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++)
        	{
        	int x = Integer.parseInt(br.readLine());
        	String[] nums = new String[x];
        	
        	for (int j = 0; j < x; j++)
        		nums[j] = br.readLine();
        	
            Arrays.sort(nums);
            
            boolean consistent = true;
            
            for (int j = 1; j < nums.length; j++)
            	if (nums[j].startsWith(nums[j - 1]))
            		{
            		consistent = false;
            		break;
        			}
            
            if (consistent)
            	bw.write("YES"+"\n");
            else
            	bw.write("NO"+"\n");
        	}       
        bw.flush();
	}
}
