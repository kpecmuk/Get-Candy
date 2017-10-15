package ru.kpecmuk.candy;

/**
 * @author kpecmuk
 * @since 15.10.2017
 */
class Girl {
    private int candies = 0;

    void getOneCandy() {
        this.candies++;
    }

    int getResult() {
        return this.candies;
    }
}
