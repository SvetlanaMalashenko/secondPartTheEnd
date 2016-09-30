package beer;

/**
 * Created by svetlana on 25.09.16
 */
public enum Beer {
    Heineken("Lager", 5.0),
    Guiness("Stout", 4.2),
    Corona("Lager", 4.6),
    Budweiser("Lager", 5.0);

    private final String type;
    private final double alcohol;

    private Beer(String type, double alcohol) {
        this.alcohol = alcohol;
        this.type = type;
    }

    public String type() {
        return type;
    }

    public double alcohol() {
        return alcohol;
    }
}
