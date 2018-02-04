import java.lang.*;
import java.util.*;
import java.io.*;


class HeapSort
{

   public Integer sort(List<Integer> list)
   { 
   	 int size=list.size();
   	 int comparnums=0;
     
     for(int i=size/2-1;i>=0;i--)
        comparnums+=heapify(list,size,i);

        for(int i=size-1;i>=0;i--) 
        {
          int tep=list.get(0);
           list.set(0,list.get(i));
           list.set(i,tep);
          comparnums+=heapify(list,i,0);

    }
   return comparnums;

   }

 public Integer heapify(List<Integer> list,int size,int i)

     {
          

        int largest=i;
     	int l=i*2+1;
         int r=i*2+2;
         int compnums=0;

         
            

             if(l<size&&list.get(largest)<list.get(l))
             {
                compnums++;
             	largest=l;
             }
              

        if(r<size&&list.get(largest)<list.get(r))
              {
              	compnums++;

              	largest=r;

              }
              

         if(largest!=i)
         {
         	int tep=list.get(largest);
         	list.set(largest,list.get(i));
         	list.set(i,tep);
            compnums+=heapify(list,size,largest);
         }
        

        return compnums;
          
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
	Integer comparnums =result.sort(ar);
    long end=System.currentTimeMillis(); 
     long total=end-start;
   
	for(int i=0;i<ar.size();i++)
	{

		System.out.println(ar.get(i));
	}

 System.err.println("runtime"+","+total);
 System.err.println("comparisons"+","+comparnums);



}
}
