public class Pressure extends NatureElement {
    @Override
    NatureElement connect(NatureElement elem) {
        throw new UnsupportedOperationException("Недействительное сочетание элементов");
    }

    @Override
    public String toString() {
        return "Pressure";
    }
}