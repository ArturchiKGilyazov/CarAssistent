package com.obdelm327pro;

import android.app.Activity;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;

import java.util.Locale;

public class SpeechService extends Activity implements View.OnClickListener, TextToSpeech.OnInitListener {


    private TextToSpeech textToSpeech;
    private Locale locale;
    private int speed;
    private int turnovers;

    public void getCommand(){
        
    }

    public void speechText(int value){
        String textCommand = String.valueOf(value);
        Log.v("Log_tag", textCommand);
        textToSpeech.speak(textCommand, TextToSpeech.QUEUE_FLUSH, null, null);
    }

    @Override
    public void onInit(int i) {
        if(i== TextToSpeech.SUCCESS)
            locale = new Locale("ru");
            textToSpeech.setLanguage(locale);
    }

    @Override
    public void onClick(View view) {

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getTurnovers() {
        return turnovers;
    }

    public void setTurnovers(int turnovers) {
        this.turnovers = turnovers;
    }
}
