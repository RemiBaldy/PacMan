package sample.Controller;

import sample.Model.Model;

public class Controller {

    Model model;
    KeyHandler keyHandler;
    private boolean running;

    public Controller() {
        this.keyHandler = new KeyHandler();
        this.running = true;
    }

    public KeyHandler getKeyHandler() {
        return keyHandler;
    }

    /**
     * Method called at start when loading the fxml file
     */
    public void initialize() {
        //String file = this.getLevelFile(0);
        this.model = new Model();
        //this.update(PacManModel.Direction.NONE);
        //ghostEatingModeCounter = 25;
        //this.startTimer();
    }
}
