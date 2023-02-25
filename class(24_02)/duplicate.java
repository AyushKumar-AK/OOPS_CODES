// remove duplicates from array
public class duplicate {
    public static void main(String args[]){
        int a[]={5,10,15,20,25,30,5,10,16,20,25,30};
        int b[]=new int[a.length];
        int k=0;
        for (int i=0; i<a.length;i++){
            int flag=0;
            for (int j=0; j<i;j++){
                if (a[i]==a[j]){
                    flag=1;
                    break;
                }
            }
            if (flag==0){
                b[k]=a[i];
                k++;
            }
        }
        for (int i=0; i<k;i++){
            System.out.print(b[i]+" ");
        }
    }
}
