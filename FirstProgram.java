public class FirstProgram {

    public static void main(String[] args) {
        
        int a = 500, b = 25000, c = 35000;
        int big, small;
        
        // Initialize big and small
        big = a;
        small = a;
        
        // Compare with b
        if (b > big) {
            big = b;
        }
        if (b < small) {
            small = b;
        }
        
        // Compare with c
        if (c > big) {
            big = c;
        }
        if (c < small) {
            small = c;
        }

        System.out.println("The bigger number is: " + big);
        System.out.println("The smaller number is: " + small);
    }
}
