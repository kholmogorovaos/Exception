public class Energy extends NatureElement {
    @Override
    NatureElement connect(NatureElement elem) {
        if (elem instanceof Water) {
            System.out.println("Energy + Water = " + new Steam());
            return new Steam();
        } else {
            throw new UnsupportedOperationException("Недействительное сочетание элементов");
        }
    }

    @Override
    public String toString() {
        return "Energy";
    }
}
