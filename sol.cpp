#include <bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
using namespace std;
using namespace __gnu_pbds;

#define ll long long
#define ar array

typedef tree<int, null_type, less<int>, rb_tree_tag,
tree_order_statistics_node_update> indexed_set;

void solve() {
	int n, u, d;
	cin >> n >> u >> d;
	int a[n];
	for(int i=0; i<n; ++i)
		cin >> a[i];
	int id=0, par=1;
	for(int i=0; i<n-1; ++i) {
		if(a[i]==a[i+1])
			id=i+1;
		else if(a[i]<a[i+1]&&abs(a[i]-a[i+1])<=u)
			id=i+1;
		else if(a[i]>a[i+1]&&abs(a[i]-a[i+1])<=d)
			id=i+1;
		else if(a[i]>a[i+1]&&par!=0) {
			par=0;
			id=i+1;
		} else
			break;
	}
	cout << id+1 << "\n";
}

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);
	
	int t;
	cin >> t;
	while(t--)
		solve();
}
