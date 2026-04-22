import java.util.*;
public class largest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        int i,m;
        System.out.println("enter array length");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elemnt");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
         //reverse array
        m=a[0];
        for(i=1;i<0;i++)
        {
            if(a[i]>m)
            {
                m=a[i];
            }
        }
        System.out.println("largest element is"+m);

    }
}
