public class sumOfminTwo
{
    public static void main(String args[])
    {
        Scanner ob= new Scanner(System.in);
        int n,i,sum=0,x,j,k;
        n=ob.nextInt();
        for(i=1;i<=n;i++)
        {
            x=ob.nextInt();
            int arr[] = new int[x];
            for(j=0;j<x;j++)
            arr[j]=ob.nextInt();
            for(j=0;j<x-1;j++)
            {
                for(k=0;k<x-1-j;k++)
                {
                    if(arr[k]>arr[k+1])
                    {
                        int temp = arr[k];
                        arr[k] = arr[k+1];
                        arr[k+1]= temp;
                    }
                }
                
            }
            for(j=0;j<=1;j++)
            {
                sum=sum+arr[j];
            }
            System.out.println(sum);
            sum=0;
        }
        
    }
    
}
