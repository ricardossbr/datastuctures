package model;

import java.util.stream.IntStream;

public class SourceBuilder {

    public static int[] getShortListNumbers(){
        return IntStream.rangeClosed(1, 500).toArray();
    }

    public static int[] getBigListNumbers(){
        return IntStream.rangeClosed(1, 500000000).toArray();
    }
}
