package dip.lab2.student.solution1;


/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author Jenna
 */
public class FoodServiceTipCalculator implements TipCalculator {
    private final double MIN_BILL = 0.00;
    private final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + MIN_BILL;
    private double bill;
    private ServiceQuality serviceQuality;

    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
    }

    @Override
    public final double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = bill * .20;
                break;
            case FAIR:
                tip = bill * .15;
                break;
            case POOR:
                tip = bill * .10;
                break;
        }

        return tip;
    }

    public final void setBill(double billAmt) {
        if(billAmt < MIN_BILL) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        if(q == null) {
            throw new IllegalArgumentException("Must have a value for service quality!");
        } else {
            serviceQuality = q;
        }
    }

    public final ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

}
