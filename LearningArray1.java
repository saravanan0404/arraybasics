package arraylearning;

public class LearningArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LearningArray1 learn = new LearningArray1();
//learn.first_non_repeated_element();
//learn.first_non_repeated_element1();
//learn.first_repeated_element();
learn.first_repeated_element1();

	}

	private void first_repeated_element1() {
		// TODO Auto-generated method stub
		char[] name= {'Z','I','A','V','U','D','E','E','N'};
	    int j=0;boolean repeated=false;
	    while(repeated==false) {
	    	char first=name[j];
	    	for(int i=j+1;i<name.length;i++) {
	    		if(name[i]==first) {
	    			System.out.println("first repeated:"+first);
	    			repeated=true;
	    			break;
	    		}
//	    		else
//	    		{
//	    			continue;
//	    		}
	    	}
	    	j++;
	    }
	    if(repeated==false) {
	    	System.out.println("no repeated element");
	    }
	}

	private void first_repeated_element() {
		// TODO Auto-generated method stub
	 	char[] name= {'L','A','K','S','H','M','I','K','A','N','T','H','A','N'};
	 	boolean repeated=false;
	 	char first=name[0];
	 	int i;
	 	for(i=1;i<name.length;i++) {
	 		if(first==name[i])
	 		{
	 			System.out.println("Repeated:"+first);
	 			repeated=true;
	 			break;
	 		}
	 		else
	 		{
	 			continue;
	 		}
	 	}
	}

	private void first_non_repeated_element1() {
		// TODO Auto-generated method stub
		int[] ar= {76,87,76,56,78};
		int first=ar[0];
		boolean repeated=false;
		int i=1;
		while(i<ar.length) {
			if(first==ar[i]) {
				repeated=true;
				break;
			}
			i++;
		}
		first=ar[i-1];
		repeated=false;
		while(i<ar.length) {
			if(first==ar[i]) {
				repeated=true;
				break;
			}
			i++;
		}
		if(repeated==false) {
			System.out.println("First non repeated element:"+first);
		}
	}

	private void first_non_repeated_element() {
		// TODO Auto-generated method stub
		char[] name= {'A','R','U','N'};
		char first=name[0];
		int i;
		for( i=1;i<name.length;i++) {
			if(first!=name[i]) {
				
			}
		}
		System.out.println(i);
		if(i==name.length) {
			System.out.println("first non repeated char is:"+ first);
		}
	}

}
