import java.util.*;

//linkedlist of user defined class
class Book
{
    public String Name;
    public int Price;

    public Book(String s,int i)
    {
        this.Name = s;
        this.Price = i;
    }

    public void Display()
    {
        System.out.println("Book Name :"+this.Name+"Price :"+this.Price);
    }
}

class Collection3
{
    public static void main(String arg[])
    {
        LinkedList <Book>lobj = new LinkedList<Book>();

        lobj.add(new Book("Let us C",400));
        lobj.add(new Book("Data Structure",580));
        lobj.add(new Book("C++ Programming",980));
        lobj.add(new Book("Angular Web Development",790));

        Iterator iobj =lobj.iterator();
        Book bref =null;

        System.out.println("Elements of Linked list :");
        while(iobj.hasNext())
        {
            bref =(Book)iobj.next();
            bref.Display();
        }


    }
}