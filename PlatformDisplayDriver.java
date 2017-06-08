/**
 * Created by Cody on 3/8/2017.
 */
import java.io.*;
public class PlatformDisplayDriver {
    public static void main(String[] args) {

        try {
            AbstractDriverFactory driverFactory = AbstractDriverFactory.getFactory();
            DisplayDriver displayDriver = driverFactory.createDisplayDriver();
            PrintDriver printDriver = driverFactory.createPrintDriver();

            Widget widget = new Widget();
            Document document = new Document();

            widget.draw(displayDriver);
            document.print(printDriver);

        }
        catch(Exception e){
            System.err.format("Exception occurred trying to read file.");
            e.printStackTrace();
        }

    }
}
