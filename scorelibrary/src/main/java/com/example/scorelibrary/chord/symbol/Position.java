package com.example.scorelibrary.chord.symbol;

import java.util.Arrays;

/**
 * Created by liuzhenhui on 16/8/16.
 */

public class Position {

    public int position;
    public int frets[] = new int[6];
    public int fingers[] = new int[6];

    public Position() {
    }

    public Position(int position, int[] frets, int[] fingers) {
        super();
        this.position = position;
        this.frets = frets;
        this.fingers = fingers;
    }

    @Override
    public String toString() {
        return "Position [fret=" + position + ", frets=" + Arrays.toString(frets)
                + ", fingers=" + Arrays.toString(fingers) + "]";
    }

}
