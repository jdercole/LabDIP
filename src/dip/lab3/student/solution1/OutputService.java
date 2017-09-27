
package dip.lab3.student.solution1;

/**
 *
 * @author Jenna
 */
public class OutputService {
    private MessageOutput msgOutput;

    public final MessageOutput getMsgOutput() {
        return msgOutput;
    }

    public final void setMsgOutput(MessageOutput msgOutput) {
        this.msgOutput = msgOutput;
    }
    
    public void performOutput(MessageOutput msg) {
        msgOutput.performOutput(msg);
    }
    
    
    
}
