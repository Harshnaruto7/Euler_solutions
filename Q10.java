package com.solution;

public class abundant {
        public static boolean checkForSum(int num) {
            int start = 0;
            int end = abundant.size() - 1;

            while (start < end) {
                if (abundant.get(start) == num) {
                    return true;
                }
                else if (abundant.get(start)*2 == num) {
                    return false;
                }
                else if (abundant.get(end)*2 == num) {
                    return false;
                }
                else if (abundant.get(start) + abundant.get(end) == num) {
                    return false;
                }
                else if (abundant.get(start) + abundant.get(end) < num) {
                    start++;
                }
                else if (abundant.get(start) + abundant.get(end) > num) {
                    end--;
                }
            }
            return true;
        }

    private static int get(int start) {
        return 0;
    }

    private static int size() {
        return 0;
    }


}

