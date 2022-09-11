class Solution {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        } else {
            int i = 1;
            while (digits[digits.length - i] == 9 && i < digits.length) {
                digits[digits.length - i] = 0;
                i++;
            }
            if (i == digits.length && digits[0] == 9) {
                int[] arr = new int[i + 1];
                arr[0] = 1;
                return arr;
            }
            digits[digits.length - i] = digits[digits.length - i] + 1;
            return digits;
        }
    }
}