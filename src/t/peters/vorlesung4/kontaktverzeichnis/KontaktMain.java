package t.peters.vorlesung4.kontaktverzeichnis;
public class KontaktMain {

    public static void main(String[] args) {
        Controller controller = new Controller();
        View view = new View(controller);

        while (true) {
            view.handleMenuItem();
        }

    }
}
