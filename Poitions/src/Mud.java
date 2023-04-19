public class Mud extends NatureElement {
    @Override
    NatureElement connect(NatureElement elem) {
        throw new UnsupportedOperationException("Недействительное сочетание элементов");
    }

    @Override
    public String toString() {
        return "Mud";
    }
}
