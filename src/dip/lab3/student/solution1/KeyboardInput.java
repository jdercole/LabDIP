
package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author Jenna
 */
public class KeyboardInput implements MessageInput {
    private String message;
    
    public KeyboardInput() {
        setMessage();
    }

    @Override
    public final String getMessage() {
      return message;
    }

    @Override
    public final void setMessage() {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please enter a message: ");
       String msg = scanner.nextLine();
       if (msg == null || msg.isEmpty()) {
           throw new IllegalArgumentException("Message cannot be null or empty!");
       } else {
           this.message = msg;
       }
    }

    
}
