package dip.lab1;

import javax.swing.JOptionPane;

/**
 * A high-level class that delegates to employee objects to do the work. Does
 * this class design follow the DIP? If not, fix it.
 *
 * @author Jenna
 */
public class HRService {
    /** 
     * Constants can be used for retrieving annual wages of
     * various employee types. Is this the best way to go? Do we have
     * type safety?
     */

    /**
     * Alternatively to the above, we could use an enum. Does this improve
     * type safety?
     */
    private static final String ERROR_MSG =
            "Cannot get annual wages because no valid employee type provided";
    private static final String ERROR_TITLE = "Employee Type Unknown";

    /**
     * This is a truly horrible way to make decisions. Very rigid and fragile!
     * @param e - an employee object (not truly polymorphic!)
     * employeeType - a String identifying the employee type. A constant
     * (see above) should be used for this, but can you guarantee it will be?
     * Are there other options? Hint: enum
     * @return the annual compensation for supported employee types
     */
    public double getAnnualCompensationForEmployee(Employee e)
    {
        double annualCompensation = 0;

        // One example of using fragile if logic to determine employee type.
        // If only we could use polymorphism instead!
       
        
            JOptionPane.showMessageDialog(
                    null, ERROR_MSG, ERROR_TITLE, JOptionPane.ERROR_MESSAGE);
        

        return annualCompensation;
    }


    /**
     * This is another truly horrible way to make decisions.
     * Very rigid and fragile!
     * @param e - an employee object (not truly polymorphic!)
     * @return the annual compensation for supported employee types
     */
    public double getAnnualCompensationForEmployee(Employee e) {
        double annualCompensation = 0;

        // One example of using fragile if logic to determine employee type.
        // If only we could use polymorphism!
        // NOTE: you don't need both versions (the one above and this one).
        // Find a single, better way, using DIP principles.
        if(e instanceof HourlyEmployee) {
            annualCompensation = e.getAnnualWages();

        } else if(e instanceof SalariedEmployee) {
            annualCompensation = e.getAnnualSalary();

        } else {
            JOptionPane.showMessageDialog(
                    null, ERROR_MSG, ERROR_TITLE, JOptionPane.ERROR_MESSAGE);
        }

        return annualCompensation;
    }
}
