package Compare;

import java.util.Comparator;

public class ComparatorTest implements Comparator<ComparatorTest> {

    private int score;

    public ComparatorTest(int score) {
        this.score = score;
    }

    @Override
    public int compare(ComparatorTest o1, ComparatorTest o2) {
        return o1.score - o2.score;
    }
}

