import java.util.Scanner;

public class Quiz2_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row,col,dep,n;
		row = sc.nextInt();
		col = sc.nextInt();
		dep = sc.nextInt();
		n = sc.nextInt();
		int[][][] box = new int[row][col][dep];
		int sum=0;
		for(int i=0 ; i<n ; i++) {
			int exp = sc.nextInt();
			int r = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			if(box[r][c][d]==0) {
				box[r][c][d]=1;
				sum++;
			}
			for(int j=1 ; j<=exp ; j++) {
				if(r-j>=0 && box[r-j][c][d]!=1) {
					box[r-j][c][d]=1;
					sum++;
				}
				if(r+j<row && box[r+j][c][d]!=1) {
					box[r+j][c][d]=1;
					sum++;
				}
				if(c-j>=0 && box[r][c-j][d]!=1) {
					box[r][c-j][d]=1;
					sum++;
				}
				if(c+j<col && box[r][c+j][d]!=1) {
					box[r][c+j][d]=1;
					sum++;
				}
				if(d-j>=0 && box[r][c][d-j]!=1) {
					box[r][c][d-j]=1;
					sum++;
				}
				if(d+j<dep && box[r][c][d+j]!=1) {
					box[r][c][d+j]=1;
					sum++;
				}
			}
		}
		System.out.println(sum);
	}
}
