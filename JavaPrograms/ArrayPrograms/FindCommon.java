package ArrayPrograms;

import java.util.ArrayList;

public class FindCommon {

	public static void main(String[] args) {
		// Three sorted array find the common
		
		int[] a = {2,4,8,10,20,45};
		int[] b = {2,6,8,10};
		int[] c = {2,8,10,12,20,30};
		
		int x=0,y=0,z=0;
		
		ArrayList<Integer> al = new ArrayList<>();
		
		while(x<a.length && y<b.length && z<c.length) {
			if(a[x]==b[y] && b[y]==c[z]) {
				al.add(a[x]);
				x++;y++;z++;
			}
			else if(a[x]<b[y]) {
				x++;
			}
			else if (b[y]<c[z]) {
				y++;
			}
			else {
				z++;
			}
		}
		for(int no: al) {
			System.out.println(no);
		}
	}

}
