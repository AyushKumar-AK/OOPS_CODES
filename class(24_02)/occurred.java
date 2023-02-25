//WAP to print the element of an array that has occurred the highest number of times.
public class occurred {
    public static void main(String args[]){
        int arr[]={81,58,74,46,25,81,81,58,25,25,25};
        int n = arr.length;
        int maxCount = 0;
        int maxElement = arr[0];
        
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxElement = arr[i];
            }
        }
        
        System.out.println("The element that occurred the highest number of times is: " + maxElement);
    }
}
