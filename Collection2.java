import java.util.*;

//linkedlist in string
class Collection2
{
    public static void main(String arg[])
    {
        LinkedList <String>lobj = new LinkedList<String>();

        lobj.add("om");
        lobj.add("Sai");
        lobj.add("Ram");
        lobj.add("Amit");
        lobj.add("Aditya");

        System.out.println("Elements of linked list :"+lobj);

        lobj.addFirst("Tejas");
        System.out.println("Elements of linked list :"+lobj);

        lobj.addLast("Shree");
        System.out.println("Elements of linked list :"+lobj);

        lobj.add(4,"Ajit");
        System.out.println("Elements of linked list :"+lobj);

        //travel the linkelist
        Iterator iobj = lobj.iterator();
        System.out.println("Data using iterator is :");
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }

        //check Specific element
        if(lobj.contains("Shree"))
        {
            System.out.println("shree is present in ll");
        }
        else
        {
          System.out.println("shree is not present in ll");  
        }

        lobj.remove();  //first element
        System.out.println("Elements of linked list :"+lobj);  

        lobj.remove(3);
        System.out.println("Elements of linked list :"+lobj);

        lobj.removeLast();
        System.out.println("Elements of linked list :"+lobj);

        System.out.println("Number of elements in linkedlist :"+lobj.size());

        lobj.set(1,"Ajit");
        System.out.println("Elements of linked list :"+lobj);

        lobj.clear();
        System.out.println("Elements of linked list :"+lobj);
    }
}