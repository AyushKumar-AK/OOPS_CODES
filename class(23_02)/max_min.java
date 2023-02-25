// initialize an array and print the maximum and minimum of the elements
public class max_min {
    public static void main(String args[]) {
        int a[]={5,10,15,20,25,30};
        int max=a[0];
        int min=a[0];
        for (int i=0; i<a.length;i++){
            if (a[i]>max){
                max=a[i];
            }
            if (a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Maximum of the elements of the array is: " + max);
        System.out.println("Minimum of the elements of the array is: " + min);
    }
}
