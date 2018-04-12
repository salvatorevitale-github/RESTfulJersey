package it.salvo.example.entity;

public class PointVo {


    int x;
    int y;

    public PointVo() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "PointVo{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
