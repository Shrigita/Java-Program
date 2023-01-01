import java.lang.*;

class OverloadingX
{
     public static void main(String arg[])
    {
        Demo obj =new Demo();
        obj.fun();
        obj.fun(10);
        obj.fun(11,10);
        obj.fun(10.3);

    }
}

class Demo
{
    public void fun()
    {
        System.out.println("fun with no parameters");
    }
    public void fun(int i)
    {
        System.out.println("fun with one parameters");
    }
    public void fun(int i,int j)
    {
        System.out.println("fun with Two parameters");
    }
    public void fun(double i)
    {
        System.out.println("fun with one double parameters");
    }


}

