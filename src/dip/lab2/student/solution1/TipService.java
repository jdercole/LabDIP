
package dip.lab2.student.solution1;

/**
 *
 * @author Jenna
 */
public class TipService implements TipCalculator {
    private TipCalculator tipCalculator;
    
    public TipService(TipCalculator tipCalculator) {
        this.setTipCalculator(tipCalculator);
    }

    @Override
    public double getTip() {
        return tipCalculator.getTip();
    }

    public final TipCalculator getTipCalculator() {
        return tipCalculator;
    }

    public final void setTipCalculator(TipCalculator tipCalculator) {
        if (tipCalculator == null) {
            throw new IllegalArgumentException("Tip Calculator cannot be null!");
        } else {
            this.tipCalculator = tipCalculator;
        }
        
    }
    
    
    
}
