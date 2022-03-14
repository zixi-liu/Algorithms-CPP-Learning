import java.math.BigInteger;

public class BinaryConversion {

    /**
     * @param decimalSource
     * @return String
     * @Description: Converting decimal to binary
     */
    public static String decimalToBinary(int decimalSource) {
        BigInteger bi = new BigInteger(String.valueOf(decimalSource)); //Assign to BigInteger, decimal
        return bi.toString(2); //Convert to binary
    }

    /**
     * @param binarySource
     * @return int
     * @Description: Converting binary to decimal
     */
    public static int binaryToDecimal(String binarySource) {
        BigInteger bi = new BigInteger(binarySource, 2);  //Assign to BigInteger, binary
        return Integer.parseInt(bi.toString());     //Convert to decimal
    }

    public static void main(String[] args){}
}
