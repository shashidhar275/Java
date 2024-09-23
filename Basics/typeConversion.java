class typeConversion{
    public static void main(String args[]){
        /* byte b = 127;
           int c = 425;
           c = b; //Implicit conversion(Automatically)
           System.out.println(c);
           int d = 22;
           b = (byte)d; //Explicit conversion
           System.out.println(b);*/

        /* byte d = (byte) 257;
           System.out.println(d);*/

        /*// float f = (float)5.6; //There is a reason behind this since in Java default is Double data type for any floating value so when we assign ex a = 5.6 here 5.6 is a double datatype value to put it in float variable there is a need of explicit conversion... for doing that we can just use 5.6f or conventional explicit conversion method that is present in this line.
        float f = 5.6f;
        int d = (int) f;
        System.out.println(d);*/

        //Type Promotion : byte * byte is byte value but value will go out of the range but in Java type will get promoted 
        byte a = 10;
        byte b = 30;
        int result = a * b;
        System.out.println(result);
    }
}