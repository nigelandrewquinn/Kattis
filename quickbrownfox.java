import java.util.Scanner;
public class Main {
  public static void main(String[] args) {   
        Scanner scan = new Scanner(System.in);
        int q = Integer.parseInt(scan.nextLine());
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for(int i = 0; i < q; i++){
          int array[] = new int[26];
          String s = scan.nextLine();
          s = s.toLowerCase();
          
          for(int j = 0; j < s.length(); j++){
            if((int)s.charAt(j)>=97 && (int)s.charAt(j)<123)
              array[s.charAt(j)-'a']++;
          }
          String temp = "";
          
          for(int j = 0; j < array.length; j++){
            if(array[j]==0)
              temp = temp+alphabet.charAt(j);
          }
          if(temp.length()==0)
            System.out.println("pangram");
          else
            System.out.println("missing " + temp);
        }
  }
}
