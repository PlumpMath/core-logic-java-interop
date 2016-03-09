package com.p12v.logic.java;

import com.p12v.logic.Sudoku;

import java.util.List;

import static java.lang.System.out;
import static java.util.Arrays.asList;

@SuppressWarnings("unchecked")
public class Launcher {
    public static void main(String[] args) {
        List<List> solutions = Sudoku.solve(asList(
                2, 0, 7, 0, 1, 0, 5, 0, 8,
                0, 0, 0, 6, 7, 8, 0, 0, 0,
                8, 0, 0, 0, 0, 0, 0, 0, 6,
                0, 7, 0, 9, 0, 6, 0, 5, 0,
                4, 9, 0, 0, 0, 0, 0, 1, 3,
                0, 3, 0, 4, 0, 1, 0, 2, 0,
                5, 0, 0, 0, 0, 0, 0, 0, 1,
                0, 0, 0, 2, 9, 4, 0, 0, 0,
                3, 0, 6, 0, 8, 0, 4, 0, 9));

        for (List solution : solutions) {
            out.println("\nSolution:\n");
            for (int i = 0; i < solution.size(); i++) {
                out.printf((i + 1) % 9 != 0 ? "%d " : "%d%n", solution.get(i));
            }
        }
    }
}
