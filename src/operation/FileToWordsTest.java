package operation;

import function.FileToWords;

public class FileToWordsTest {
    public static void main(String[] args) throws Exception {
        FileToWords.stream("/Users/zhangzhuohui/IdeaProjects/idea1/streams/src/Cheese.dat")
                .limit(7)
                .forEach(s -> System.out.format("%s ", s));
        System.out.println();
        FileToWords.stream("/Users/zhangzhuohui/IdeaProjects/idea1/streams/src/Cheese.dat")
                .skip(7)
                .limit(2)
                .forEach(s -> System.out.format("%s ", s));
    }
}
