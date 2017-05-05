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
//        System.out.print(".");Thread.sleep(750);
//        System.out.print(".");Thread.sleep(750);
//        System.out.print(".");Thread.sleep(750);
        System.out.println("\ncompleted. S/N is ENG-"+this.hashCode());
               this.SN="ENG-"+this.hashCode();
               this.observers=new ArrayList<>();
               //this.notifyy();
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
        // TODO implement here
                for (Observer observer : observers) {
                    observer.update(this);
            
        }
        

    }
    
    //dr marwan just ignore this method as it is only used for testing ,, to test if this object really registered the observer  
    public void printObserver(){
        for (Observer observer : observers) {
            System.out.println("observers are "+observer.hashCode());
        }
    }

}