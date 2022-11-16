package com.mesentllc.fun.random.emotions;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static java.awt.EventQueue.invokeLater;

public class EmotionRefresher {
	private final List<String> emotions;

	public EmotionRefresher() {
		emotions = ResourceUtils.readEmotions();
	}

	public void update(JLabel lblEmotion, JTextArea txtDescription, int refreshInSeconds) {
		int emotionNumber = new Random().nextInt(emotions.size());
		String[] segments = emotions.get(emotionNumber).split(":");
		lblEmotion.setText(segments[0].trim());
		txtDescription.setText(segments[1].trim());
		if (refreshInSeconds > 0) {
			Executors.newSingleThreadScheduledExecutor().schedule(() ->
				invokeLater(() -> update(lblEmotion, txtDescription, refreshInSeconds)), refreshInSeconds, TimeUnit.SECONDS);
		}
	}
}
