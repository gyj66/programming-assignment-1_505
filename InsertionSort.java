import java.lang.*;
import java.util.*;
import java.io.*;
class InsertionSort
{

    public Integer sort(List<Integer> list)
{
     Integer compnums=0;
   for(int i=1;i<list.size();i++)

{

   	int key=list.get(i);
   	int j=i-1;

     while(j>=0&&list.get(j).compareTo(key)>0)  

    {
        list.set(j+1,list.get(j));
        j--;
        compnums++;

    }
list.set(j+1,key); 

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


	InsertionSort result=new InsertionSort();
	long start=System.currentTimeMillis();
	String comparnums=String.valueOf(result.sort(ar));
    long end=System.currentTimeMillis(); 
    String total=String.valueOf(start-end);
	for(int i=0;i<ar.size();i++)
	{

		System.out.println(ar.get(i));
	}

 System.err.println("runtime"+","+total);
 System.err.println("comparisons"+","+comparnums);


}



}



