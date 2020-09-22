import java.util.Scanner;

public class Quiz2_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int[][] box = new int[10][10];
		int sum=0;
		for(int i=0 ; i<n ; i++) {
			int x = sc.nextInt();
			int y = 0;
			int move = sc.nextInt();
			int[] moveSet = new int[move];
			for(int m=0 ; m<move ; m++) {
				moveSet[m] = sc.nextInt();
			}
			if(box[x][0]==1) {
				break;
			}
			for(int m=0 ; m<move ; m++) {
				if(box[x][y+1]==1) {
					break;
				}
				if(moveSet[m]==0) {
					break;
				}
				if(moveSet[m]==1 && x<9 && box[x+1][y]==0) {
					x++;
				}
				if(moveSet[m]==-1 && x>0 && box[x-1][y]==0) {
					x--;
				}
				if(box[x][y+1]!=1) {
					y++;
				}
			}
			while(y<9 && box[x][y+1]!=1) {
				y++;
			}
			box[x][y]=1;
		}
		int stack=0;
		boolean getScore = true;
//		for(int i=0 ; i<10 ; i++) {
//			for(int j=0 ; j<10 ; j++) {
//				System.out.print(box[i][j]);
//			}
//			System.out.println();
//		}
		for(int i=9 ; i>=0 ; i--) {
			for(int j=0 ; j<10 ; j++) {
				if(box[j][i]==0) {
					stack=0;
					getScore=false;
					break;
				}
			}
			if(getScore) {
				stack++;
				if(stack>3) {
					sum+=500;
				}else {
					sum+=100;
				}
			}
		}
		System.out.println(sum);
	}
}
