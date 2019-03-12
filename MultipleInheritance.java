interface Parent1
{
    default void car()
    {
        System.out.println("Audi car");
    }
}
interface Parent2
{
    default void car()
    {
        System.out.println("BMW car");
    }
}
public class MultipleInheritance implements Parent1,Parent2
{
    public void car()
    {
        Parent1.super.car();
    }
    public static void main(String[] args) 
    {
        MultipleInheritance d=new MultipleInheritance();
        d.car();
    }
}
