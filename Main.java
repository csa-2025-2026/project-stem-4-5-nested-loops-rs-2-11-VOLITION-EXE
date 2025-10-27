import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner N = new Scanner(System.in);
    pNT(N.nextLine(), N.nextInt());
    printNums();
    System.out.print("Input a number: ");
    upNT(N.nextInt());
    starTree(N.nextInt());
    multTable();
  }

  public static void pNT(String word, int N)
  {
    String s="";
    for(int i=0; i<word.length(); i++)for(int j=0; j<N; j++)s+=word.charAt(i);
    System.out.println(s);
  }

  public static void printNums()
  {
    for(int i = 10; i>0; i--){
      for(int j = 0; j<i; j++)System.out.print(i+" ");
      System.out.println();
    }
  }

  public static void upNT(int N)
  {
    for(int i=0; i<N; i++){
      for(int j=0; j<i+1; j++)System.out.print(j+1+" ");
      System.out.println();
    }
  }

  public static void starTree(int N)
  {
    String n="";
    for(int i=0; i<N; i++){
      System.out.print(n);
      for(int j=i; j<N; j++)System.out.print("* ");
      n+=" ";
      System.out.println();
    }
  }

  public static void multTable()
  {
    for(int i=1; i<11; i++){
      for(int j=1; j<11; j++)System.out.print(j*i+" ");
      System.out.println();
    }
  }
}
