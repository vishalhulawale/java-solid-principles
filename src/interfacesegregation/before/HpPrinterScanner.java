/**
 * HpPrinterScanner can print, scan, and scan photo, but it cannot fax or internet fax.
 * Still it has to implement the fax and internetFax methods.
 * This is a violation of the Interface Segregation Principle.
 */

package interfacesegregation.before;

public class HpPrinterScanner implements MultiFunctionDevice {

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
        System.out.println("Scan");
    }

    @Override
    public void scanPhoto() {
        System.out.println("Scan Photo");
    }

    @Override
    public void fax() {
    }

    @Override
    public void internetFax() {
    }

}
