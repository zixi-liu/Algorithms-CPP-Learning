
public class main {
    public static void main(String[] args) {
        int a = 53;
        String b = "110101";
        System.out.println(String.format("Number %d in binary is %s", a, BinaryConversion.decimalToBinary(a))); //Converting decimal to binary
        System.out.println(String.format("Number %s in decimal is %d", b, BinaryConversion.binaryToDecimal(b))); //Converting binary to decimal
    }
}