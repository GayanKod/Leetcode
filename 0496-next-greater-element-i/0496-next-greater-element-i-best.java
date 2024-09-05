class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        short[] map = new short[10001];
        int[] stack = new int[nums2.length];
        int[] result = new int[nums1.length];
        int si = 0;
        int ri = 0;

        for (int n2 : nums2) {
            while (si != 0 && n2 > stack[si-1]) map[stack[--si]] = (short)n2;

            stack[si++] = n2;
        }

        while (si != 0) map[stack[--si]] = -1;
        for (int n1 : nums1) result[ri++] = map[n1];

        return result;
    }
}