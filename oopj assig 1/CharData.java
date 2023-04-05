/*
10.Write a program to perform below operations on char type to 
get:
a. The number of bits used to represent a char value
b. The number of bytes used to represent a char value
c. The minimum value a char
d. The maximum value a char
 */

class CharData{
    public static void main(String[] args){

        System.out.println("for "+ Character.TYPE + " type\n"
                                        + "==================");

        System.out.println("Size : " + Character.SIZE); 

        System.out.println("bytes : " + Character.BYTES);

        System.out.println("MIN Value : " + (int)Character.MIN_VALUE);

        System.out.println("Max Value : " + (int)Character.MAX_VALUE);
    }
}

