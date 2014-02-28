package ejemplofactory;

// Definimos la clase abstracta constructora
public abstract class Creator {
    // Operación que realiza 

    public Product anOperation() {

        return factoryMethod();
    }

    // Definimos método abstracto
    public abstract Product factoryMethod();
}
