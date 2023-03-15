package arraylearning;

public class LearningArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearningArray4 learn = new LearningArray4();
//learn.addition();
//learn.addition1();
//learn.matrix_addition();
//learn.matrix_muliplication();
//learn.spiral_matrix();
//learn.sprial_matrix1();
//learn.sprial_matrix2();
//learn.sprial_matrix3();
//int result=learn.find_fact(5);
//System.out.println(result);
int N = 3;
learn.tower_of_hanoi(N, 'A', 'C', 'B');

//A, B and C are names of rods
	}

	private int find_fact(int no) {
		// TODO Auto-generated method stub
		if(no==1) {
			return no;
		}
		return no*find_fact(no-1);
	}

	private void sprial_matrix3() {
		// TODO Auto-generated method stub
		int mincol=0,maxcol=3,minrow=0,maxrow=3;
		int no=16;
		int ar[][]=new int[4][4];
		while(1<=no) {
		     for(int col=maxcol;col>=mincol;col--) {
		    	 ar[minrow][col]=no;
		    	 no--;
		     }
		     minrow++;
		     for(int row=minrow;row<=maxrow;row++) {
		    	 ar[row][mincol]=no;
		    	 no--;
		     }
		     mincol++;
		     for(int col=mincol;col<=maxcol;col++) {
		    	 ar[maxrow][col]=no;
		    	 no--;
		     }
		     maxrow--;
		     for(int row=maxrow;row>=minrow;row--) {
		    	 ar[row][maxcol]=no;
		    	 no--;
		     }
		     maxcol--;
		}
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length;j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}

	private void sprial_matrix2() {
		// TODO Auto-generated method stub
		int mincol=0,maxcol=3,minrow=0,maxrow=3;
		int no=16;
		int ar[][]=new int[4][4];
		while(1<=no) {
			for(int col=mincol;col<=maxcol;col++) {
				ar[minrow][col]=no;
				no--;
			}
		minrow++;
		for(int row=minrow;row<=maxrow;row++) {
			ar[row][maxcol]=no;
			no--;
		}
		maxcol--;
		for(int col=maxcol;col>=mincol;col--) {
			ar[maxrow][col]=no;
			no--;
		}
		maxrow--;
		for(int row=maxrow;row>=minrow;row--) {
			ar[row][mincol]=no;
			no--;
		}
		mincol++;
		}
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length;j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}

	private void sprial_matrix1() {
		// TODO Auto-generated method stub
		int mincol=0,maxcol=3,minrow=0,maxrow=3;
		int no=1;
		int ar[][]=new int[4][4];
		while(no<=16) {
			for(int col=maxcol;col>=mincol;col--) {
				ar[minrow][col]=no;
				no++;
			}
			minrow++;
			for(int row=minrow;row<=maxrow;row++) {
					ar[row][mincol]=no;
				no++;
			}
			mincol++;
			for(int col=mincol;col<=maxcol;col++) {
				ar[maxrow][col]=no;
				no++;
			}
			maxrow--;
			for(int row=maxrow;row>=minrow;row--) {
				ar[row][maxcol]=no;
				no++;
			}
			maxcol--;
		}
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length;j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}

	private void spiral_matrix() {
		// TODO Auto-generated method stub
		int mincol=0,maxcol=3,minrow=0,maxrow=3;
		int no=1;
		int ar[][]=new int[4][4];
		while(no<=16) {
			for(int col=mincol;col<=maxcol;col++) {
				ar[minrow][col]=no;
				no++;
				//System.out.println(no);
			}
			minrow++;
			for(int row=minrow;row<=maxrow;row++) {
				ar[row][maxcol]=no;
				no++;
			}
			maxcol--;
			for(int col=maxcol;col>=mincol;col--) {
				ar[maxrow][col]=no;
				no++;
			}
			maxrow--;
			for(int row=maxrow;row>=minrow;row--) {
				ar[row][mincol]=no;
				no++;
			}
			mincol++;
		}
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length;j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
		}

	private void tower_of_hanoi(int n, char from_rod, char to_rod, char inter_rod) {
		{
			if (n == 0) {
				return;
			}
			tower_of_hanoi(n - 1, from_rod, inter_rod, to_rod);
			System.out.println("Move disk " + n + " from_rod " + from_rod + " to_rod " + to_rod);
			tower_of_hanoi(n - 1, inter_rod, to_rod, from_rod);

		}
	}

	private void matrix_muliplication() {
		// TODO Auto-generated method stub
		int[][] a= {{1,2},{3,4}};
		int[][] b= {{5,6},{7,8}};
		int[][] result=new int[2][2];
        for(int r=0;r<a.length;r++) {
        	for(int c=0;c<b[r].length;c++) {
        		for(int k=0;k<a.length;k++) {
        		result[r][c] += a[r][k]*b[k][c];
        	}
        		System.out.print(result[r][c]);
        	}
        }
	  for(int i=0;i<a.length;i++) {  
		  for(int j=0;j<b.length;j++) { 
	  System.out.print(result[i][j] +" ");  }  
	  }
	}
	 

	private void matrix_addition() {
		// TODO Auto-generated method stub
		int[][] a = { { 1, 2 }, { 3, 4 } };
		int[][] b = { { 5, 6 }, { 7, 8 } };
		int row1=2,col1=2,row2=2,col2=2;
		int[][] result = new int[row1][col2];
		for (int r = 0; r < row1; r++) {
			for (int c = 0; c < col1; c++) {
				result[r][c] = a[r][c] + b[r][c];
				//System.out.println(result[r][c]);
			}
		}
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col2; j++) {
				System.out.print(result[i][j] + " ");
	}
		}
	}

	private void addition1() {
		// TODO Auto-generated method stub
		int arr[][] = { { 70, 80, 40, 90, 60 }, { 50, 60, 70, 80, 90 }, { 100, 100, 100, 100, 100 } };
		int[] result = new int[3];
		for (int r = 0; r < arr.length; r++) {
			int total = 0;
			for (int c = 0; c < arr[r].length; c++) {
				total = total + arr[r][c];
			}
			// System.out.println(total);
			result[r] = total;
			// System.out.println(result[r]);
			int first = 0, second = 0;
			if (result[r] > first) {
				second = first;
				first = result[r];
			} else if (result[r] > second) {
				second = result[r];
			}
			System.out.println(first);
			System.out.println(second);
		}
	}

	private void addition() {
		// TODO Auto-generated method stub
		int arr[][] = { { 70, 80, 40, 90, 60 }, { 50, 60, 70, 80, 90 }, { 100, 100, 100, 100, 100 } };
		int r = 0, total = 0;
		for (int c = 0; c < arr[0].length; c++) {
			total = total + arr[r][c];
		}
		System.out.println(total);

	}

}
