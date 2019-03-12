class Bank{
    int getIntrest()
    {
        return 0;
    }
}

class SBI extends Bank
{
    int getIntrest(){
        return 5;
    }
}

lass ICICI extends Bank
{
    int getIntrest(){
        return 8;
    }
}

public class Polymorphism
{
    public static void main(String[] args) {
        Bank ob;
        ob=new SBI();
        System.out.println("SBI intrest rate :");
        System.out.println(ob.getIntrest());

        ob=new ICICI();
        System.out.println("ICICI intrest rate :");
        System.out.println(ob.getIntrest());
    }
}