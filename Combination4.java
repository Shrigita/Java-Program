// Case 4 :Multiple inheitance :Not allowed  in java
class Demo 
{
    int i;
    void fun()
    {}
}
class Hello
{
    int i;
    void fun()
    {}
}
class Marvellous extends Demo, Hello    // Error ambigative
class Marvellous extends Demo, Hello    // Error ambigative
{
}