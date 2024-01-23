package edu.bsu.cs;

public class SillyMethods {
    public boolean didGuess42(int guess) {
        return guess == 42;
    }

    public String countTo(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= n; i++){
            result.append(i).append(" ");
        }
        return result.toString().trim();
    }
}
