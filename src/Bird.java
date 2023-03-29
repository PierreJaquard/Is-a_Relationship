public class Bird extends Animal{
    private float featherLength;
    private float speed;

    public Bird(String name, float featherLength) {
        super(name);
        this.featherLength = featherLength;
    }

    public float getSpeed() {
        return speed;
    }
    public float getFeatherLength() {
        return featherLength;
    }

    public void sing(){
        System.out.println("tchirp tchirp");
    }




}
