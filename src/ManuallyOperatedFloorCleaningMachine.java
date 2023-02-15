import Components.*;

public class ManuallyOperatedFloorCleaningMachine extends Kart{
    private Frame frame;
    private Bucket bucket;
    private Bearing bearing;
    private Wiper wiper;
    private Tap tap;
    private PVC_Pipe pipe;
    private Shaft shaft;
    public ManuallyOperatedFloorCleaningMachine(){
        super();
        frame = new Frame("Square Conduit Pipe");
        bucket = new Bucket(5,4,"Water");
        System.out.println("Bucket limit is: "+bucket.getLimit());
        System.out.println("Bucket liquid type is: "+bucket.getTypeOfLiquid());
        System.out.println("Bucket current Amount of "+bucket.getTypeOfLiquid()+" is: "+bucket.getLimit());
        bearing = new Bearing("Ball");
        System.out.println("Type of Bearing is: "+bearing.getType());
        wiper = new Wiper();
        tap = new Tap();
        System.out.println("Tap is:"+tap.getValve());
        pipe = new PVC_Pipe();
        shaft = new Shaft();
    }

    public void toggleTapValve(String toggle){
        tap.setValve(toggle);
        System.out.println("Tap valve is "+toggle);
    }


}
