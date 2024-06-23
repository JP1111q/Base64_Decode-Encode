import java.util.Scanner;

public class Base64_Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while(running)
        {
        	System.out.println("Choose an option:");
            System.out.println("1. Encode \n2. Decode \n3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if(choice == 1) 
            {
                System.out.print("Enter the string to encode into Base64: ");
                String originalString = scanner.nextLine();

                Base64Encoder encoder = new Base64Encoder();
                encoder.encodeString(originalString);
            } 
            else if(choice == 2) 
            {
                System.out.print("Enter the Base64 encoded string to decode: ");
                String encodedString = scanner.nextLine();

                Base64Decoder decoder = new Base64Decoder();
                decoder.decodeString(encodedString);
            } 
            else if(choice == 3)
            {
            	System.out.println("Exiting the program");
            	running = false;
            }
            else 
            {
                System.out.println("Invalid choice. Please choose either 1, 2 or 3.");
            }
        }

        scanner.close();
    }
}
