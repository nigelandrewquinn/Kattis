import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class humancannonball2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
        	String arr[] = br.readLine().split(" ");
        	double v = Double.parseDouble(arr[0]);
        	double o = Double.parseDouble(arr[1]);
        	double x1 = Double.parseDouble(arr[2]);
        	double h1 = Double.parseDouble(arr[3]);
        	double h2 = Double.parseDouble(arr[4]);
        	double num = (v*(x1/(v*Math.cos(Math.toRadians(o))))*Math.sin(Math.toRadians(o)))-((0.5*9.81)*((x1/(v*Math.cos(Math.toRadians(o))))*(x1/(v*Math.cos(Math.toRadians(o))))));
        	if(num+1<h2 && num-1>h1)
        		bw.write("Safe" + "\n");
        	else
        		bw.write("Not Safe" + "\n");
        }
        bw.flush();
	}
}
