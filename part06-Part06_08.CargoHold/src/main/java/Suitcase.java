
import java.util.*;

public class Suitcase {

    private List<Item> items = new ArrayList<>();
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maximumWeight) {
            this.items.add(item);
        }
    }

    public int totalWeight() {
        int sum = 0;

        for (Item i : items) {
            sum += i.getWeight();
        }

        return sum;
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

   public Item heaviestItem() {

    if (items.isEmpty()) {
        return null;
    }

    Item heaviest = items.get(0);

    for (Item item : items) {
        if (item.getWeight() > heaviest.getWeight()) {
            heaviest = item;
        }
    }

    return heaviest;
}

    @Override
    public String toString() {
        if (items.size() == 0) {
            return "no items (" + totalWeight() + " kg)";
        } else if (items.size() == 1) {
            return items.size() + " item (" + totalWeight() + " kg)";

        }

        return items.size() + " items (" + totalWeight() + " kg)";
    }
}
