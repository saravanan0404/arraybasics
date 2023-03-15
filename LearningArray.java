package arraylearning;

public class LearningArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LearningArray objlearn=new LearningArray();
 // objlearn.declare_array();
  //int[] marks= {77,83,92,93,97};
  //System.out.println("before adding 2 ");
  //objlearn.print_array(marks);
  //marks=objlearn.add2_array(marks);
  //System.out.print("After adding 2 ");
  //for(int i=0;i<marks.length;i++)
  //{
	//  System.out.print(marks[i]+" ");
 
//}
//objlearn.linear_search();
objlearn.copying_given_array_reverse_order();
//objlearn.moving_left();
    }

	private void moving_left() {
		// TODO Auto-generated method stub
		String []names= {"sarki","sasi","sathish"};
		String extra=names[0];
		int i=0;
		for(;i<names.length-1;i++)
		{
			names[i]=names[i+1];
			System.out.print(names[i]+" ");
		}
			names[i]=extra;
			System.out.print(names[i]+" ");
	}

	private void copying_given_array_reverse_order() {
		// TODO Auto-generated method stub
		int ar[]= {15,25,10,5,8};
		int len = ar.length;
		int i=0;
		while(i<len/2) {
			int extra=ar[i];
			ar[i]=ar[len-i+1];
			ar[len-i+1]=extra;
			i++;
		}
		System.out.println(ar[i]);
	}
	

	private void linear_search() {
		// TODO Auto-generated method stub
		int[] marks= {77,83,92,93,99};
		int mark = 83;
		boolean found = false; 
		for(int i=0; i<marks.length;i++)
		{
			if(marks[i] == mark)
			{
		System.out.println("yes it is present at position "+ i);
			found = true; 
			break;
			}
		}
		if(found==false)
		{
			System.out.println("No, it is not present");
		}
	}

	private int[] add2_array(int[] marks) {
		// TODO Auto-generated method stub
		for(int i=0;i<marks.length;i++)
		{
		   marks[i]=marks[i]+2;
			
		}
		return marks;
	}

	private void print_array(int[] marks) {
		// TODO Auto-generated method stub
		for(int i=0; i<marks.length;i++) {
			System.out.print(marks[i]+" ");
		}
	}

	private void declare_array() {
		// TODO Auto-generated method stub
		int[] marks = {77,83,92,93,99}; 
	    String[] names = new String[3]; 
	    names[0] = "zia"; 
	    names[1] = "karuppasami"; 
	    names[2] = "arunkumar"; 
	    
	    int[] values = new int[0]; 
	    System.out.println(marks.length);
	    System.out.println(names.length);
	    System.out.println(values.length);
	}

}
