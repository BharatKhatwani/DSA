package recession.sorting;

import java.util.Arrays;

public class k1_merge_r {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
int[] ans= mergesort(arr);
        System.out.println(Arrays.toString(ans ));
    }

    public static  int[] mergesort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int left[] = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int right[] = mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private  static int[] merge(int[] first, int[] second) {
        int mix[] = new int[first.length+ second.length];
int i =0;
int j =0;
int k =0;
// pointer1and pointer2 are using in a different- different
        while (i <first.length && j<second.length){
            if (first[i] <second[j]){
                mix[k] = first[i];
                i++;
            }else {
                mix[k] = second[j];
                j++;

            }
            k++;
        }
        while (i < first.length) {  // for the element are extra in a part1
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {  // for the element are extra in a apart2 are directly added
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
