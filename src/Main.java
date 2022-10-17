public class Main
{
    public static void main(String[] args)
    {
        Circle newCircle = new Circle(5.0);
        System.out.println(newCircle.getInfo());
        newCircle.setRadius(9.2);
        System.out.println(newCircle.getInfo());

        //second test case
        newCircle.setRadius(22.1);
        System.out.println(newCircle.getInfo());

    }
}