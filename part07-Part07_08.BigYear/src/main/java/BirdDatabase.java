import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BirdDatabase {
    private final List<Bird> birds = new ArrayList<>();

    public void addBird(String name, String latinName) {
        birds.add(new Bird(name, latinName));
    }

    public Optional<Bird> findBirdByName(String name) {
        return birds.stream()
                .filter(b -> b.getName().equalsIgnoreCase(name))
                .findFirst();
    }

    public List<Bird> getAllBirds() {
        return new ArrayList<>(birds);
    }
}
