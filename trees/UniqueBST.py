class Solution(object):
    cache = {}

    
    def factorial(self, n):
        if n <= 1: self.cache[n] = 1
        else:
            self.cache[n] = n * self.factorial(n - 1)
        return self.cache[n]


    def numTrees(self, n):
        return self.factorial(2 * n)//(self.factorial(n + 1) * self.factorial(n))
