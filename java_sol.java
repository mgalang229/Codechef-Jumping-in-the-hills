import java.io.*;
import java.util.*;

public class Main {
	static final Reader in = new Reader();
	static final PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		int t=in.nextInt();
		for(int i=1; i<=t; ++i)
			new Solver();
		out.close();
	}
	
	static class Solver {
		Solver() {
			int n=in.nextInt(), u=in.nextInt(), d=in.nextInt();
			int a[] = new int[n];
			for(int i=0; i<n; ++i)
				a[i]=in.nextInt();
			int id=0, par=1;
			for(int i=0; i<n-1; ++i) {
				if(a[i]<=a[i+1]&&a[i+1]-a[i]<=u)
					id=i+1;
				else if(a[i]>=a[i+1]&&a[i]-a[i+1]<=d)
					id=i+1;
				else if(a[i]>=a[i+1]&&par!=0) {
					par=0;
					id=i+1;
				} else
					break;
			}
			out.println(id+1);
		}
	}
	
	static class Reader {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String next() {
			while(st==null||!st.hasMoreTokens()) {
				try {
					st=new StringTokenizer(in.readLine());
				} catch(Exception e) {}
			}	
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
	
}
