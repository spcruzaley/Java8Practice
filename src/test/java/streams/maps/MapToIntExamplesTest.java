package streams.maps;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapToIntExamplesTest {

    @Test
    public void testSumLengthWordsWithoutMethodReferenceAndWithMap() {
        int expectedSum = 45;
        List<String> words = buildWordsList();

        int actualSum = MapToIntExamples
                .sumLengthWordsWithoutMethodReferenceAndWithMap(words);

        Assert.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testSumLengthWordsWithMethodReferenceAndWithMap() {
        int expectedSum = 45;
        List<String> words = buildWordsList();

        int actualSum = MapToIntExamples
                .sumLengthWordsWithMethodReferenceAndWithMap(words);

        Assert.assertEquals(expectedSum, actualSum);
    }

    private List<String> buildWordsList() {
        List<String> wordsList = Stream
                .of("Lambda", "Stream", "Consumer", "Provider", "Predicate", "Optional")
                .collect(Collectors.toList());

        return wordsList;
    }

}
