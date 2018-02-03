import java.lang.*;
import java.util.*;
import java.io.*;

class MergeSort
{

  public Integer sort(List<Integer> list,int l,int r)

  {
  	int comprisons=0;

  if(r>l)
  	
  {	int m=(r+l+1)/2;

  comprisons+=sort(list,l,m-1);
  comprisons+=sort(list,m,r);
  comprisons+=merge(list,l,m,r);

}
return comprisons;

  }


  public Integer merge(List<Integer> list,int l,int m,int r)

  {
  	   int compnums=0;
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
  compnums++;
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

return compnums;

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
	Integer comparnums=result.sort(ar,0,ar.size()-1);
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
