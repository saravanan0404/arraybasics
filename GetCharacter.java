package arraylearning;

import java.util.Scanner;

public class GetCharacter {
	public static void main(String [] args) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter the any character:");
//	//char a=sc.next().charAt(0);
//	//System.out.println(a);
//	System.out.println("Enter the text:");
//	String b=sc.nextLine();
//	System.out.println(b);
//	
//	System.out.println("Enter the text:");
//	String c=sc.next();
//	System.out.println(c);
//	sc.close();
	GetCharacter obj=new GetCharacter();
	obj.games();
	//obj.games1();
	
	}

	private void games1() {
		// TODO Auto-generated method stub
		 Scanner obj=new Scanner(System.in);
		  System.err.println("Enter the number :");
		   
		  int no=obj.nextInt();
		  
		  //int no=9236;
		  int[] num=new int[4];
		  for(int i=num.length-1;i>=0;i--) {
		   num[i]=no%10;
		   no=no/10;
		  }
		  char[] ar=new char[4];
		  int[] num1= {2,7,3,4};
		  for(int j=0;j<num1.length;j++) {
		   boolean[] check=new boolean[4];
		   for(int i=0;i<num1.length;i++) {
		    if(num[j]==num1[i]) {
		     ar[j]='p';
		     check[j]=true;
		     //System.out.println(j);
		     if(j==i) {
		      ar[j]='c';
		     }
		    }
		   }
		   if(check[j]==false) {
		    ar[j]='x';
		   }
		  }
		  
		  for(int i=0;i<num1.length;i++) {
		   System.out.println(ar[i]);
		  }
		  int count=0;
		  for(int i=0;i<num1.length;i++) {
		   if(ar[i]=='c') {
		    count++;
		   }
		  }
		  if(count==4) {
		   System.out.println("Matching number");
		  }
		  else {
		   System.out.println("Non Matching number");
		}
	}






	private void games() {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    System.err.println("Enter the Character value: ");
	    String s = sc.next();  
	    char[] ar = new char[5];
	    for(int i=0;i<s.length();i++) {	     
	    ar[i]=s.charAt(i);
	    	//	ar[i]= (char) (c%10);
//          c /=10; 
	     // sc.close();
	    }
	    char[] arr = new char[5];
	    char[] book = {'w','a','t','c','h'};
	    for(int j=0;j<book.length;j++) {
	      boolean[] check = new boolean[5];
	      for(int i =0;i<book.length;i++) {
	        if(ar[j]==book[i]) {
	          arr[j]='p';
	          check[j]=true;
	          if(j==i) {
	            arr[j]='c';
	          }
	        }
	      }
	        if(check[j]==false) {
	          arr[j]='x';
	        }
	        
	      }
	    for(int i =0;i<arr.length;i++) {
	      System.out.println(arr[i]);
	    }
	    }
	}

