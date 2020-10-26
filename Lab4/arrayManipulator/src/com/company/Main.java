package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] nums = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String cmd = in.nextLine();

        while (!cmd.equals("end")) {
            String[] cmdArgs = cmd.split(" ");

            if (cmdArgs[0].equals("exchange")) {
                int index = Integer.parseInt(cmdArgs[1]);
                if (index >= 0 && index < nums.length) {
                    exchange(nums, index);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (cmdArgs[0].equals("max")) {
                if (cmdArgs[1].equals("even")) {
                    int index = findMaxEvenIndex(nums);
                    if (index >= 0) {
                        System.out.println(index);
                    } else {
                        System.out.println("No matches");
                    }

                } else {
                    int index = findMaxOddIndex(nums);
                    if (index >= 0) {
                        System.out.println(index);
                    } else {
                        System.out.println("No matches");
                    }
                }
            } else if (cmdArgs[0].equals("min")) {
                if (cmdArgs[1].equals("even")) {
                    int index = findMinEvenIndex(nums);
                    if (index >= 0) {
                        System.out.println(index);
                    } else {
                        System.out.println("No matches");
                    }
                } else {
                    int index = findMinOddIndex(nums);
                    if (index >= 0) {
                        System.out.println(index);
                    } else {
                        System.out.println("No matches");
                    }
                }
            } else if (cmdArgs[0].equals("first")) {
                int count = Integer.parseInt(cmdArgs[1]);
                if (cmdArgs[2].equals("even")) {
                    if (count <= nums.length) {
                        printFirstEven(nums, count);
                    } else {
                        System.out.println("Invalid count");
                    }
                } else {
                    if (count <= nums.length) {
                        printFirstOdd(nums, count);
                    } else {
                        System.out.println("Invalid count");
                    }
                }
            } else {
                int count = Integer.parseInt(cmdArgs[1]);
                if (cmdArgs[2].equals("even")) {
                    if (count <= nums.length) {
                        printLastEven(nums, count);
                    } else {
                        System.out.println("Invalid count");
                    }
                } else {
                    if (count <= nums.length) {
                        printLastOdd(nums, count);
                    } else {
                        System.out.println("Invalid count");
                    }
                }
            }

            cmd = in.nextLine();
            if (cmd.equals("end")) {
                printArray(nums);
            }
        }


    }

    private static void printLastOdd(int[] nums, int count) {
        int[] arr = new int[nums.length];

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 == 1 && count > 0) {
                arr[i] = nums[i];
                count--;
            } else {
                arr[i] = -1;
            }
        }
        printArray(arr);
    }

    private static void printLastEven(int[] nums, int count) {
        int[] arr = new int[nums.length];

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 == 0 && count > 0) {
                arr[i] = nums[i];
                count--;
            } else {
                arr[i] = -1;
            }
        }
        printArray(arr);
    }

    private static void printFirstOdd(int[] nums, int count) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1 && count > 0) {
                arr[i] = nums[i];
                count--;
            } else {
                arr[i] = -1;
            }
        }
        printArray(arr);
    }

    private static void exchange(int[] nums, int index) {
        int[] first = new int[index + 1];
        int[] second = new int[nums.length - (index + 1)];

        for (int i = 0; i <= index; i++) {
            first[i] = nums[i];
        }

        for (int i = index + 1; i < nums.length; i++) {
            second[i - (index + 1)] = nums[i];
        }

        for (int i = 0; i < second.length; i++) {
            nums[i] = second[i];
        }

        for (int i = second.length; i < nums.length; i++) {
            nums[i] = first[i - second.length];
        }
    }

    private static void printFirstEven(int[] nums, int count) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 && count > 0) {
                arr[i] = nums[i];
                count--;
            } else {
                arr[i] = -1;
            }
        }
        printArray(arr);
    }

    private static int findMinOddIndex(int[] nums) {
        int index = -1;

        int minNum = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (minNum >= nums[i] && nums[i] % 2 == 1) {
                minNum = nums[i];
                index = i;
            }
        }
        return index;
    }

    private static int findMinEvenIndex(int[] nums) {
        int index = -1;

        int minNum = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (minNum >= nums[i] && nums[i] % 2 == 0) {
                minNum = nums[i];
                index = i;
            }
        }
        return index;
    }

    private static int findMaxOddIndex(int[] nums) {
        int index = -1;

        int maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (maxNum <= nums[i] && nums[i] % 2 == 1) {
                maxNum = nums[i];
                index = i;
            }
        }

        return index;
    }

    private static int findMaxEvenIndex(int[] nums) {
        int index = -1;

        int maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (maxNum <= nums[i] && nums[i] % 2 == 0) {
                maxNum = nums[i];
                index = i;
            }
        }

        return index;
    }

    private static void printArray(int[] nums) {
        System.out.print("[");
        boolean printFirst = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1) {
                    if (printFirst) {
                        System.out.print(nums[i]);
                        printFirst = false;
                    } else {
                        System.out.print(", " + nums[i]);
                    }

            }
        }
        System.out.println("]");
    }
}

