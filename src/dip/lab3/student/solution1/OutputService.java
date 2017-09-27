
package dip.lab3.student.solution1;

/**
 *
 * @author Jenna
 */
public class OutputService {
    private MessageOutput msgOutput;
    
    public OutputService(MessageOutput msgOutput) {
        this.msgOutput = msgOutput;
    }

    public final MessageOutput getMsgOutput() {
        return msgOutput;
    }

    public final void setMsgOutput(MessageOutput msgOutput) {
        this.msgOutput = msgOutput;
    }
    
    public void performOutput(MessageInput msg) {
        msgOutput.performOutput(msg);
    }
    
    
    
}
