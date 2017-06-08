/**
 * Created by Cody on 3/8/2017.
 */
class HighPrintDriver extends PrintDriver{
    private static HighPrintDriver hpd=null;

    public HighPrintDriver(){}

    public static HighPrintDriver getInstance(){
        if (hpd==null){
            hpd = new HighPrintDriver();
        }
        return hpd;
    }

    @Override
    void print() {
        System.out.println("Printing a `Document` using a `HighResPrintDriver`");
    }
}

