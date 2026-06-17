import java.util.ArrayList;

public class Stack {
    private ArrayList<String> items;

    public Stack() {
        this.items = new ArrayList<>();
    }

    // Part 1: Check if the stack is empty
    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    // Part 1: Add a value to the top of the stack
    public void add(String value) {
        this.items.add(value);
    }

    // Part 1: Return all values in the stack as a list
    public ArrayList<String> values() {
        return new ArrayList<>(this.items); // Return a copy to prevent external modification
    }

    // Part 2: Take the topmost value and remove it from the stack
    public String take() {
        if (this.isEmpty()) {
            return null;
        }
        
        // The last element in the ArrayList is the "top" of the stack
        int lastIndex = this.items.size() - 1;
        String value = this.items.get(lastIndex);
        
        this.items.remove(lastIndex);
        
        return value;
    }
}