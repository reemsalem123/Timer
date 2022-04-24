package application.controller;

import application.Main;
import application.model.Timer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class TimerController {

	Timer t;
	Thread thread;
	@FXML
	Button timer;

	public TimerController() {
		super();
		System.out.println("start");
		t = Main.t;

	}

	@FXML
	public void initialize() {
		t.setButton(timer);
		thread = new Thread(t);
		thread.start();
		thread.suspend();
	}

	@FXML
	protected void pause(ActionEvent event) {
		System.out.println("pause");
		thread.suspend();
	}

	@FXML
	protected void start(ActionEvent event) {
		System.out.println("start");
		thread.resume();
	}

	@FXML
	protected void reset(ActionEvent event) {
		System.out.println("reset");
		thread.suspend();
		t.resetTimer();
	}

	@FXML
	protected void hu(ActionEvent event) {
		t.hu();
	}

	@FXML
	protected void hd(ActionEvent event) {
		System.out.println("hd");
		t.hd();
	}

	@FXML
	protected void mu(ActionEvent event) {
		System.out.println("mu");
		t.mu();
	}

	@FXML
	protected void md(ActionEvent event) {
		System.out.println("md");
		t.md();
	}

	@FXML
	protected void su(ActionEvent event) {
		System.out.println("su");
		t.su();
	}

	@FXML
	protected void sd(ActionEvent event) {
		System.out.println("sd");
		t.sd();
	}
}
