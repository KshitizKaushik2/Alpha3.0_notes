import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import java.util.Collections;

public class array_list {
    // this is swap function
    // public static void swap(ArrayList<Integer> list, int indx1, int indx2) {
    // System.err.println("this is old list: " + list);
    // int temp = list.get(indx1);
    // list.set(indx1, list.get(indx2));
    // list.set(indx2, temp);
    // System.out.println("this is new list: " + list);
    // }

    // this function is for maximim water problem
    // public static int maxWater(ArrayList<Integer> height){ // this is a brute
    // force
    // int max = 0;
    // for (int i = 0; i < height.size(); i++) {
    // for (int j = i+1; j < height.size(); j++) {
    // int h = Math.min(height.get(i), height.get(j));
    // int b = j-i;
    // int curwater = h*b;
    // max = Math.max(curwater, max);
    // }
    // }
    // return max;
    // }

    // this is optimized solution of the max water problem
    // public static int maxWater(ArrayList<Integer> list) { // O(n)
    // int max = 0;
    // int lp = 0;
    // int rp = list.size() - 1;
    // while (lp < rp) {
    // int ht = Math.min(list.get(lp), list.get(rp));
    // int wt = rp - lp;
    // int cur = ht * wt;
    // max = Math.max(max, cur);
    // if (list.get(lp) < list.get(rp)) {
    // lp++;
    // } else {
    // rp--;
    // }
    // }
    // return max;
    // }

    // This function is used to see if sum of two number is exist or not
    // public static boolean sum2num(ArrayList<Integer> list, int num){
    // Collections.sort(list);
    // int lft = 0;
    // int rgt = list.size()-1;
    // while (lft!=rgt) {
    // if(list.get(lft)+list.get(rgt) == num){
    // System.out.println("two numbers are: " + lft + " & " + rgt);
    // return true;
    // }
    // if(list.get(lft)+list.get(rgt) < num){
    // lft++;
    // }
    // if(list.get(lft)+list.get(rgt) > num){
    // rgt--;
    // }
    // }
    // return false;
    // }

    // this function is to find out target sum of sorted and rotated array

    public static boolean rotatedListSum(ArrayList<Integer> list, int num) {
        int pvt = -1;
        int size = list.size();

        for (int i = 0; i < size; i++) {
            if (list.get(i) > list.get(i + 1)) {
                pvt = i;
                break;
            }
        }

        int lp = pvt + 1;
        int rp = pvt;

        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == num) {
                System.out.println("sum num are: " + list.get(lp) + " & " + list.get(rp));
                return true;
            }

            else if (list.get(lp) + list.get(rp) < num) {
                lp = (lp + 1) % size;
            } else {
                rp = (size + rp - 1) % size;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        // syntax of array list
        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        // add f(n) time complexity O(1)
        // list.add(1);
        // list.add(6);
        // list.add(7);
        // list.add(4);
        // list.add(1,56); // add element on any index O(n)
        // System.out.println(list);

        // get f(n) time complexity O(1)
        // int element = list.get(0);
        // System.out.println(element);

        // remove f(n) time complexity O(n)
        // list.remove(1);
        // System.out.println(list);

        // set element at index time complexity O(n)
        // list.set(0, 77);
        // System.out.println(list);

        // contains f(n) time complexty O(n)
        // System.out.println(list.contains(77));
        // System.out.println(list.contains(1));

        // print the reverse of the array using arrayn list
        // for(int i = list.size()-1; i >= 0; i--){
        // System.out.println(list.get(i));
        // }

        // this finds max of two numbers using array list
        // int max = Integer.MIN_VALUE;
        // for (int i = 0; i < list.size(); i++) {
        // if(max<list.get(i)){
        // max = list.get(i);
        // }
        // }
        // System.out.println("max elemet: " + max);

        // this program swaps the two numbers
        // int indx1 = 1, indx2 = 3;
        // swap(list, indx1, indx2);

        // sorting
        // System.out.println(list);
        // Collections.sort(list); //assending sort
        // System.out.println(list);
        // Collections.sort(list, Collections.reverseOrder()); //decending order
        // System.out.println(list);

        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<Integer> list2 = new ArrayList<>();
        // ArrayList<Integer> list3 = new ArrayList<>();

        // for (int i = 1; i <= 5; i++) {
        // list1.add(i * 1);
        // list2.add(i * 2);
        // list3.add(i * 3);
        // }

        // mainList.add(list1);
        // mainList.add(list2);
        // mainList.add(list3);
        // for (int i = 0; i < mainList.size(); i++) {
        // ArrayList<Integer> newlist = mainList.get(i);
        // for(int j = 0; j < newlist.size(); j++){
        // System.out.print(newlist.get(j) + " ");
        // }
        // System.out.println();
        // }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int num = 14;

        System.out.println(rotatedListSum(list, num));

    }
}