public class Runner {
    public static void main(String[] args) {
        Bear bear = new Bear("Balu", 25, 95.62, 'm');
        bear.setName("Baloo");
        String name = bear.getName();
        System.out.println(name);
    }
}
