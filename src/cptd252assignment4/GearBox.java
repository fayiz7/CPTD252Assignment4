package cptd252assignment4;

import java.util.*;

/**
 *
 */
public class GearBox implements carParts {

    /**
     * Default constructor
     */
    public GearBox() throws InterruptedException {
        System.out.print("New GearBox is being manufactured now");
        System.out.print(".");
        Thread.sleep(750);
        System.out.print(".");
        Thread.sleep(750);
        System.out.print(".");
        Thread.sleep(750);
        System.out.print(".");
        Thread.sleep(750);
        System.out.println("\ncompleted. S/N is GRB-" + this.hashCode());
        this.SN = "GRB-" + this.hashCode();
        this.observers = new ArrayList<>();

    }

    /**
     *
     */
    private String SN;

    /**
     *
     */
    public ArrayList<Observer> observers;

    public String getSN() {
        return SN;

    }

    public void setSN(String SN) {
        this.SN = SN;
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    /**
     * @param observer
     * @return
     */
    public void setObservers(ArrayList<Observer> observers) {
        this.observers = observers;
    }

    public void attach(Observer observer) {
        // TODO implement here
        this.observers.add(observer);

    }

    /**
     * @param observer
     * @return
     */
    public void detach(Observer observer) {
        // TODO implement here
        observers.remove(observer);

    }

    /**
     * @return
     */
    public void notifyy() {
        // TODO implement here
        for (Observer o : observers) {
            System.out.println("*******************************");
            System.out.println("********     ALERT     ********");
            System.out.println("*******************************");

            o.update(this);
        }

    }

}
