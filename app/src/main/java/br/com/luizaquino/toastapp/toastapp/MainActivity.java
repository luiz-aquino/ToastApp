package br.com.luizaquino.toastapp.toastapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.com.luizaquino.mylibrary.mylibrary.CustomToast;

public class MainActivity extends AppCompatActivity {

    private CustomToast customToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        customToast = new CustomToast();

        if (BuildConfig.REPORT_CRASH)
            customToast.showToast(this, "Report Crash!");
        else
            customToast.showToast(this, "Do not report crash!");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMessage(View view) {
        customToast.showToast(view.getContext(), "Mensagem");
    }
}
