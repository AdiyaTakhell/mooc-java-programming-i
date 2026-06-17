
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        // increment count and add to sum
        this.count++;
        this.sum += number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        // simply return the sum field
        return this.sum;
    }

    public double average() {
        if (count == 0) {
            return 0; // avoid division by zero
        }
        return (double) this.sum / this.count;
    }
    
    
}
