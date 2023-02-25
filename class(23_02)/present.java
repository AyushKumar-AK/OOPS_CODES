// initialize an array and check if a given number is present in the array or not

public class present {
    public static void main(String args[]){
        int a[]={5,10,15,20,25,30};
        int num=13;
        int pos=0;
        int flag=0;
        for (int i=0; i<a.length;i++){
            if (a[i]==num){
                flag=1;
                pos=i;
                break;
            }
        }
        if (flag==1){
            System.out.println(pos);
        }
        else{
            System.out.println(-1);
        }

    }
}
