import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class toilet {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        char array[] = s.toCharArray();
        int a = 0, b = 0, c = 0;
        char y =array[0];
        if(y=='U'&&array[1]=='D'){
        	a+=2;
        	b++;
        	c++;
        }
        if(y=='D'&&array[1]=='U'){
        	b+=2;
        	a++;
        	c++;
        }
        if(y=='U'&&array[1]=='U')
        	b++;
        if(y=='D'&&array[1]=='D')
        	a++;
        
        for(int i=2;i<array.length;i++){
            if(array[i]=='U'){
                b+=2;
                if(array[i-1]=='D')
                	c++;
            }
            else{
                a+=2;
                if(array[i-1]=='U')
                	c++;
            }
        }
        
        bw.write(a + "\n" + b + "\n" + c);   
        bw.flush();
    }
}
