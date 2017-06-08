/**
 * Created by Cody on 3/8/2017.
 */
public class HighDriverFactory extends AbstractDriverFactory{

    DisplayDriver createDisplayDriver(){
        return HighDisplayDriver.getInstance();
    }
    PrintDriver createPrintDriver(){
        return HighPrintDriver.getInstance();
    }
//    DisplayDriver createDisplayDriver(){HighDisplayDriver();
//    }
//    PrintDriver createPrintDriver(){
//        return new HighPrintDriver();
//    }

}
