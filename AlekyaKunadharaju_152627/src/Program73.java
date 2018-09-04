


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.List;

public class Program73 {

		public static void main(String[] args)
		{
		List<Integer> l1=new ArrayList<Integer>();
		List<Integer> l2=new ArrayList<Integer>();
        l1.add(5);
        l1.add(4);
        l1.add(66);
        l2.add(7);
        l2.add(4);
        l2.add(66);
        
        Retain p=new Retain();
        p.removeElements(l1, l2);
       
        }
		}
		class Retain
        {
	   Collection<Integer> removeElements(List<Integer>l1, List<Integer>l2)
         {      l1.removeAll(l2);
		       System.out.println(l1);
		return l1;
         }
        }
