/*
 * 8 Create your own int wrapper class.
 * Hint: What are the fields, constructor and which method should your wrapper class 
 include(intValue(), shortValue(), equals() etc. ).
 */
public class MyInt {
    private int value;
    
    public MyInt(int value) {
        this.value = value;
    }

    public int intValue() {
        return value;
    }

    public boolean equals(int val2) {
        return value == val2;
    }

    public short shortValue() {
        return (short) value;
    }

    public static void main(String[] args) {
        MyInt myInt = new MyInt(700000);
        System.out.println(myInt.intValue());
        System.out.println(myInt.shortValue());
    }
}
/*
 *  - filed: private
 *  - constructor
 *  - functions
 */