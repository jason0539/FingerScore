package com.example.scorelibrary.chord.symbol;

import java.util.Arrays;

/**
 * Created by liuzhenhui on 16/8/16.
 */

public class Chord extends Position {
    public String name;

    public Chord() {
    }

    public Chord(int fret, int[] frets, int[] fingers) {
        super(fret, frets, fingers);
    }

    public Chord(String name, int position, int[] frets, int[] fingers) {
        super(position, frets, fingers);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Chord [name=" + name + "] Position [fret=" + position + ", frets=" + Arrays.toString(frets)
                + ", fingers=" + Arrays.toString(fingers) + "]";
    }
}
