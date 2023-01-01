class StaticDemo
{   
    static
    {
        System.out.println("Inside static block of staticDemo class");
    }
    public StaticDemo()
    {
       System.out.println("Inside Constructor of main");
    }
    public static void main(String arg[])
    {
        System.out.println("Inside Main ");
        System.out.println("Value of static No3 :"+Demo.No3); //C++ Demo::No3
        System.out.println("Value of static No4 :"+Demo.No4);  //C++ Demo::No4

        Demo obj1 = new Demo();
        obj1.fun(); 

        Demo.gun();   //C++ Demo::gun()

    }
       
}
class Demo
{
    public int No1;            //Non static characteristics
    public int No2;            //Non static characteristics
    public static int No3;    //static characteristics
    public static int No4;    //static characteristics

    public Demo()           //Constructor
    {
        System.out.println("Inside Constructor");
        No1 = 11;
        No2 = 21;
    }
    static                   //static block
    {
        System.out.println("Inside static block of Demo class");
        No3 = 51;
        No4 = 101;
    }

    public void fun()       //Non Staic Method
    {
        System.out.println("Inside non static method");
        //Non static method can access  static as well as Non static data
        //We can use this keyword
        System.out.println("Value of No1 in Nonsatic method:"+this.No1);
        System.out.println("Value of No2 in Nonsatic method:"+this.No2);
        System.out.println("Value of No3 in Nonsatic method:"+this.No3);
        System.out.println("Value of No4 in Nonsatic method:"+this.No4);
    }

    public static void gun()   //Staic Method
    {
        System.out.println("Inside static method");
        //static method can access only static data
        //We can  not use this keyword
        System.out.println("Value of No3 in satic method :"+No3);
        System.out.println("Value of No4 in satic method :"+No4);
       
    }

}