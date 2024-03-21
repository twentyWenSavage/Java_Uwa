/**
 Key: 
 1 - the maths function: Math.pow(a, b)
 2 - write in output: (int)Math.pow(a, b)
 */
public class PowerTable {
    public static void main(String[] args) {
        System.out.println("a b pow(a, b)");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " " + (i + 1) + " " + (int)Math.pow(i, i+1));
        }
    }
}
