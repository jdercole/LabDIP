
package dip.lab3.student.solution1;

/**
 *
 * @author Jenna
 */
public class StartUp {
    public static void main(String[] args) {
        MessageInput message = new KeyboardInput();
        MessageOutput output = new ConsoleOutput();
        MessageService messageService = new MessageService(output, message.getMessage());
        messageService.performOutput();
    }
}
