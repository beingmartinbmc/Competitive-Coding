#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void expand(string a, int left, int right, unordered_set<string>& s){
    while(left >= 0 && right < a.length() && a[left] == a[right]){
        string temp = a.substr(left, right - left + 1);
        s.insert(temp);
        left--;
        right ++;
    }
}

int getCount(string s){
    unordered_set<string> a;
    for(int i=0; i<s.length(); i++){
        expand(s, i, i + 1, a);
        expand(s, i, i, a);
    }
    return a.size();
}

int main() {
	int t;
	cin >> t;
	while(t--){
	    string s;
	    cin >> s;
	    cout << getCount(s) << endl;
	}
	return 0;
}
