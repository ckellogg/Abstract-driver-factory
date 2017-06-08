/**
 * Created by Cody on 3/8/2017.
 */
class HighDisplayDriver extends DisplayDriver{
    private static HighDisplayDriver hdd=null;
    public HighDisplayDriver(){}

    public static HighDisplayDriver getInstance() {
        if (hdd == null){
            hdd= new HighDisplayDriver();
        }
        return hdd;
    }
    @Override
    void draw() {
        System.out.println("Drawing a `Widget` using a `HighResDisplayDriver`");
    }
}
