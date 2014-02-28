/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofactory;

/**
 *
 * @author Jorge
 */
public class EjemploFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Creator aCreator;
        aCreator = new ConcreteCreator();
        Product producto = aCreator.factoryMethod();
        producto.operacion();
        producto.operacion2();
    }
}
