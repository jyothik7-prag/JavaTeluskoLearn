
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1d array
		int arr[]=new int[4];
		arr[0]=4;
		arr[1]=5;
		arr[2]=2;
		arr[3]=6;
		for(int i=0;i<=3;i++) {
		System.out.println(arr[i]);
		}
		
		
		//2d array
		int a[]= {1,2,3};
		//enhanced for loop for 1d
		for(int k:a) {
			System.out.println(k);
		}
		
		int b[]= {4,5,6};
		int c[]= {6,7,8};
		int d[][]= {{1,2,3},
				{4,5,6},
				{6,7,8}
		};
		
		//enhanced for loop for 2d
		for(int k[]:d) {
			for(int l:k) {
				System.out.print(" "+l);
			}
			System.out.println();
		}
		
		
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				System.out.print(" "+d[i][j]);
			}
			System.out.println();
		}
			
		//jagged array
		int x[]= {1,2,3,5,7};
		int y[]= {4,5,6};
		int z[]= {6,7,8,3};
		int w[][]= {{1,2,3,5,7},
				{4,5,6},
				{6,7,8,3}
		};
		
		for(int i=0;i<w.length;i++) {
			for(int j=0;j<w[i].length;j++) {
				System.out.print(" "+w[i][j]);
			}
			System.out.println();
		}
		

	}

}
