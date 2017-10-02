
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author Jenna
 */
public class GuiOutput implements MessageOutput {

    @Override
    public final void performOutput(String input) {
	JOptionPane.showMessageDialog(null, input);
    }
    
}
