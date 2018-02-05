import java.lang.*;
import java.util.*;
import java.io.*;
class InsertionSort
{
 public static Integer comparnums=0;  //global count variable;
    public void sort(List<Integer> list)
{
    
   for(int i=1;i<list.size();i++)

{

   	int key=list.get(i);
   	int j=i-1;

     while(j>=0)  

    {
        InsertionSort.comparnums++;
        if(list.get(j).compareTo(key)>0)
       { list.set(j+1,list.get(j));
        j--;
        }
        else
          break;

    }
list.set(j+1,key); 

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


	InsertionSort result=new InsertionSort();
	long start=System.currentTimeMillis();
	result.sort(ar);
    long end=System.currentTimeMillis(); 
     long total=end-start;
     
   
	for(int i=0;i<ar.size();i++)
	{

		System.out.println(ar.get(i));
	}

 System.err.println("runtime"+","+total);
 System.err.println("comparisons"+","+InsertionSort.comparnums);


}



}



