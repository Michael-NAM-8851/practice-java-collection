package com.thoughtworks.collection;

import java.util.List;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {
        return numbers
                .stream()
                .reduce((lastOddNum, currNum) -> currNum % 2 == 1 ? currNum : lastOddNum)
                .get();
    }

    public String getLongest(List<String> words) {
        return words
                .stream()
                .reduce((longestWord, word) -> word.length() > longestWord.length() ? word : longestWord)
                .get();
    }

    public int getTotalLength(List<String> words) {
        return words
                .stream()
                .reduce(0, (accumulator, word) -> accumulator + word.length(), Integer::sum);
    }
}
