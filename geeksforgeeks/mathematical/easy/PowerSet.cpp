#include <iostream>
#include <bits/stdc++.h>

using namespace std;

void printPowerSet(string s, int n){
    multiset<string> x;
    string res;
    int size = (1 << n) - 1;
    for(int i=1; i<=size; i++){
        for(int j=0; j<n; j++){
            if(i & (1 << j))
                res += s[j];
        }
        x.insert(res);
        res = "";
    }
    for(auto j : x)
        cout << j << " ";
    cout << endl;
}

int main() {
	int t, n;
	cin >> t;
	while(t--){
	    cin >> n;
	    string s;
	    cin >> s;
	    printPowerSet(s, n);
	}
	return 0;
}