class problem20{
    public static void main(String a[]){
        long num=111000111;
        System.out.println("long value into String (Boxing) : "+ Long.toString(num));
        System.out.println("long value into Long instance : "+ Long.valueOf(num));
        String str2="119";
        System.out.println("String instance into long instance : "+ Long.valueOf(str2));
        System.out.println("long value into binary : "+Long.toBinaryString(num));
        System.out.println("long value into hexadecimal : "+Long.toHexString(num));
        System.out.println("long value into octal : "+Long.toOctalString(num));

    }
}
