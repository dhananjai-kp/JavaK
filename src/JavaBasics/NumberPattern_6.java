package JavaBasics;

class NumberPattern_6
{
  public static void main(String argsp[])
  {
    for (int i=1; i<=20; i++) 
    {
      int no=i;
      for (int j=1; j<=i; j++) 
      {
        System.out.print(j+" ");
        no=no+20-j;      
      }  
      System.out.println();
    }
  }
}
	

