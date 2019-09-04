package operation;

import function.FileToWords;

public class Peeking {
    public static void main(String[] args) throws Exception {
        FileToWords.stream("/Users/zhangzhuohui/IdeaProjects/idea1/streams/src/Cheese.dat")
                .skip(21)
                .limit(4)
                .map(w -> w + " ")
                .peek(System.out::print)
                .map(String::toUpperCase)
                .peek(System.out::print)
                .map(String::toLowerCase)
                .forEach(System.out::print);
    }
}
