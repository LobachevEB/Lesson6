public class Cat extends Animal{

    public static int catsCount = 0;

    public Cat(float runMaxDistance, float jumpMaxHeight){
        super(runMaxDistance, jumpMaxHeight);
        catsCount++;
    }

    public boolean run(float distance) {
        return super.run(distance);
    }

    public boolean jump(float height) {
        return super.jump(height);
    }

    @Override
    boolean swim(float distance) {
        return false;
    }
}
