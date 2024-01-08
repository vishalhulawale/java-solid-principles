/**
 * CanonPrinter implements MultiFunctionDevice interface. It has to implement all the methods of the interface.
 * But CanonPrinter cannot scan, scanPhoto, fax, and internetFax.
 * This is a violation of the Interface Segregation Principle.
 */

package interfacesegregation.before;

public class CanonPrinter implements MultiFunctionDevice {

    @Override
    public void print() {
        System.out.println("Print");
    }

    @Override
    public void getPrintPoolDetails() {
        System.out.println("Get Print Pool Details");
    }

    @Override
    public void scan() {
    }

    @Override
    public void scanPhoto() {
    }

    @Override
    public void fax() {
    }

    @Override
    public void internetFax() {
    }

}
