
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public int getPrice() {
        return squares * princePerSquare;

    }

    public int priceDifference(Apartment compared) {
        return Math.abs(compared.getPrice() - this.getPrice());
    }

    public int totalArea() {
        return squares;

    }

    public boolean largerThan(Apartment compared) {

        return this.totalArea() > compared.totalArea();

    }

    public boolean moreExpensiveThan(Apartment compared) {
        return this.getPrice() > compared.getPrice();
    }

}
