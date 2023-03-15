package arraylearning;

public class LearningArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LearningArray2 objlearn = new LearningArray2();
//objlearn.first_non_repeated_element();
objlearn.count_of_repeated_element();
//objlearn.adding_of_two_integer();
//objlearn.add_two_integer_of_two_diff_array();
//objlearn.concatenation_of_two_arrays();
//objlearn.print_the_negative_element();
	}

	private void print_the_negative_element() {
		// TODO Auto-generated method stub
		int[] s1= {12,-3,15,18,-4,-2};
		int count=0;
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]<0)
			{
				count++;
			}
			int []neg= new int[count];
			int j=0;
				if(s1[i]<0)
				{
					neg[j]=s1[i];
					System.out.println(neg[j]);
				j++;
				}
			}
	}

	private void concatenation_of_two_arrays() {
		// TODO Auto-generated method stub
		int[] s1= {100,120,130};
		int[] s2= {300,350,400};
		int len=s1.length+s2.length;
		int[] re=new int[len];
		int j=0;
		for(int i=0;i<re.length;i++)
		{
			if(i<s1.length)
			{
				re[i]=s1[i];
				System.out.println(re[i]);
			}
			else
			{
				re[i]=s2[j];
				System.out.println(re[i]);
				j++;
			}
		}
	}

	private void add_two_integer_of_two_diff_array() {
		// TODO Auto-generated method stub
		int[] e= {20000,20000,20000,20000,20000};
		int[] y= {18000,18000,18000};
		int big=e.length>y.length?e.length:y.length;
		int small=e.length<y.length?e.length:y.length;
		int[] result= new int[big];
//		int i;
//		for(i=0;i<big;i++)
//		{
//			if(i<small)
//			{
//				result[i]=e[i]+y[i];
//				System.out.println(result[i]);
//			}
//			else
//			{
//				result[i]=e[i];
//				System.out.println(result[i]);
//			}
			int i;
		for( i=0;i<small;i++)
		{
			result[i]=e[i]+y[i];
			System.out.println(result[i]);
		}
		while(i<big)
		{
			result[i]=e[i];
			System.out.println(result[i]);
		i++;
		}	
		}

	private void adding_of_two_integer() {
		// TODO Auto-generated method stub
		int[] q= {90,92,100,97,90};
		int[] h= {85,86,100,96,96};
		int[] a= {88,87,100,95,99};
		int[] total= new int[q.length];
		for(int i=0;i<total.length;i++) {
			total[i]=(q[i]+h[i]+a[i])/3;
			System.out.println(total[i]);
		}
	}

	private void count_of_repeated_element() {
		// TODO Auto-generated method stub
		int[] no= {5,5,5,10};
		boolean[] appeared = new boolean[no.length];
		for(int j=0;j<no.length;j++) {
			int f=no[j];
			if(appeared[j]==false) {
				appeared[j]=true;
				int count=1;
				for(int i=j+1;i<no.length;i++) {
					if(f==no[i]) {
						count++;
						appeared[i]=true;
					}
				}
				System.out.println( f + " appeared " + count +" times" );
			}
		}
	}

	private void first_non_repeated_element() {
		// TODO Auto-generated method stub
		int[] value= {5,3,8,7,2,9,4,5,6}; 
		for(int j=0;j<value.length;j++) {
			int f=value[j];
			boolean repeated=false;
			for(int i=j+1;i<value.length;i++) {
				if(f!=value[i]) {
					continue;
				}
				else
				{
					repeated=true;
					break;
				}
			}
			if(repeated==false) {
				System.out.println("first non repeated"+f);
			break;
			}
		}
	}

}
