//Initialize an array and print the suma and average of the elements

class sum_average
{
    public static void main(String args[])
    {
        int a[]={5,10,15,20,25};
        int sum=0;
        float avg=0;
        for (int i=0; i<a.length; i++)
        {
            sum=sum+a[i];
        }
        avg=sum/a.length;
        System.out.println("Sum of the elements of the array is: "+sum);
        System.out.println("Average of the elements of the array is: "+avg);
    }
}