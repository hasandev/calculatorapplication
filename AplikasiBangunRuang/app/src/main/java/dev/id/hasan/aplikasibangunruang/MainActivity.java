package dev.id.hasan.aplikasibangunruang;

import android.content.Intent;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etSisi;
    Button btnHitungVolume;

    CoordinatorLayout rootLayoutSnackbar;

    int Hitung, Sisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSisi = (EditText)findViewById(R.id.etSisi);
        btnHitungVolume = (Button)findViewById(R.id.btnHasil);

        rootLayoutSnackbar = (CoordinatorLayout)findViewById(R.id.coordinatorRootLayout);

        btnHitungVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int getSisi = Integer.parseInt(etSisi.getText().toString());
                VolumeKubus(getSisi);
            }
        });

    }
    public int VolumeKubus(int Sisi) {
        int Hitung = Sisi * Sisi * Sisi;
        Snackbar VolumeKubus = Snackbar.make(rootLayoutSnackbar, "Luas Kubus adalah " + Hitung, Snackbar.LENGTH_SHORT);
        VolumeKubus.show();
        return Hitung;
    }
}