package interfacesegregation.after;

public class HpPrinterScanner implements Printer, Scanner {

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

}
