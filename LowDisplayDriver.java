/**
 * Created by Cody on 3/8/2017.
 */
class LowDisplayDriver extends DisplayDriver{
    private static LowDisplayDriver ldp = null;

    public LowDisplayDriver(){}

    public static LowDisplayDriver getInstance() {
        if (ldp == null){
            ldp= new LowDisplayDriver();
        }
            return ldp;
    }
    @Override
    void draw() {
        System.out.println("Drawing a `Widget` using a `LowResDisplayDriver`");
    }
}