public class TildeSymbol {
    public static void main ( String[] args){
        int a = 3;
        int b = 6;

        int val1 = (~a&b);
        int val2 = (a & ~b);

        int result = val1 | val2;

        System.out.println(val1 + "  " + val2 + "  " + result);
    }
}
