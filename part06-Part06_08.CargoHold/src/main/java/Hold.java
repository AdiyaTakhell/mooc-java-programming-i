import java.util.ArrayList;
import java.util.List;

public class Hold {

    private int maximumWeight;
    private List<Suitcase> suitcases;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= maximumWeight) {
            suitcases.add(suitcase);
        }
    }

    private int totalWeight() {
        int sum = 0;

        for (Suitcase suitcase : suitcases) {
            sum += suitcase.totalWeight();
        }

        return sum;
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }
}