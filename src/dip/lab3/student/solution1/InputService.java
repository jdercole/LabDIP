
package dip.lab3.student.solution1;

/**
 *
 * @author Jenna
 */
public class InputService {
    private MessageInput msgInput;

    public final MessageInput getMsgInput() {
        return msgInput;
    }

    public final void setMsgInput(MessageInput msgInput) {
        this.msgInput = msgInput;
    }
    
    public void performInput(MessageInput msg) {
        msgInput.performInput(msg);
    }
    
}
