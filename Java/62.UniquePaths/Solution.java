    //Time O(m*n) Space O(m*n)
    public int uniquePaths(int m, int n) {
    	if(m == 0 || n == 0) return 0;
        int[][] dp = new int[m][n]; //int[i][j] denotes the ways to get to i,j from 0,0.
        
        for(int i = 0; i < m; i++)
        	dp[i][0] = 1;
        
        for(int j = 0; j < n; j++)
        	dp[0][j] = 1;
        
        for(int i = 1; i < m; i++) {
        	for(int j = 1; j < n; j++) {
        		dp[i][j] = dp[i-1][j] + dp[i][j-1];
        	}
        }
        
        return dp[m-1][n-1];
    }

    // Only record one col or row, update the array from left to right
    // Time O(m * n) Space O(n)/O(m)
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                dp[j] = dp[j] + dp[j-1];
            }
        }
        
        return dp[n-1];
    }