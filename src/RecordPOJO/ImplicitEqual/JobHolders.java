package RecordPOJO.ImplicitEqual;

public class JobHolders {
    private final String id;
    private final String name;
    private final String dateofBirth;
    private final String classList;

    public JobHolders(String id, String name, String dateofBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateofBirth = dateofBirth;
        this.classList = classList;
    }

    @Override
    public String toString() {
        System.out.printf(" %s %s %s ",id, name,  dateofBirth);
        return classList;
    }
}
