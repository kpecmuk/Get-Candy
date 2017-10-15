package ru.kpecmuk.candy;

/**
 * @author kpecmuk
 * @since 15.10.2017
 */
class Box {
    private int items;

    Box(int items) {
        this.items = items;
    }

    boolean getCandy() {
        if (this.items == 0) {
            return false;
        } else {
            this.items--;
            return true;
        }
    }

    int getResult() {
        return this.items;
    }
}
