package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String line = in.nextLine();

        int maxTotalQuality = Integer.MIN_VALUE;
        double maxAverageQuality = Double.MIN_VALUE;
        int bestLength = Integer.MAX_VALUE;
        String bestBatch = "";

        while (!line.equals("Bake It!")) {
            int[] batch = Arrays.stream(line.split("\\#")).mapToInt(Integer::parseInt).toArray();
            int totalQuality = 0;
            int length = batch.length;

            String batchStr = "";

            for (int i = 0; i < batch.length; i++) {
                totalQuality += batch[i];
                batchStr += batch[i] + " ";
            }
            double averageQuality = (double)totalQuality / (double)length;

            if (maxTotalQuality < totalQuality) {
                maxTotalQuality = totalQuality;
                maxAverageQuality = averageQuality;
                bestLength = length;
                bestBatch = batchStr;
            } else if (maxTotalQuality == totalQuality) {
                if (maxAverageQuality < averageQuality) {
                    maxTotalQuality = totalQuality;
                    maxAverageQuality = averageQuality;
                    bestBatch = batchStr;
                } else if (maxAverageQuality == averageQuality) {
                    if (bestLength > length) {
                        maxTotalQuality = totalQuality;
                        bestLength = length;
                        bestBatch = batchStr;
                    }
                }
            }
            line = in.nextLine();
            if (line.equals("Bake it!")) {
                break;
            }
        }

        System.out.println("Best Batch quality: " + maxTotalQuality);
        System.out.println(bestBatch);
    }
}
