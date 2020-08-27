package searching;
import java.util.*;
public class InterpolationSearch 
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

        int low=0;
        int high = n-1;
        
        /*Since array is sorted element must be present in range defined by corner cases */
        while(low <= high && m >=a[low] && m<=a[high])
        {
            /*When gap between two pointers become 0 */
            if(low == high)
            {
                if(m == a[low])
                {
                    pos = low;
                    break;
                }
            }
            else
            {
                /*Formula to return high value if element is close to a[high] and low if close to a[low] */
                int mid = low + (((high-low) / (a[high]-a[low]))*(m - a[low])); 

                if(a[mid] == m)
                {
                    pos = mid;
                    break;
                }
                else if(a[mid] < m)
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid-1;
                }

            }
        }

        if(pos == -1)
        {
            System.out.println("Element not found");
        }
        else
        {
            pos = pos+1;
            System.out.println("Element found at " + pos + " position");
        }

        sc.close();
    }
    
}