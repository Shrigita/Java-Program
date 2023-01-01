import java.util.*;

//linkelist in integer
class Collection1
{
    public static void main(String arg[])
    {
        LinkedList <Integer>lobj = new LinkedList<Integer>();

        lobj.add(11);
        lobj.add(21);
        lobj.add(51);
        lobj.add(101);
        lobj.add(111);

        System.out.println("Elements of linked list :"+lobj);

        lobj.addFirst(1);
        System.out.println("Elements of linked list :"+lobj);

        lobj.addLast(121);
        System.out.println("Elements of linked list :"+lobj);

        lobj.add(4,1000);
        System.out.println("Elements of linked list :"+lobj);

        //travel the linkelist
        Iterator iobj = lobj.iterator();
        System.out.println("Data using iterator is :");
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }

        //check Specific element
        if(lobj.contains(121))
        {
            System.out.println("121 is present in ll");
        }
        else
        {
          System.out.println("121 is not present in ll");  
        }

        lobj.remove();  //first element
        System.out.println("Elements of linked list :"+lobj);  

        lobj.remove(3);
        System.out.println("Elements of linked list :"+lobj);

        lobj.removeLast();
        System.out.println("Elements of linked list :"+lobj);

        System.out.println("Number of elements in linkedlist :"+lobj.size());

        lobj.set(1,500);
        System.out.println("Elements of linked list :"+lobj);

        lobj.clear();
        System.out.println("Elements of linked list :"+lobj);
    }
}