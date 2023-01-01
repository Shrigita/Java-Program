class GenericMethod
{
    public static <T> void Display(T Arr[])
    {
        System.out.println("Values of Array :");
        for(int i =0;i<Arr.length ;i++)
        {
            System.out.println(Arr[i]);
        }


    }

    public static void main(String arg[])
    {
        Integer iArr[] ={10,20,30,40};
        Display(iArr);

        Character cArr[] ={'a','b','c','d','e'};
        Display(cArr);

        Float fArr[] ={10.3f,20.3f,23.89f};
        Display(fArr);

    }
}