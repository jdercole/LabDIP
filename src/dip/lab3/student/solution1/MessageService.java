
package dip.lab3.student.solution1;

/**
 *
 * @author Jenna
 */
public class MessageService {
    private MessageOutput msgOutput;
    private String msgInput;
    
    public MessageService(MessageOutput msgOutput, String msgInput) {
        setMsgOutput(msgOutput);
        setMsgInput(msgInput);
    }

    public final MessageOutput getMsgOutput() {
        return msgOutput;
    }

    public final void setMsgOutput(MessageOutput msgOutput) {
        this.msgOutput = msgOutput;
    }

    public final String getMsgInput() {
        return msgInput;
    }

    public final void setMsgInput(String msgInput) {
        if (msgInput == null || msgInput.isEmpty()) {
            throw new IllegalArgumentException("Cannot be empty!");
        } else {
            this.msgInput = msgInput;
        }
    }
    
    public final void performOutput() {
        msgOutput.performOutput(msgInput);
    }
 
}
