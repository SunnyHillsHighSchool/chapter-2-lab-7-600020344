import static java.lang.System.*;

public class ListFunHouse
{
 //this method will print the entire list on the screen
   public static void print(ListNode list)
   {
    String output="";
    ListNode current = list;
     while (current!=null)
     {
      output += current.getValue() + " ";
      current = current.getNext();
     }
   	System.out.println(output);	
   }  
 
 //this method will return the number of nodes present in list
 public static int nodeCount(ListNode list)
 {
    int count=0;
    if (list != null)
      count++;
     ListNode current = list;
     while (current.getNext()!=null)
     {
       current = current.getNext();
       count++;
     }
   	return count;
 }
  
 //this method will create a new node with the same value as the first node and add this
 //new node to the list.  Once finished, the first node will occur twice.
 public static void doubleFirst(ListNode list)
 {
    ListNode duplicate = new ListNode(list.getValue(), list.getNext());
    list.setNext(duplicate);	
 }

 //this method will create a new node with the same value as the last node and add this
 //new node at the end.  Once finished, the last node will occur twice.
 public static void doubleLast(ListNode list)
 {
    ListNode last = list;
      while (last.getNext() != null)
      {
        last = last.getNext();
      }
    last.setNext(new ListNode(last.getValue(), null));
 }
  
 //method skipEveryOther will remove every other node
 public static void skipEveryOther(ListNode list)
 {
    ListNode prev = list;
    ListNode current = list.getNext();
    while(current!=null && prev!=null)
    {
      prev.setNext(current.getNext());
      current = null;
      prev = prev.getNext();
      if (prev!=null)
        current = prev.getNext();
    }
 }

 //this method will set the value of every xth node in the list
 public static void setXthNode(ListNode list, int x, Comparable value)
 {
    int count=0;
    if (list != null)
      count++;
     ListNode current = list;
     while (current.getNext()!=null)
     {
       current = current.getNext();
       count++;
       if(count%x==0)
        current.setValue(value);
     }	
 } 

 //this method will remove every xth node in the list
 public static void removeXthNode(ListNode list, int x)
 {
    ListNode prev = null;
    ListNode current = list;
    int count=0;
     while (current!=null)
     {
       count++;
       if(count%x==0)
       {
        prev.setNext(current.getNext());
       }
        if(count%x!=0)
        {
          prev = current;
          current = prev.getNext();
        }
     }
 }  
}
