package interfacesegregation.after;

public class CanonPrinter implements Printer {

    @Override
    public void print() {
        System.out.println("Print");
    }

    @Override
    public void getPrintPoolDetails() {
        System.out.println("Get Print Pool Details");
    }

}
