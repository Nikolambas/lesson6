public class Dog extends Animal {
    protected static int count;

    public Dog() {
        count++;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void run(int distance) {
        if (distance<500){
            System.out.println("пробежал "+distance+" метров");
        }else{
            System.out.println(" пробежал 500 метров и устал");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance<10){
            System.out.println("проплыл "+distance+" метров");
        }else{
            System.out.println("проплыл 10 метров и устал");
        }
    }
}
