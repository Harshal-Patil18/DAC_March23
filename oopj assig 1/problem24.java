class problem24{
    public static void main(String a[]){
        float num=12.3f;
        System.out.println("Float value into String (Boxing) : "+ Float.toString(num));
        System.out.println("Float value into Float instance : "+ Float.valueOf(num));
        String str2="14.8f";
        System.out.println("String instance into Float instance : "+ Float.valueOf(str2));
        System.out.println("Float value into hexadecimal : "+Float.toHexString(num));

    }
}
