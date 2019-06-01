#include <bits/stdc++.h>
using namespace std;

int getMax(int n){
    int maximum = INT_MIN;
    for(int i=2; i*i <= n; i++){
        if(n % i == 0){
            while(n % i == 0) n /= i;
            maximum = max(maximum, i);
        }
    }
    return (n != 1) ? max(maximum, n) : maximum;
}

int main(){
    int t, n;
    cin >> t;
    while(t--){
        cin >> n;
        cout << getMax(n) << endl;
    }
    return 0;
}