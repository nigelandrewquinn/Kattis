import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;
public class numberfun 
{
    public static void main(String[] args) throws IOException 
    {
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner scan = new Scanner(System.in);
        int tests = scan.nextInt();
        for(int j = 0; j < tests; j++)
        {
            int a[] = new int[3];
            for(int i = 0; i < a.length; i++)
            {
                a[i] = scan.nextInt();
            }
            Arrays.sort(a);
            if(a[0]+a[1]==a[2] || a[0]*a[1]==a[2])
            {
            	bw.write("Possible" + "\n");
            }
            else
            {
            	bw.write("Impossible" + "\n"); 
            }
        }
        bw.flush();
    }
}
