import java.util.*;
public class busnumbers{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] array = new int[num];
		for (int i = 0; i < num; i++){
			array[i] = (scan.nextInt());
		}
		Arrays.sort(array);
		for (int i = 0; i < num; i++){
			int l = 1;
			System.out.print(array[i]);
			for(int j = 1; i + j < array.length; j++){
				if (array[i + j] == array[i + j - 1] + 1)
					l++;
				else
					break;
			}
			if (l > 2){
				System.out.print("-" + (array[i] + l - 1) + " ");
				i += l - 1;
			}
			else
				System.out.print(" ");	
		}
	}
} 
	
