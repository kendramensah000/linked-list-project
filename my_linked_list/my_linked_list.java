import java.util.LinkedList; 
import java.util.Scanner; 
/** 
 * This program reads a list of integer numbers from user input
 * This program reads a list of integers and sorts them in ascending order
 * The user must type numbers continously, pressing enter after each number, 
 * and type done to finish input
 * 
 * @author Kendra Mensah
 */
public class my_linked_list { 
    /**
     * The main method that runs the program. It reads intehers from the user 
     * stores them in a LinkedList, and sorts the list before printing it
     */ 
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in); 
        // Use list to store sorted numbers 
        // Code reuse: Method to handle Linked List operations  
        LinkedList<Integer> numbers = new LinkedList<>(); 
        
        // Print elements out in ascending order (Smallest to Largest)
        System.out.println("Please enter your integers (type 'done' to finish)");
        
        // Loop to read numbers continously until 'done' is typed 
        while (true) { 
            String input = myNum.nextLine(); 

            if (input.equalsIgnoreCase("done")) {
                // Code to exit the loop
                break;
            }
            
            try {
                // Convert input to integer 
                // Code reuse Java's built Integer.parseInt()
                int number = Integer.parseInt(input); 
                numbers.add(number); 
                // Add to LinkedList 
            } catch (NumberFormatException e) {
                // Handle invalid input 
                System.out.println("Invalid input. Please enter an integer or 'done' to finish.");
            }
        }

        // Sort the LinkedList from smallest to largest
        numbers.sort(Integer::compareTo);

        // Print the sorted list
        System.out.println("Sorted numbers: " + numbers);
    }
}
