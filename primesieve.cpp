#include <iostream>
#include <vector>
#include <cmath>

using namespace std;

int main() {
    int n, m;
    cin >> n >> m;
    vector<bool> primes(n+1, true);
    primes[0] = false;
    primes[1] = false;
    int sqn = sqrt(n);
    int count = 0;

    for(int i = 2; i <= n; i++) {
        if(primes[i]) {
            count++;
            for(int j = i*2; j <= n; j += i) {
                primes[j] = false;
            }
        }
    }

    cout << count << endl;

    for(int i = 0; i < m; i++) {
        int x;
        cin >> x;

        if (primes[x])
        	cout << '1' << endl;
        else
        	cout << '0' << endl;
    }
}