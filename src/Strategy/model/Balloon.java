package Strategy.model;

import Strategy.controller.ScoreAlgorithmBase;

public class Balloon extends ScoreAlgorithmBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) - 20;
    }
}
