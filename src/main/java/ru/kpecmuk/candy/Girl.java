package ru.kpecmuk.candy;

/**
 * @author kpecmuk
 * @since 15.10.2017
 */
class Girl {
    private int candies = 0;

    void gotOneCandy() {
        this.candies++;
    }

    @Override
    public String toString() {
        return "" + this.candies;
    }
}
