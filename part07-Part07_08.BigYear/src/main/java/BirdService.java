
public class BirdService {

    private final BirdDatabase database;

    public BirdService(BirdDatabase database) {
        this.database = database;
    }

    public void addBird(String name, String latinName) {
        database.addBird(name, latinName);
    }

    public void recordObservation(String name) {
        database.findBirdByName(name)
                .ifPresentOrElse(Bird::addObservation,
                        () -> System.out.println("Not a bird!"));
    }

    public void printAllBirds() {
        database.getAllBirds().forEach(System.out::println);
    }

    public void printOneBird(String name) {
        database.findBirdByName(name)
                .ifPresentOrElse(System.out::println,
                        () -> System.out.println("Not a bird!"));
    }
}
