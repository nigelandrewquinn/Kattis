import java.io.*;
import java.util.*;
public class room{
    public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String [] ar = br.readLine().split(" ");
      HashSet<Integer> set = new HashSet<Integer>();            
      
      for(int i = 0; i < Integer.parseInt(ar[1]); i++)
        set.add(Integer.parseInt(br.readLine()));
      if(ar[0].equals(ar[1]))
        System.out.print("too late");
      else
        for(int i = 1; i < Integer.parseInt(ar[0])+1; i++)
          if(!set.contains(i)){
            System.out.print(i);
            break;
          }
    }
}
