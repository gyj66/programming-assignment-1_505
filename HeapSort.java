import java.lang.*;
import java.util.*;
import java.io.*;


class HeapSort
{

   public void sort(List<Integer> list)
   { 
   	 int size=list.size();
     
     for(int i=size/2-1;i>=0;i--)
        heapify(list,size,i);

        for(int i=size-1;i>=0;i--) 
        {
          int tep=list.get(0);
           list.set(0,list.get(i));
           list.set(i,tep);
           heapify(list,i,0);

     


    

   }
   }

 public void heapify(List<Integer> list,int size,int i)

     {
          

        int largest=i;
     	int l=i*2+1;
         int r=i*2+2;

         
            

             if(l<size&&list.get(largest)<list.get(l))
              largest=l;

        if(r<size&&list.get(largest)<list.get(r))
              largest=r;

         if(largest!=i)
         {
         	int tep=list.get(largest);
         	list.set(largest,list.get(i));
         	list.set(i,tep);
             heapify(list,size,largest);
         }
        

        
          
          }




         
         

     



 public static void main(String[] args) 
 throws IOException {

 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	 String line;
	 line=in.readLine();
    
    ArrayList<Integer> ar=new ArrayList<>();
	
	while((line=in.readLine())!=null)
	{
       ar.add(Integer.parseInt(line));
       

	}


	HeapSort result=new HeapSort();
	long start=System.currentTimeMillis();
	result.sort(ar);
    long end=System.currentTimeMillis(); 
     long total=end-start;
   
	for(int i=0;i<ar.size();i++)
	{

		System.out.println(ar.get(i));
	}

 System.err.println("runtime"+","+total);
 //System.err.println("comparisons"+","+comparnums);



}
}
