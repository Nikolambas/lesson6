public class Animal {
    protected static int count;

    public Animal() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public void run(int distance){
        System.out.println(" пробежал "+distance+" метров");
    }
    public void swim(int distance){
        System.out.println(" плывет "+distance +" метров");
    }
}
