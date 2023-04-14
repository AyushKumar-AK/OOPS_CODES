package p1;

public class p1 {
    // function for factorial
    public int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;        
    }
}
