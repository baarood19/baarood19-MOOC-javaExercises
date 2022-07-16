
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int container1=0,container2=0;

        while (true) {
            System.out.println("First: " + container1 +"/100");
            
            System.out.println("Second: " + container2 +"/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if(amount < 0) {
                continue;
            }
            
            if(command.equals("add")) {
                container1 += amount;
                container1 = container1 > 100 ? 100 : container1;
            } else if(command.equals("move")) {
                int fetch;
                if(amount > container1) {
                   fetch = container1; 
                   container1 = 0;
                } else {
                    fetch = amount;
                    container1 -= amount;
                }
               
                
                container2 += fetch;
                container2 = container2 > 100 ? 100 : container2;
            } else if(command.equals("remove")) {
                
                container2 -= amount;
                container2 = container2 < 0 ? 0 : container2;
                
            }

        }
    }

}
