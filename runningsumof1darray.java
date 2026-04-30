import java.util.*;
public class runninsum {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n,j,sums;
        System.out.println("enter array length"); 
        n=sc.nextInt();
        System.out.println("enter array");
         int a[]=new int[n];
         for(i=0;i<n;i++)
         {
            a[i]=sc.nextInt();
         }
         int sum[]=new int[n];

        for(j=0;j<n;j++)
        {
            sums=0;
            for(i=0;i<=j;i++)
            {
                sums=a[i]+sums;
            }
            sum[j]=sums;
        }
        System.out.println("running sum of 1d");
        for(i=0;i<n;i++)
        {
            System.out.println(sum[i]);
        }
    }
    
}
