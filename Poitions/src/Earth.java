public class Earth extends NatureElement {
    @Override
    NatureElement connect(NatureElement elem) {
        if (elem instanceof Air) {
            System.out.println("Earth + Air = " + new Dust());
            return new Dust();
        } else if (elem instanceof Earth) {
            System.out.println("Earth + Earth = " + new Pressure());
            return new Pressure();
        } else if (elem instanceof Water) {
            System.out.println("Earth + Water = " + new Mud());
            return new Mud();
        } else if (elem instanceof Fire) {
            System.out.println("Earth + Fire = " + new Lava());
            return new Lava();
        }else {
            throw new UnsupportedOperationException("Недействительное сочетание элементов");
        }
    }
}
