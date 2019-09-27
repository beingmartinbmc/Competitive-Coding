class ZArray {
    public int[] buildZArray(char[] input) {
        int[] z = new int[input.length];
        int n = input.length;
        int left = 0, right = 0;
        for (int i=1; i<n; i++) {
            if (i > right) {
                left = right = i;
                while (right < n && input[right] == input[right - left]) right++;
                z[i] = right - left;
                right -= 1;
            }
            else {
                int i1 = i - left;
                if (z[i1] < right - i + 1) z[i] = z[i1];
                else {
                    left = i;
                    while (right < n && input[right] == input[right - left]) right++;
                    z[i] = right - left;
                    right -= 1;
                }
            }
        }
        return z;
    }
}