package t.peters.vorlesung4.paintball;

public class Main {

    public static void main(String[] args) {
        PaintBallModel model = new PaintBallModel();
        View view = new View(model);
        view.start();
    }
}
