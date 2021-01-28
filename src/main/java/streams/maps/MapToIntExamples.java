package streams.maps;

import java.util.List;

public class MapToIntExamples {

    /**
     * Strings length sum using the reduce method.
     *
     * FIRST EXAMPLE: We are using lambda expression in 1st parameter
     *
     * @param words
     * @return
     */
    public static int sumLengthWordsWithoutMethodReferenceAndWithMap(List<String> words) {
        int totalLength = words.stream()
                .mapToInt(word -> word.length())
                .sum();

        return totalLength;
    }

    /**
     * Strings length sum using the reduce method.
     *
     * FIRST EXAMPLE: Now we switch the lambda expression by Method Reference
     *
     * @param words
     * @return
     */
    public static int sumLengthWordsWithMethodReferenceAndWithMap(List<String> words) {
        int totalLength = words.stream()
                .mapToInt(String::length)
                .sum();

        return totalLength;
    }

}
