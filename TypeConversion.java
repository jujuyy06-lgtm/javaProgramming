public class TypeConversion{
    public static void main(String[] args) {
        byte b = 127;
        int i = 100;
        System.out.println(b+i);
        System.out.println(10/4);
        System.out.println(10.0/4);
        System.out.println((char)0x12340041);
        System.out.println((byte)(b+1));        
        System.out.println((int)2.9 + 1.8);     //2.9만 반올람해서 더하기
        System.out.println((int)(2.9 + 1.8));       //더한 값에서 반올람
        System.out.println((int)2.9 + (int)1.8);        //각각 반올림
    }


}