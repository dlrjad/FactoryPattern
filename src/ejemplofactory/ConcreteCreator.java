/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofactory;

/**
 *
 * @author Jorge
 */
public class ConcreteCreator extends Creator{
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}


