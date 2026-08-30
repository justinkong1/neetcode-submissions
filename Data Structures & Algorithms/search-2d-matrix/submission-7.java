class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int matrixToSearch = 0;
        for(int i = 0; i < matrix.length; i++){
            int low = matrix[i][0];
            int high = matrix[i][matrix[0].length-1];

            if(target == low) return true;
            else if (target == high) return true;
            else if(target > low && target < high) {
                matrixToSearch=i;
                break;
            }
        }
        int left = 0;
        int right = matrix[0].length-1;
        while(left <= right) {
            int middle = left + (right-left)/2;
            if(matrix[matrixToSearch][middle] == target) {
                return true;
            } else if(matrix[matrixToSearch][middle] > target) {
                right = middle-1;
            } else {
                left = middle+1;
            }
        }
        return false;
    }
}

/*
we can go throw each row and get the higher and lower one
get that matrix
search that matrix
and win!
*/