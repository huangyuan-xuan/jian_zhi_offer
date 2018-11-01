package com.huangyuanlove;

import java.util.Arrays;

/**
 * 随机从中抽出了5张牌,想测测自己的手气,看看能不能抽到顺子,
 *  如果牌能组成顺子就输出true，否则就输出false。为了方便起见,你可以认为大小王是0。
 */
public class IsContinuous {
    public boolean isContinuous(int[] numbers) {

        int numberOfZero = 0;
        int numberInterval = 0;
        int length = numbers.length;
        if (length == 0) {
            return false;
        }

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == 0) {
                numberOfZero++;
                continue;
            }
            if (numbers[i] == numbers[i + 1]) {
                return false;
            }

            numberInterval += numbers[i + 1] - numbers[i] - 1;

        }
        return numberOfZero >= numberInterval;
    }
}
