public class TypeConv {
    public static void main(String[] args) {
        /* Implicit conversion :
         * while converting a smaller datatype to a larger
         * datatype we do not need to explicitly mention 
         * that we are assigning a smaller datatype.
         * Here we can assign byte data to other datatype
         * since it is the smallest number datatype */
        byte b = 127;
        int i = b;
        short s = b;
        long l = b; 
        //  There are 256 characters so we can convert it to integer 
        //  format when any datatype higher than byte is used
        //  converts to its ascii value
        char ch = 'a';
        i = ch;
        System.out.println(i);

        /*Explicit conversion:
         * When we are using larger value to a smaller datatype 
         * it is automatically converted to its range
         * for example */

        //  i = 128;
        //  b = i;

        /*This causes error because a larger value is being stored
         * int it which may cause loss of data 
         * so we explicitly mention if needed.*/
         i = 128;
         b = (byte) i;
         System.out.println(b);
        //  If printed it will convert to its byte range like
        //  1000 0000 which cause it to become -128
        //  Other examples
        //  Float Here all numbers next to decimal are removed
        float f = 12.53f;
        i = (int) f;
        System.out.println(i);
        double d = 1.678302;
        f = (float) d;
        //  Should be casted explicitly
        d = f;
        // Widening so no casting is required
    }
}
