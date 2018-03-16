import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Scanner;
public class falsesecurity {
	public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner scan = new Scanner(System.in);
        HashMap<String , String> Codes = new HashMap<>();
        HashMap<String , String> Letters = new HashMap<>();
        String[] code = {".-" , "-..." , "-.-." , "-.." , "." , "..-." , "--." , "...." , ".." , ".---" , "-.-" , ".-.." , "--" , "-." , "---" , ".--." , "--.-" , ".-." , "..." , "-" , "..-" , "...-" , ".--" , "-..-" , "-.--" , "--.." , "..--" , ".-.-" , "---." , "----"};
        String[] characters = {"A" , "B" , "C" , "D" , "E" , "F" , "G" , "H" , "I" , "J" , "K" , "L" , "M" , "N" , "O" , "P" , "Q" , "R" , "S" , "T" , "U" , "V" , "W" , "X" , "Y" , "Z" , "_" , "," , "." , "?"};

        for (int i = 0; i < 30; i++){
        	Codes.put(characters[i], code[i]);
        	Letters.put(code[i], characters[i]);
        }

        while (scan.hasNextLine()){
        	String encoded = scan.nextLine();
        	String str = "";
        	String lengths = "";
        	
        	for (int i = 0; i < encoded.length(); i++){
        		str += Codes.get(encoded.substring(i , i+1));
        		lengths = Codes.get(encoded.substring(i , i+1)).length() + lengths;
        	}
        	
        	String decoded = "";
        	int x = 0;
        	for (int i = 0; i < lengths.length(); i++){
        		int length = Integer.parseInt(lengths.substring(i, i + 1));
        		decoded += Letters.get(str.substring(x, x + length));
        		x += length;
        	}
        	bw.write(decoded+ "\n");  
        	bw.flush();
        }
  	}
}
