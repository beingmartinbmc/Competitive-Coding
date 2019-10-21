#pragma GCC optimise ("Ofast")
#include <bits/stdc++.h>
using namespace std;

vector<int> buildZArray(const string& s) {
    vector<int> z(s.size());
    z[0] = 0;
    int left = 0, right = 0;
    int n = s.size();
    for (int i=1; i<n; i++) {
        if (i > right) {
            left = right = i;
            while (right < n and s[right] == s[right - left]) right++;
            z[i] = right - left;
            right -= 1;
        }
        else {
            int i1 = i - left;
            if (z[i1] < right - i + 1) z[i] = z[i1];
            else {
                left = i;
                while (right < n and s[right] == s[right - left]) right++;
                z[i] = right - left;
                right -= 1;
            }
        }
    }
    return z;
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin >> t;
    while (t--) {
        string s;
        cin >> s;
        reverse(s.begin(), s.end());
        vector<int> z = buildZArray(s);
        z[0] = s.size();
        reverse(z.begin(), z.end());
        int q;
        cin >> q;
        while (q--) {
            int id;
            cin >> id;
            cout << z[id - 1] << endl;
        }
    }
    return 0;
}