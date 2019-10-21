#pragma GCC optimise ("Ofast")
#include <bits/stdc++.h>
using namespace std;

vector<int> getPrefix(const string& p) {
    int n = p.size();
    vector<int> f(n);
    f[0] = 0;
    for (int i=1; i<n; i++) {
        int j = f[i-1];
        while (j > 0 and p[j] != p[i]) j = f[j-1];
        if (p[i] == p[j]) j++;
        f[i] = j;
    }
    return f;
}
string getPalindrome(string& s) {
    string k = s;
    string rev(s.rbegin(), s.rend());
    rev = rev + '#' + k;
    vector<int> prefix = getPrefix(rev);
    int need = s.length() - prefix[prefix.size() - 1] - 1;
    for (int i=need; i>=0; i--) s += s[i];
    return s;
}
int main(){
    string s;
	while(getline(cin,s)){
        cout << getPalindrome(s) << endl;
	}
    return 0;
}