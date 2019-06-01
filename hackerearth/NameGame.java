import java.io.*;

class NearestPrimeAscii{
    private static int[] primes = {67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113};

    private static boolean isPrime(int x){
        int low = 0;
        int high = primes.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(primes[mid] == x)
                return true;
            else if(primes[mid] > x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return false;
    }

    private static void constructString(String x){
        StringBuilder result = new StringBuilder();
        for(int j=0; j<x.length(); j++){
            if(isPrime(x.charAt(j)))
                result.append(x.charAt(j));
            else{
                int difference = Math.abs(x.charAt(j) - primes[0]);
                int pos = 0;
                for(int i=1; i <= 11; i++){
                    int nextDifference = Math.abs(x.charAt(j) - primes[i]);
                    if(nextDifference < difference){
                        difference = nextDifference;
                        pos = i;
                    }
                }
                result.append((char)primes[pos]);
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t > 0){
            int n = Integer.parseInt(br.readLine().trim());
            constructString(br.readLine().trim());
            t -= 1;
        }
    }
}
