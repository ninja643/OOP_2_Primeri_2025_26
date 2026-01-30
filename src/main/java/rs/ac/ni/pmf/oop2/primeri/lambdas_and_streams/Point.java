package rs.ac.ni.pmf.oop2.primeri.lambdas_and_streams;

public record Point(double x, double y) {
    public double distance(final Point other) {
        return Math.sqrt(Math.pow(other.x - x, 2) + Math.pow(other.y - y, 2));
    }
}
