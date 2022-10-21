package ru.netology.sqr;

public class SqrService {
    public int calcSqr(int start, int finish) {
        int variable = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= start & i * i <= finish) {
                variable++;
            }
        }
        return variable;
    }
}