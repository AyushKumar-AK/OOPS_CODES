//initialize an array with ascii values and print the corresponding character values in a single row
public class ascii {
    public static void main(String args[]) {
        int a[]={65,66,67,97,98,99};
        for (int i=0; i<a.length;i++){
            System.out.println(a[i]+" ASCII Value: "+(char)a[i]);
        }
    }
}
