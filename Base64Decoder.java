import java.util.Base64;

public class Base64Decoder extends Base64Main 
{
    public String decodeString(String encodedString) 
    {
        // Decode the Base64 string
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);

        // Display the decoded string
        System.out.println("Decoded String: " + decodedString);
        System.out.println();

        return decodedString;
    }
}
