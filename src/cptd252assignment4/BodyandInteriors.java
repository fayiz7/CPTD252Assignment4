package cptd252assignment4;

import java.util.*;

/**
 *
 */
public class BodyandInteriors implements carParts {

    /**
     * Default constructor
     */
    public BodyandInteriors() throws InterruptedException {
        System.out.print("New Body is being manufactured now");
        System.out.print(".");
        Thread.sleep(750);
//        System.out.print(".");Thread.sleep(750);
//        System.out.print(".");Thread.sleep(750);
//        System.out.print(".");Thread.sleep(750);
        System.out.println("\ncompleted. S/N is ENG-" + this.hashCode());
        this.SN = "ENG-" + this.hashCode();
        this.observers = new ArrayList<>();
        this.notifyy();

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
        // TODO implement here

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
               this.observers.add(observer);

        // TODO implement here
    }

    /**
     * @param observer
     * @return
     */
    public void detach(Observer observer) {
        // TODO implement here

    }

    /**
     * @return
     */
    public void notifyy() {
        for (Observer observer : observers) {
            observer.update(this);
        }
        // TODO implement here

    }

}
