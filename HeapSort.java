import java.lang.*;
import java.util.*;
import java.io.*;


class HeapSort
{

   public void sort(List<Integer> list)
   { 
   	  int size=list.size();

       while(size>1)
        
      {  

      	 heapify(list,size);
        int tep=list.get(0);
        list.set(0,list.get(size-1));
        list.set(size-1,tep);
        size--;

     }
     


    

   }

 public void heapify(List<Integer> list,int size)

     {
          

        
         int start=size/2-1;
          int pindx=start;

          while(pindx>=0)
          {
             int l=pindx*2+1;
             int r=pindx*2+2;
             int largest=pindx;

             if(l<size&&list.get(pindx)<list.get(l))
              largest=l;

        if(r<size&&list.get(pindx)<list.get(r))
              largest=r;


            if(largest<start)
            	pindx=largest;
            else
             pindx--;
          } 
          
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
	//Integer comparnums=result.sort(ar);
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
