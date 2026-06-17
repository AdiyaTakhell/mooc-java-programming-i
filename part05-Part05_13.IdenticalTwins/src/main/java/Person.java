
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object obj) {
        // If both references point to the same object
        if (this == obj) {
            return true;
        }

        // If obj is not a Person, return false
        if (!(obj instanceof Person)) {
            return false;
        }

        // Cast obj to Person
        Person other = (Person) obj;

        // Compare all fields
        return this.name.equals(other.name)
                && this.birthday.equals(other.birthday) // use equals for SimpleDate
                && this.height == other.height
                && this.weight == other.weight;
    }
}
