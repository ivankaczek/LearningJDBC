
package learningjdbc_app.dominio.mywines;

import java.util.ArrayList;

public class SensorialTasting {
    
    protected ArrayList<String> aromasForThisWine;
    protected int generalQualification;
    protected boolean wouldYouRecommend;
    protected boolean ready2drink;

    public SensorialTasting() {
    }

    public SensorialTasting(ArrayList<String> aromasForThisWine, int generalQualification, boolean wouldYouRecommend, boolean ready2drink) {
        this.aromasForThisWine = aromasForThisWine;
        this.generalQualification = generalQualification;
        this.wouldYouRecommend = wouldYouRecommend;
        this.ready2drink = ready2drink;
    }

    public ArrayList<String> getAromasForThisWine() {
        return aromasForThisWine;
    }

    public void setAromasForThisWine(ArrayList<String> aromasForThisWine) {
        this.aromasForThisWine = aromasForThisWine;
    }

    public int getGeneralQualification() {
        return generalQualification;
    }

    public void setGeneralQualification(int generalQualification) {
        this.generalQualification = generalQualification;
    }

    public boolean isWouldYouRecommend() {
        return wouldYouRecommend;
    }

    public void setWouldYouRecommend(boolean wouldYouRecommend) {
        this.wouldYouRecommend = wouldYouRecommend;
    }

    public boolean isReady2drink() {
        return ready2drink;
    }

    public void setReady2drink(boolean ready2drink) {
        this.ready2drink = ready2drink;
    }

    @Override
    public String toString() {
        return "SensorialTasting{" + "aromasForThisWine=" + aromasForThisWine + ", generalQualification=" + generalQualification + ", wouldYouRecommend=" + wouldYouRecommend + ", ready2drink=" + ready2drink + '}';
    }
    
    
    
    
    
}
