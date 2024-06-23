import java.util.Base64;

public class Base64Encoder extends Base64Main 
{
    public String encodeString(String originalString) 
    {
        // Encode the string into Base64
        String encodedString = Base64.getEncoder().encodeToString(originalString.getBytes());

        // Display the encoded string
        System.out.println("Encoded String: " + encodedString);
        System.out.println();

        return encodedString;
    }
}
