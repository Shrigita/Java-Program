final class Base
{
    public int No1 = 10;

    //public final void fun(){}    //Not allowed

}
class Final3
{
    public static void main(String arr[])
    {
    Base obj =new Base();
    obj.No1++;     //characteristics not final in final class
    }
}