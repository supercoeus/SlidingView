package com.kohoh.SlidingView;

/**
 * 封装位置的坐标信息
 */
public class Coordinate {
    /**
     * x轴的坐标
     */
    public int x;
    /**
     * y轴的坐标
     */
    public int y;

    /**
     * 构建一个坐标，并设置他的值。
     *
     * @param x x轴的坐标
     * @param y y轴的坐标
     */
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 计算两坐标之间的距离
     *
     * @param c1 坐标1
     * @param c2 坐标2
     * @return 坐标c1与坐标c2间的距离
     */
    static public float computeDistance(Coordinate c1, Coordinate c2) {
        return (float) Math.sqrt(Math.pow((c1.x - c2.x), 2) + Math.pow((c1.y - c2.y), 2));
    }
}
