/**
 * Created by Cody on 3/8/2017.
 */
class LowPrintDriver extends PrintDriver{
    private static LowPrintDriver lpd=null;
    public LowPrintDriver(){}

    public static LowPrintDriver getInstance(){
        if (lpd==null)
            lpd = new LowPrintDriver();

            return lpd;
    }

    @Override
    void print() {
        System.out.println("Printing a `Document` using a `LowResPrintDriver`");
    }
}
