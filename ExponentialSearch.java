package searching;
import java.util.*;
public class ExponentialSearch 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int m = sc.nextInt();

        int pos =-1;

        /* If element found at 0th position then return position directly */
        if(a[0] == m)
        {
            pos = 0;
        }
        else
        {
            int i=1;
            /*Double the size of subarray till the last element of array becomes greater than the given element */
            while(i < n)
            {
                if(a[i] <= m)
                {
                    i = i*2;
                }
                else
                {
                    break;
                }
            }

        /*Element must be greater than i/2 beacuse it was not found in previous iteration */
        int fir = i/2;
        int last = Math.min(i, n);
        int mid = (fir + last)/2;

        /*Perform binary search in range */
        while(fir <= last)
        {
            if(a[mid] == m)
            {
                pos = mid;
                break;
            }
            else if(a[mid] < m)
            {
                fir = mid+1;
            }
            else
            {
                last = mid-1;
            }
        }
        }

        if(pos == -1)
        {
            System.out.println("Element not found");
        }
        else
        {
            pos = pos + 1;
            System.out.println("Element found at " + pos + " position");
        }

        sc.close();
    }
    
}