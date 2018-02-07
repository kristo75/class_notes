public class PolarBear extends Bear{

    public void gatherFood(){
        System.out.println("Gone fishing");
    }

    @Override
    public void eat(){
        System.out.println("Munching in the snow");
    }

}
