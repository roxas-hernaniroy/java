//Roxas, Hernani Roy B.
//CITCS 1B-B
import java.util.Scanner;
public class RadixConvF {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        int programState = 1;
        
        while (programState < 2) {
            System.out.println("Enter input:");
            
            if (!userInput.hasNextLong()) {
                String textInput = userInput.nextLine();
                switch (textInput) {
                    case "STOP":
                        System.out.println("Closing...");
                        programState++;
                        break;
                    default:
                        break;
                }
            } else {
                long numberInput = userInput.nextLong();
            
                System.out.println("Enter desired base:");
                int radix = userInput.nextByte();
        
                switch (radix) {
                    case 16:
                        String decimalToHex = Long.toString(numberInput, 16);
                        System.out.println("Hexadecimal Result: " + decimalToHex);
                        break;
                    case 8:
                        String decimalToOctal = Long.toString(numberInput, 8);
                        System.out.println("Octal Result: " + decimalToOctal);
                        break;
                    case 2:
                        String decimalToBinary = Long.toString(numberInput, 2);
                        System.out.println("Binary Result: " + decimalToBinary);
                        break;
                    default:
                        System.out.println("Work in progress, choose between 2/8/16");
                }
            }
        }
    }
}
