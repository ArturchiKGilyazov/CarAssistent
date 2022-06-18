//package com.obdelm327pro;
//
//import android.app.Activity;
//import android.content.Intent;
//import android.os.Bundle;
//import android.speech.RecognizerIntent;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//
//import java.util.ArrayList;
//
//public class SpeechActivity extends Activity {
//    private TextView EnteredText;
//    //Это значение мы используем для проверки успеха
//    //получения обратной информации в onActivityResult ():
//    private static final int Print_Words = 100;
//
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
////        setContentView(R.layout.);TODO
//
////        EnteredText = (TextView) findViewById(R.id.tv);
//
////        Button mButton = (Button) findViewById(R.id.button);
//        mButton.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//
//                //Вызываем RecognizerIntent для голосового ввода и преобразования голоса в текст:
//                Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
//                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
//                intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Скажите слово для распознавания");
//                startActivityForResult(intent, Print_Words);
//            }
//        });
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//
//        //Проверяем успешность получения обратного ответа:
//        if (requestCode==Print_Words && resultCode==RESULT_OK) {
//            //Как результат получаем строковый массив слов, похожих на произнесенное:
//            ArrayList<String> result=data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
//            //и отображаем их в элементе TextView:
//            EnteredText.setText(result.toString());
//        }
//        super.onActivityResult(requestCode, resultCode, data);
//    }
//}
