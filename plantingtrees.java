import java.util.*;
public class plantingtrees 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int array [] = new int [t];
        for ( int i = 0; i < t; i++)
        {
            array[i] = scan.nextInt();
        }
        int ans = 1;
        int count = 2;
        Arrays.sort(array);
        int arr[] = new int[t];
        t--;
        for ( int i = 0; i < array.length; i++)
        {
            arr[i] = array[t];
            t--;
        }
        for ( int i = 0; i < array.length; i++)
        {
            if ( (arr[i]+count) > ans)
            {
                ans = arr[i] + count;
            }
            count++;
        }
        System.out.println(ans);        
    }
}
