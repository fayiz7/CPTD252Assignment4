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
    public void receive(Object o) {
        if (o instanceof Engine) {
            o = this.engine;
        } else if (o instanceof GearBox) {
            o = this.gearBox;
        } else if (o instanceof BodyandInteriors) {
            o = this.bodyAndInteriors;
        }
    }

    public void update(Object i) {
        // TODO implement here
        if (i instanceof Engine) {
            System.out.println("Engineer got update that engine is manufactured");
            this.engine = (Engine) i;
            System.out.println(" he have engine sn:" + engine.getSN());
        } else if (i instanceof GearBox) {
            this.gearBox = (GearBox) i;
            System.out.println(" he have gearbox sn:" + gearBox.getSN());
        } else if (i instanceof BodyandInteriors) {
            this.bodyAndInteriors = (BodyandInteriors) i;
            System.out.println(" he have bodyandint sn:" + bodyAndInteriors.getSN());

        }
        if (this.bodyAndInteriors != null && this.engine != null && this.gearBox != null) {

            System.out.println(" now engineer have all part required to make the car and he will now send a ''COMMAND'' to start assembling and wielding the car");
//            Assembler a = new Assembler() {
//                @Override
//                public void execute() {
//                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//                }
//            }
        }

    }

}
