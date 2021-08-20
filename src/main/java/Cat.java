public class Cat extends Animal{
    protected static int count;

    public Cat() {
        count++;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void run(int distance) {
        if (distance<200){
            System.out.println("пробежал "+distance+" метров");
        }else{
            System.out.println(" пробежал 200 метров и устал");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать");
    }
}
