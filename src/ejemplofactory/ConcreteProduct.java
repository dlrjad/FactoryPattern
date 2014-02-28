/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofactory;

/**
 *
 * @author Jorge
 */
public class ConcreteProduct implements Product{
    public void operacion(){
        System.out.println("Una operación de este producto");
    }
    public void operacion2(){
        System.out.println("Otro operación");
    }
}
