package cptd252assignment4;


import java.util.*;

/**
 * 
 */
public class Engineer implements Observer {

    /**
     * Default constructor
     */
    public Engineer() {
    }

    /**
     * 
     */
    private Engine engine;

    /**
     * 
     */
    private GearBox gearBox;

    /**
     * 
     */
    private BodyandInteriors bodyAndInteriors;

    /**
     * @return
     */
    public void receive(Object o){
        if (o instanceof Engine){
            o=this.engine;
        }else if (o instanceof GearBox){
            o=this.gearBox;
        } else if (o instanceof BodyandInteriors){
            o=this.bodyAndInteriors;
        }
    }
    public void update() {
        // TODO implement here
        
        System.out.println("Engineer got update");
        System.out.println(" now engineer will send command to start assembling and wielding the car");
        System.out.println(" he have engine sn:"+engine.getSN());
        System.out.println(" he have gearbox sn:"+gearBox.getSN());
        System.out.println(" he have bodyandint sn:"+bodyAndInteriors.getSN());
        
    }

}