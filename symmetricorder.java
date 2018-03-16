import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class symmetricorder {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine()), count = 1;
        while (n != 0) {
            for (int i = 0; i < n; i++) {
                if ((i & 0x1) == 0x1) stack.push(br.readLine());
                else queue.add(br.readLine());
            }
            bw.write("SET " +  count++ + "\n");
            while (!queue.isEmpty()) {
            	bw.write(queue.poll() + "\n");
            }
            while (!stack.isEmpty()) { 
            	bw.write(stack.pop() + "\n");
            }
            bw.flush();
            n = Integer.parseInt(br.readLine());
        }		
	}
}
