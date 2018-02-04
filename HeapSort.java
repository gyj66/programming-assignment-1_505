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
          

         if((size-1)%2==0)
         {
         	int start=(size-3)/2;
            int pindx=start;

            while(pindx>=0)
           { int maxc=list.get(pindx*2+2).compareTo(list.get(pindx*2+1))>0?pindx*2+2:pindx*2+1;
            if(list.get(pindx).compareTo(list.get(maxc))<0)
            {
               int tep=list.get(pindx);
               list.set(pindx,list.get(maxc));
               list.set(maxc,tep);


            }


            if(maxc<start)
            	pindx=maxc;
            else
             pindx--;
          } 


         }

         else
         {
            int start=(size-2)/2;
            int pindx=start;

            while(pindx>=0)
         {   int maxc=pindx*2+1;
            if(list.get(pindx).compareTo(list.get(maxc))<0)
            {
               int tep=list.get(pindx);
               list.set(pindx,list.get(maxc));
               list.set(maxc,tep);


            }

      
            if(maxc<start)
            	pindx=maxc;
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
