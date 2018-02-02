import java.lang.*;
import java.util.*;
import java.io.*;
class InsertionSort
{

    public int sort(List<Integer> list)
{
     int compnums=0;
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


 public static void main(String[] args) {

 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int len=in.readLine();
    ArrayList<Integer> ar=new ArrayList<>(len);
	Integer line;
	while((line=in.readLine())!=null)
	{
       ar.add(line);
       

	}


	InsertionSort result=new InsertionSort();
	Integer start=System.currentTimeMillis();
	int comparnums=result.sort(ar);
    Integer end=System.currentTimeMillis(); 
    Integer total=start-end;
	for(int i=0;i<ar.size();i++)
	{

		System.out.println(ar.get(i));
	}

 System.err.println("runtime"+","+total);
 System.err.println("comparisons"+","+total);


}



}



