package com.example.sosbutton.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sosbutton.R;

import org.xmlpull.v1.XmlPullParser;

public class ProfileActivity extends Activity {

    private TextView _fioTxt;
    private EditText _fioInputTxt;
    private TextView _birthdayTxt;
    private EditText _birthdayInputTxt;
    private TextView _passportTxt;
    private EditText _passportInputTxt;
    private TextView _medicalDataTxt;
    private EditText _medicalDataInputTxt;
    private DatePicker _birthdayDatePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);

        _fioTxt = (TextView) findViewById(R.id.fio_txt);
        _fioInputTxt = (EditText) findViewById(R.id.fio_input_txt);
        _birthdayTxt = (TextView) findViewById(R.id.birthday_txt);
        _birthdayInputTxt = (EditText) findViewById(R.id.birthday_input_txt);
        _birthdayDatePicker = (DatePicker) findViewById(R.id.birthday_input_date_picker);
        _passportTxt = (TextView) findViewById(R.id.passport_txt);
        _passportInputTxt = (EditText) findViewById(R.id.passport_input_txt);
        _medicalDataTxt = (TextView) findViewById(R.id.medical_data_txt);
        _medicalDataInputTxt = (EditText) findViewById(R.id.medical_data_input_txt);

        _fioInputTxt.setText(getResources().getString(R.xml.profile_data.name));
    }

    public void onSaveBtnClick(View v) {
        //сохранить инфу в xml

        //сохранить в бд, отправить на сервер

        Toast.makeText(getApplicationContext(), R.string.save_toast_text, Toast.LENGTH_SHORT).show();

    }
}
