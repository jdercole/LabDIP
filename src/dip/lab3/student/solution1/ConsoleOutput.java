
package dip.lab3.student.solution1;

/**
 *
 * @author Jenna
 */
public class ConsoleOutput implements MessageOutput {

    @Override
    public void performOutput(MessageInput msg) {
        System.out.println("Message: " + msg);
    }
    
}
