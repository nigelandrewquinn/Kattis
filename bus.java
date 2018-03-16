
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class bus {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[31];
        nums[0] = 0;

        for (int i = 1; i < 31; i++) {
        	nums[i] = (int)(2 * (nums[i - 1] + 0.5));
        }
        for (int i = 0; i < n; i++){
        	int x = Integer.parseInt(br.readLine());
        	bw.write(nums[x]+ "\n");
        	}
		bw.flush();
	}
}
