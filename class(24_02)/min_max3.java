// initialize an array and print first three min and max values of array
public class min_max3 {
    public static void main(String args[]) {
        int a[]={5,10,15,20,25,30};
        int max1, max2, max3, min1, min2, min3;
        max1=max2=max3=a[0];
        min1=min2=min3=a[0];
        for (int i=0; i<a.length;i++){
            if (a[i]>max1){
                max3=max2;
                max2=max1;
                max1=a[i];
            }
            else if (a[i]>max2){
                max3=max2;
                max2=a[i];
            }
            else if (a[i]>max3){
                max3=a[i];
            }
            if (a[i]<min1){
                min3=min2;
                min2=min1;
                min1=a[i];
            }
            else if (a[i]<min2){
                min3=min2;
                min2=a[i];
            }
            else if (a[i]<min3){
                min3=a[i];
            }
        }
        System.out.println("First three maximum of the elements of the array are: " + max1 + ", " + max2 + ", " + max3);
        System.out.println("First three minimum of the elements of the array are: " + min1 + ", " + min2 + ", " + min3);
        

    }
}
