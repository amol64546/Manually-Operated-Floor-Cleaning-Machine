import Components.Wheel;

public class Kart implements Vehicle{
    private int wheel;
    private String direction;
    public Kart(){
        new Wheel();
        this.wheel = 4;
        this.direction = "Stationary";
    }

    @Override
    public void start(String action) {
        if(action.equals("push")){
            this.direction = "Forward";
        }else{
            this.direction = "Backward";
        }
        System.out.println("Moving "+this.direction);
    }

    @Override
    public void stop() {
        this.direction = "Stationary";
        System.out.println("Stopped");
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
