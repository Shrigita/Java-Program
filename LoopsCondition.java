class Loops
{
    public static void main(String arg[])
    {
        int Arr[] = {10,20,30,40};
        int iCnt = 0;

        System.out.println("Traversal of array using for loop");
        for(iCnt = 0; iCnt < Arr.length; iCnt++)  //Same loop as C,C++,java
        {
            System.out.println(Arr[iCnt]);
        }

        System.out.println("Traversal of array using while loop");
        iCnt = 0;
        while(iCnt < Arr.length)       //Same loop as C,C++,java
        {
           System.out.println(Arr[iCnt]);
           iCnt++; 
        }
        System.out.println("Traversal of array using do_while loop");
        iCnt = 0;
        do                            //Same loop as C,C++,java
        {
           System.out.println(Arr[iCnt]);
           iCnt++; 
        }while(iCnt < Arr.length);
        System.out.println("Traversal of array using foreach loop");
        for(int iNo: Arr)    //only java
        {
            System.out.println(iNo);
        }
    }

}