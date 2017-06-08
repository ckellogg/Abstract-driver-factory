import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Cody on 3/8/2017.
 */
abstract class AbstractDriverFactory {

    private static AbstractDriverFactory df=null;
    static AbstractDriverFactory getFactory()throws IOException{
           //reading
        if (df==null) {
            String filename = "res.dat";
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String res;
            res = reader.readLine();


            if (res.equals("high")) {
                df = new HighDriverFactory();
            } else if (res.equals("low")) {
                df = new LowDriverFactory();
            }
        }
        return df;
    }

    abstract DisplayDriver createDisplayDriver();
    abstract PrintDriver createPrintDriver();
}
