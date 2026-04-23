import java.util.*;
public class sumof1djava
{
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        int i,sum=0;
        System.out.println("enter array length");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elemnt");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
         
        for(i=0;i<n;i++)
        {
            sum=a[i]+sum;
        }
        System.out.println("sum of elements="+sum);
        sc.close();
    }
}
