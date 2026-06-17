public class BirdWatcher {
    private String name;
    private String latin;
    private int observations;

    public BirdWatcher(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.observations = 0; // always start at 0
    }

    public String getName() {
        return name;
    }

    public String getLatin() {
        return latin;
    }

    public int getObservations() {
        return observations;
    }

    public void addObservation() {
        this.observations++;
    }

    @Override
    public String toString() {
        return name + " (" + latin + "): " + observations + " observations";
    }
}
