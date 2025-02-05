package ex10;

public enum TrafficLight {
    RED(30),
    GREEN(45),
    YELLOW(5);

    private final int duration;

    // Construtor do enum que recebe a duração
    TrafficLight(int duration) {
        this.duration = duration;
    }

    // Método para obter a duração
    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return this.name() + " - Duration: " + this.duration + " seconds";
    }
}