package searching;
import java.util.*;
public class BinarySearch 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the sorted array");
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int m = sc.nextInt();

        int pos =-1;
        int fir = 0;
        int last = n-1;
        int mid = (fir + last)/2;

        /*Iterate through the array till fir pointer is smaller than last */
        while(fir <= last)
        {
            if(a[mid] == m)
            {
                pos = mid;
                break;
            }
            /*If required element is greater than the middle element of array than binary search is performed in second half of array*/
            else if(a[mid] < m)
            {
                fir = mid+1;
            }
            /*If required element is smaller than the middle element of array than binary search is performed in first half of array*/
            else
            {
                last = mid-1;
            }
        }

        if(pos == -1)
        {
            System.out.println("Element not found");
        }
        else
        {
            pos = pos +1;
            System.out.println("Element found at " + pos + " position");
        }

        sc.close();
    }
    
}