import java.io.*;
import java.util.*;
public class egypt {
  public static void main(String[] args)throws IOException{

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while(true){
      String s = br.readLine();
      String [] array = s.split(" ");
      int arr[] = new int[3];
      for(int i = 0; i < 3; i++){
        arr[i] = Integer.parseInt(array[i]); 
      }
      Arrays.sort(arr);
      int a = arr[0];
      int b = arr[1];
      int c = arr[2];
      if(a == 0 && b==0 && c==0)
        break;
      if((a*a)+(b*b) == (c*c))
        bw.write("right"+"\n");
      else 
        bw.write("wrong"+"\n");
    }
    bw.flush();
  }
}
