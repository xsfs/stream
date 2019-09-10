package terminal;

import function.FileToWords;

public class Informational {
    public static void main(String[] args) throws Exception {
        System.out.println(
                FileToWords.stream("src/Cheese.dat").count());
        System.out.println(
                FileToWords.stream("src/Cheese.dat")
                        .min(String.CASE_INSENSITIVE_ORDER)
                        .orElse("NONE"));
        System.out.println(
                FileToWords.stream("src/Cheese.dat")
                        .max(String.CASE_INSENSITIVE_ORDER)
                        .orElse("NONE"));
    }
}
