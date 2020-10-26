package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        List<Integer> nums1 = Arrays.stream(in.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> nums2 = Arrays.stream(in.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < Math.min(nums1.size(), nums2.size()); i++) {
            result.add(nums1.get(i));
            result.add(nums2.get(i));
        }

        if (nums1.size() > nums2.size()) {
            result.addAll(getRemainingElements(nums1, nums2));
        } else if (nums2.size() > nums1.size()) {
            result.addAll(getRemainingElements(nums2, nums1));
        }

        System.out.println(result.toString().replaceAll("[\\[\\],]", ""));
    }

    private static Collection<? extends Integer> getRemainingElements(List<Integer> longerList, List<Integer> shorterList) {
        List<Integer> numsLeft = new ArrayList<>();
        for (int i = shorterList.size(); i < longerList.size(); i++) {
            numsLeft.add(longerList.get(i));
        }
        return numsLeft;
    }
}
