// Case 6
interface Demo 
{
    int i =10;
    //public final static int i = 10;
    void fun();
}
interface Hello 
{
     int i =20;
    //public final static int i = 10;
    void fun();
}

class Marvellous implements Demo, Hello   //Allowed
{
    void fun()
    {
        
    }
    System.out.println("Value of i "+Demo.i);
    System.out.println("Value of i "+Hello.i);
}