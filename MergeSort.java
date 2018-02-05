import java.lang.*;
import java.util.*;
import java.io.*;

class MergeSort
{
	public static Integer comparnums=0;

  public void sort(List<Integer> list,int l,int r)

  {
  	

  if(r>l)
  	
  {	int m=(r+l+1)/2;

  sort(list,l,m-1);
  sort(list,m,r);
  merge(list,l,m,r);

}


  }


  public void merge(List<Integer> list,int l,int m,int r)

  {
  	   
  	   int n1=m-l;
  	   int n2=r-m+1;
       ArrayList<Integer> L=new ArrayList<>();
       ArrayList<Integer> R=new ArrayList<>();

for(int i=0;i<n1;i++)
{
   
   L.add(list.get(l+i));

}

  for(int j=0;j<n2;j++)
{
   
   R.add(list.get(m+j));

}


int i=0,j=0;
int k=l;

while(i<n1&&j<n2)
{
 MergeSort.comparnums++;
if(R.get(j).compareTo(L.get(i))<0)
{

   list.set(k,R.get(j));
     
   j++;
}

else
{

list.set(k,L.get(i));
i++;

}

k++;

}

while(i<n1)
{
list.set(k,L.get(i));
i++;
k++;

}

while(j<n2)
{

list.set(k,R.get(j));
     
   j++;
   k++;

}



  }


 public static void main(String[] args)

  throws IOException{
   
   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	 String line;
	 line=in.readLine();
    
    ArrayList<Integer> ar=new ArrayList<>();
	
	while((line=in.readLine())!=null)
	{
       ar.add(Integer.parseInt(line));
       

	}


  MergeSort result=new MergeSort();
  long start=System.currentTimeMillis();
	result.sort(ar,0,ar.size()-1);
    long end=System.currentTimeMillis(); 
     long total=end-start;

for(int i=0;i<ar.size();i++)
	{

		System.out.println(ar.get(i));
	}

	 System.err.println("runtime"+","+total);
 System.err.println("comparisons"+","+MergeSort.comparnums);


 }




}
