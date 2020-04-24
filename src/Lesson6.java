public class Lesson6 {
    public static void main(String[] args) {
        Cat cat1 = new Cat(200,2);
        System.out.println("cat1 run 150m " + cat1.run(150));
        System.out.println("cat1 run 250m " + cat1.run(250));

        Dog dog1 = new Dog(500,10,0.5f);
        System.out.println("dog1 run 450m " + dog1.run(450));
        System.out.println("dog1 run 750m " + dog1.run(750));
        System.out.println("dog1 swim 5m " + dog1.swim(5));

        Dog dog2 = new Dog(300,15,0.5f);
        System.out.println("dog2 run 450m " + dog2.run(450));
        System.out.println("dog2 run 750m " + dog2.run(750));
        System.out.println("dog1 jump 1m " + dog2.jump(1));

        System.out.printf("Dogs count %d, Cats count %d, Animals %d\n",Dog.dogsCount,Cat.catsCount,Animal.animalsCount);

    }
}
