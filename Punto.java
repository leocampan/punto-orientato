import java.util.*;

public class Punto {
    private double x;
    private double y;

    public Punto() {
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Punto x(double x) {
        setX(x);
        return this;
    }

    public Punto y(double y) {
        setY(y);
        return this;
    }

    public double distanza(Punto p2) {
        return Math.sqrt(Math.pow(p2.getX() - getX(), 2) + Math.pow(p2.getY() - getY(), 2));
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Punto)) {
            return false;
        }
        Punto punto = (Punto) o;
        return x == punto.x && y == punto.y;
    }

    public int hashCode() {
        return Objects.hash(x, y);
    }

    public String toString() {
        return "Coordinata X = " + getX() + "\nCoordinata y = " + getY();
    }
}