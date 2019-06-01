#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void expand(string a, int start, int end, unordered_multiset<string>& s){
    while(start >= 0 && end < a.length() && a[start] == a[end]){
        string temp = a.substr(start, end - start + 1);
        if(temp.length() > 1) s.insert(temp);
        start --;
        end ++;
    }
}

int getCount(string a){
    unordered_multiset<string> s;
    for(int i=0; i<a.length(); i++){
        expand(a, i, i, s);
        expand(a, i, i + 1, s);
    }
    return s.size();
}

int main() {
    int t, n;
    cin >> t;
    while(t--){
        cin >> n;
        string s;
        cin >> s;
        cout << getCount(s) << endl;
    }
	return 0;
}
