
package dip.lab3.student.solution1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jenna
 */
public class FileOutput implements MessageOutput {
    private String fileName;

    public final String getFileName() {
        return fileName;
    }

    public final void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public final void performOutput(MessageOutput msg) {
	
			
	
    }
    
}
