import java.util.NoSuchElementException;

abstract public class NatureElement {
    NatureElement connect(NatureElement elem) {
        throw new UnsupportedOperationException("Недействительное сочетание элементов");
    }

    static NatureElement create(String name) {
        switch (name.toLowerCase()) {
            case "fire":
                return new Fire();
            case "air":
                return new Air();
            case "earth":
                return new Earth();
            case "water":
                return new Water();
            default:
                throw new NoSuchElementException("Неизвестный элемент: " + name);
        }
    }
}
