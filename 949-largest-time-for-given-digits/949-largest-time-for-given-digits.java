class Solution {
    public String largestTimeFromDigits(int[] arr) {
        Arrays.sort(arr);
        if (arr[0] >= 3) {
            return "";
        }
        if (arr[1] >= 7) {
            return "";
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] <= 2) {
                for (int j = arr.length - 1; j >= 0; j--){
                    if (j != i && arr[i] <= 1 && arr[j] <= 9 || j != i && arr[i] == 2 && arr[j] <= 3) {
                        for (int k = arr.length - 1; k >= 0; k--){
                            if (k != i && k != j && arr[k] <= 5) {
                                for (int l = arr.length - 1; l >= 0; l--) {
                                    if (l != i && l != j && l != k && arr[l] <= 9) {
                                        String s = String.valueOf(arr[i]) + String.valueOf(arr[j]) +":" + String.valueOf(arr[k]) + String.valueOf(arr[l]);
                                        return s;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return "";
    }
}