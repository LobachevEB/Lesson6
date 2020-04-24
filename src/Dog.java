public class Dog extends Animal{
    public static int dogsCount;


    public Dog(float runMaxDistance, float swimMaxDistance, float jumpMaxHeight){
        super(runMaxDistance, swimMaxDistance, jumpMaxHeight);
        dogsCount++;
    }

    public boolean run(float distance) {
        return super.run(distance);
    }

    public boolean swim(float distance) {
        return super.swim(distance);
    }

    public boolean jump(float height) {
        return super.jump(height);
    }

}
