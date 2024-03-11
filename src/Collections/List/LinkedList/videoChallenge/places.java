package Collections.List.LinkedList.videoChallenge;

public record places(String town, int distanceFromSydney) {
    @Override
    public String toString() {
        return  town +"("+distanceFromSydney+")" ;
    }
}
