
package dip.lab3.student.solution1;

/**
 *
 * @author Jenna
 */
public class ConsoleOutput implements MessageOutput {
    
    @Override
    public void performOutput(String input) {
        System.out.println("Message: " + input);
    }
    
}
