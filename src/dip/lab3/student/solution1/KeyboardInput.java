
package dip.lab3.student.solution1;

/**
 *
 * @author Jenna
 */
public class KeyboardInput implements MessageInput {
    private MessageInput msg;

    public MessageInput getMsg() {
        return msg;
    }

    public void setMsg(MessageInput msg) {
        if (msg == null) {
            throw new IllegalArgumentException("Message must not be null!");
        } else {
            this.msg = msg;
        }
    }
    
    public KeyboardInput(String msg) {
        
    }

    @Override
    public void performInput(MessageInput msg) {
       
    }
    
}
