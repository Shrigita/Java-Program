class ArrayDemo
{
    public static void main(String Arg[])
    {
        //way of creating single dimensional array

        int Arr1[] = {10,20,30,40};

        //explicitly size is not allowed in java
        //int Arr2[4] = {10,20,30,40};

        int Arr3[]= new int[4];   //Dyanamic Memory Allocation
        Arr3[0] = 10;
        Arr3[1] = 20;
        Arr3[2] = 30;
        Arr3[3] = 40;

        int Arr4[] = new int[]{10,20,30,40};  //Dyamic memory with initialised list
    }
}