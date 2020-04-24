public  class Animal {
    float runMaxDistance;
    float swimMaxDistance;
    float jumpMaxHeight;

    public static int animalsCount = 0;

    public Animal(float runMaxDistance, float jumpMaxHeight){
        this.runMaxDistance = runMaxDistance;
        this.jumpMaxHeight = jumpMaxHeight;
        animalsCount++;
    }

    public Animal(float runMaxDistance, float swimMaxDistance, float jumpMaxHeight){
        this.runMaxDistance = runMaxDistance;
        this.swimMaxDistance = swimMaxDistance;
        this.jumpMaxHeight = jumpMaxHeight;
        animalsCount++;
    }

    boolean run(float distance){
        return (distance > 0) && (distance <= runMaxDistance);
    }

    boolean swim(float distance){
        return (distance > 0) && (distance <= swimMaxDistance);
    }

    boolean jump(float height){
        return (height > 0) && (height <= jumpMaxHeight);
    }
}

