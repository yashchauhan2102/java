public class TypeCasting {
    public static void main(String[] args){
        int a =257;
        byte b = (byte) a;

        float f = 5.6f;

        int num = (int)f;

        System.out.println(b);
        System.out.println(num);

        byte byte1 = 10;
        byte byte2= 2;
        int result = byte1 * byte2;
        System.out.println(result);

        float byte3 = -2.1f;
        byte byte4= 2;
        boolean result2 = byte3 > byte4;
        System.out.println(result2);
    }
}
