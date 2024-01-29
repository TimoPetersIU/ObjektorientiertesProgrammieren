package t.peters.vorlesung4.paintball;

public class PaintBallController {



    public PaintBallModel model;



    public PaintBallController(PaintBallModel model) {
        this.model = model;
        model.setNextPerson();
    }

    public boolean correctMove(int answer) {
        for (String value : this.model.getGegner()) {
            if (value.equals(this.model.getNextPerson()) && answer == 1) {
                model.incrementPunkte();
                return true;
            }
        }
        model.decrementLeben();
        return false;
    }

    public void tooLong() {
        model.decrementLeben();
    }


    public boolean isOver() {
        return !(model.getLeben() == 0);
    }


}
