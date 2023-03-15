package arraylearning;

public class LearningArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LearningArray3 obj= new LearningArray3();
//obj.remove_number();
//obj.linear_array();
//obj.index_of_given_array();
//obj.adding_a_element_in_array();
//obj.adjacent_two_elements();
//obj.sum_of_two_elements();
//obj.divide_3_store_another_array();
//obj.any_element_are_prime_number();
//obj.sorting();
//obj.duplicate_element();
obj.moving_left_twice();
	}
	
	private void moving_left_twice() {
		// TODO Auto-generated method stub
		String[] name= {"sasi","saro","ash"};
		for(int j=0;j<name.length;j++) {
		String extra=name[j];
		int i=0;
		for(;i<name.length-1;i++) {
			name[i]=name[i+1];
		}
		name[i]=extra;
		System.out.println(name[i]);
		}
		
	}

	private void duplicate_element() {
		// TODO Auto-generated method stub
		int[] arr= {3,4,7,3,6,2};
		//int len= arr.length;
		int j;
		for( j=0;j<arr.length-1;j++) {
			for(int i=j+1;i<arr.length-1;i++) {
				if(arr[j]==arr[i]) {
			      arr[i]=arr[i+1];
					//System.out.println("duplicate element is:" + arr[j]);	
				}
			}	
			System.out.println(arr[j]);
	      }
		}

	private void sorting() {
		// TODO Auto-generated method stub
		int[] ar= {50,40,30,20,10};
		int j;
		for( j=1;j<ar.length;j++) {
			for(int i=0;i<ar.length-j;i++) {
				if(ar[i]>ar[i+1]) {
				int temp=ar[i];
				ar[i]=ar[i+1];
				ar[i+1]=temp;
		  }
		}
      }
	//		for(int k=0;k<ar.length;k++) {
//			System.out.println(ar[k]);
//		}
		}

	private void any_element_are_prime_number() {
		// TODO Auto-generated method stub
		int[] ar={15,7,13,21,27,41};
		int i=0;
		while(i<ar.length) {
		int no=ar[i];
		int count=0;
		int divisor=2;
		while(divisor<no) {
			if(no%divisor==0) {
				//System.out.println("not prime");
				count++;
				break;
			}
			divisor++;
		}
		if(count==0) {
			System.out.println(ar[i]);
		}
		i++;
		}
	}

	private void divide_3_store_another_array() {
		// TODO Auto-generated method stub
		int[] ar= {3,6,9,12,15,18,21};
		int len=ar.length;
		int[] re=new int[len];
		int i=0;
		while(i<ar.length) {
			ar[i]=ar[i]/3;
			{
			if(i<ar.length) {
				re[i]=ar[i];
				System.out.println(re[i]);
			}
			
			}
			i++;
		}
	}

	private void sum_of_two_elements() {
		// TODO Auto-generated method stub
		int[] ar= {3,4,6,7,8,3};
		int j=0;
		for(;j<ar.length;j++) {
		int first=ar[j];
		int i=j+1;int sum=0;
		while(i<ar.length) {
			sum=first+ar[i];
			{
		if(sum==10) {
			System.out.println(sum);
		}
	i++;
			}
		}
		}
		j++;
	}
	private void adjacent_two_elements() {
		// TODO Auto-generated method stub
		int[] ar= {7,2,18,16,3,7};
		int j=0;
		while(j<ar.length-1) {
			int s=ar[j];
			int e=ar[j+1];
			int small=s<e?s:e;
			int big=s>e?s:e;
			for(int i=small+1;i<big;i++) {
				System.out.println(i);
			}
			j++;
		}
	}

	private void adding_a_element_in_array() {
		// TODO Auto-generated method stub
		int[] aar= {12,23,44,55,6,5};
		int ar = aar.length;
		int arr[]= new int[ar+1];
		int e=24;
		for(int i=0;i<ar;i++) {
			arr[i]=aar[i];
			System.out.println(arr[i]);
		}
		arr[ar]=e;
		System.out.println(arr[ar]);
	}

	private void index_of_given_array() {
		// TODO Auto-generated method stub
		int[] ar= {23,56,7,88,9,4};
		int value=56;
		int index=7;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==value) {
				index=i;
				break;
			}
		}
			System.out.println("56 is located at "+ index + " index ");
	}

	private void linear_array() {
		// TODO Auto-generated method stub
		int[] ar= {56,7,88,9,23,4};
		int first=55;
		boolean found=false;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==first) {
				System.out.println(" index " + i + " : " + ar[i]);
				found=true;
				break;
			}
			if(found==false) {
				System.out.println("no;it is not present ");
			}
		}
	}

	private void remove_number() {
		// TODO Auto-generated method stub
		int[] ar= {23,56,7,88,9,4};
		int second=56;
		int i;
	    for( i=0;i<ar.length;i++) {
	    	if(ar[i]==second) {
	    		ar[i]=ar[i+1];
	    		i++;
	    	}
	    	 System.out.println(ar[i]);
	    }	
	}
}
