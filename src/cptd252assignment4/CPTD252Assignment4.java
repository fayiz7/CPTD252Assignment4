/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cptd252assignment4;


/**
 *
 * @author fayiz
 */
public class CPTD252Assignment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
       Engineer engineer = new Engineer();
       Engine a = new Engine();
       a.attach(engineer);       //a.printObserver();
       a.notifyy();

        
       // System.out.println(a.hashCode());
        GearBox b =new GearBox();
        b.attach(engineer);
        b.notifyy();
        
        BodyandInteriors c = new BodyandInteriors();
        c.attach(engineer);
        c.notifyy();
        
        
    }
    
}
