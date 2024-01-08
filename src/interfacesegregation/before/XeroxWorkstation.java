package interfacesegregation.before;

public class XeroxWorkstation implements MultiFunctionDevice {

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
        System.out.println("Fax");
    }

    @Override
    public void internetFax() {
        System.out.println("Internet Fax");
    }

}
