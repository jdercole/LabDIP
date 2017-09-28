
package dip.lab3.student.solution1;

/**
 *
 * @author Jenna
 */
public class StartUp {
    public static void main(String[] args) {
        MessageInput input = new KeyboardInput("Hello");
        MessageOutput output = new ConsoleOutput();
        
        OutputService outputService = new OutputService(output);
        
        outputService.performOutput(input);
    }
}
