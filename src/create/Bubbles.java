package create;

import function.Bubble;

import java.util.stream.Stream;

public class Bubbles {
    public static void main(String[] args) {
        Stream.generate(Bubble::bubbler)
                .limit(5)
                .forEach(System.out::println);
    }
}
