package searching;
import java.util.*;
public class LinearSearch 
{
    public static void main(String[] args) 
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

        /*Transverse the loop linearly and break the loop as soon as element is found */
        for(int i=0; i<n; i++)
        {
            if(a[i] == m)
            {
                pos = i;
                break;
            }
        }

        if(pos == -1)
        {
            System.out.println("Element not found");
        }
        else
        {
            pos = pos + 1;
            System.out.println("Element found at " + pos + "position");
        }

        sc.close();
        
    }
    
}