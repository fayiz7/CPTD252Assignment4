package cptd252assignment4;


import java.util.*;

/**
 * 
 */
public interface carParts {

    /**
     * @param observer 
     * @return
     */
    public void attach(Observer observer);

    /**
     * @param observer 
     * @return
     */
    public void detach(Observer observer);

    /**
     * @return
     */
    
    public void notifyy();

}