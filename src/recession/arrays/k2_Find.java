package recession.arrays;

import java.util.ArrayList;

public class k2_Find {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 4, 4, 5};
//        System.out.println(find(arr, 4, 0));
       System.out.println(findIndex(arr, 4, 0));
//        System.out.println(findIndexLast(arr, 4, arr.length - 1));
//        findAllIndex(arr, 4, 0);
//        System.out.println(list);
//
//        ArrayList<Integer> list2 = new ArrayList<>();
//        ArrayList<Integer> ans = findAllIndex(arr, 4, 0, list2);
//        System.out.println(ans);
//        System.out.println(list2);
//
//        System.out.println(findAllIndex2(arr, 4, 0));
    }
//   check wheather the lement in the array or not
    static boolean find(int[] arr, int target, int index)
    {
        if (index == arr.length)
        {
            return false;
        }
        // ya index equal target kya fir vo arr in under mil jayena chaiya
        return arr[index] == target || find(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index)
    {
        if (index == arr.length)
        {
            return -1;
        }
        if (arr[index] == target)
        {
            return index;
        }
        else
        {
            return findIndex(arr, target, index + 1);
        }
    }

    static int findIndexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexLast(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);  // wherever we are added our answer in it to return same index value
        }
        findAllIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);

        return list;
    }
}
