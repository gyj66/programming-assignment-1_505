import java.lang.*;
import java.util.*;
import java.io.*;


class SortUtility
{
       
 public static int comparisons=0;


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
	

long start=System.currentTimeMillis();
     ar.sort(new Comparator<Integer>() {
    @Override
    public int compare(Integer o1, Integer o2) {
        SortUtility.comparisons++;
        return o1.compareTo(o2);
    } 
    });       
long end=System.currentTimeMillis(); 
Integer total= (int)(long)(end-start);
Integer comparnums=SortUtility.comparisons;
   
	for(int i=0;i<ar.size();i++)
	{

		System.out.println(ar.get(i));
	}

 System.err.println("runtime"+","+total);
 System.err.println("comparisons"+","+comparnums);

}




}


