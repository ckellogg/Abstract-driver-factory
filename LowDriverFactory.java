/**
 * Created by Cody on 3/8/2017.
 */
public class LowDriverFactory extends AbstractDriverFactory{

    DisplayDriver createDisplayDriver(){

        return LowDisplayDriver.getInstance();
    }
    PrintDriver createPrintDriver(){
        return LowPrintDriver.getInstance();

    }
}
