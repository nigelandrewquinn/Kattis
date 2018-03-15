import java.util.Scanner;
public class anewalphabet
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		s = s.toLowerCase();
		String array[] = s.split("");
		for (int i = 0; i < array.length; i++)
		{
		     switch (array[i])
		        	{
		            case " ":  System.out.print(" ");break;
		            case "a":  System.out.print("@");break;
		            case "b":  System.out.print("8");break;
		            case "c":  System.out.print("(");break;
		            case "d":  System.out.print("|)");break;
		            case "e":  System.out.print("3");break;
		            case "f":  System.out.print("#");break;
		            case "g":  System.out.print("6");break;
		            case "h":  System.out.print("[-]");break;
		            case "i":  System.out.print("|");break;
		            case "j":  System.out.print("_|");break;
		            case "k":  System.out.print("|<");break;
		            case "l":  System.out.print("1");break;
		            case "m":  System.out.print("[]\\/[]");break;
		            case "n":  System.out.print("[]\\[]");break;
		            case "o":  System.out.print("0");break;
		            case "p":  System.out.print("|D");break;
		            case "q":  System.out.print("(,)");break;
		            case "r":  System.out.print("|z");break;
		            case "s":  System.out.print("$");break;
		            case "t":  System.out.print("']['");break;
		            case "u":  System.out.print("|_|");break;
		            case "v":  System.out.print("\\/");break;
		            case "w":  System.out.print("\\/\\/");break;
		            case "x":  System.out.print("}{");break;
		            case "y":  System.out.print("`/");break;
		            case "z":  System.out.print("2");break;
		            default:  System.out.print(array[i]);break;

		        	}
		}
	}
}
