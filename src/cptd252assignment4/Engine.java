package cptd252assignment4;


import java.util.*;

/**
 * 
 */
public class Engine implements carParts {

    /**
     * Default constructor
     */
    public Engine() throws InterruptedException {
        System.out.print("new Engine is being manufactured now");
        System.out.print(".");Thread.sleep(750);
        System.out.print(".");Thread.sleep(750);
        System.out.print(".");Thread.sleep(750);
        System.out.print(".");Thread.sleep(750);
        System.out.println("\ncompleted. S/N is ENG-"+this.hashCode());
               this.SN="ENG-"+this.hashCode();
               
    }

    /**
     * 
     */
    private String SN;

    /**
     * 
     */
    private ArrayList<Observer> observers;

    
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
        // TODO implement here

    }

}