
package pruebalibreria;
import DataBaseLibrary.Metodos;

/**
 *
 * @author Nabor
 */
public class PruebaLibreria {

    
    public static void main(String[] args) {
        Metodos obx = new Metodos();
        obx.Conectar("jdbc:mysql://localhost","dogbd","user=root","password=Sobrada12345");
        obx.Actualize("doghouse", "Dog_Owner", "Sandra", "Dog_ID", 1);
        obx.buscar("*", "doghouse", "Dog_ID", "1");
        obx.showData(1);
    }
    
}
