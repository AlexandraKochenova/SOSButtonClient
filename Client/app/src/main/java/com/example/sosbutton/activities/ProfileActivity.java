package com.example.sosbutton.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sosbutton.R;
import com.example.sosbutton.classes.NetworkService;
import com.example.sosbutton.classes.Person;
import com.example.sosbutton.classes.Post;


import org.xmlpull.v1.XmlPullParser;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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

    private Person _person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);

        _fioTxt = (TextView) findViewById(R.id.fio_txt);
        _fioInputTxt = (EditText) findViewById(R.id.fio_input_txt);
        _birthdayTxt = (TextView) findViewById(R.id.birthday_txt);
        _birthdayInputTxt = (EditText) findViewById(R.id.birthday_input_txt);
        //_birthdayDatePicker = (DatePicker) findViewById(R.id.birthday_input_date_picker);
        _passportTxt = (TextView) findViewById(R.id.passport_txt);
        _passportInputTxt = (EditText) findViewById(R.id.passport_input_txt);
        _medicalDataTxt = (TextView) findViewById(R.id.medical_data_txt);
        _medicalDataInputTxt = (EditText) findViewById(R.id.medical_data_input_txt);

        XmlPullParser parser = getResources().getXml(R.xml.profile_data);
        _person = new Person(parser);
        _fioInputTxt.setText(_person.get_name());
        _birthdayInputTxt.setText(_person.get_birthday());
        _passportInputTxt.setText(_person.get_passport());
        _medicalDataInputTxt.setText(_person.get_medicalData());

    }

    public void onSaveBtnClick(View v) {
        //сохранить инфу в xml
        _person.set_name(_fioInputTxt.getText().toString());
        _person.set_birthday(_birthdayInputTxt.getText().toString());
        _person.set_passport(_passportInputTxt.getText().toString());
        _person.set_medicalData(_medicalDataInputTxt.getText().toString());
        _person.saveXml();

        //сохранить в бд, отправить на сервер



        NetworkService.getInstance()
                .getJSONApi()
                .getPostWithID(_person.get_name())
                .enqueue(new Callback<Post>() {
                    @Override
                    public void onResponse(Call<Post> call, Response<Post> response) {
                        Post post = response.body();

                        _person.set_id(post.getUserId());
                        _fioInputTxt.setText(post.getUsername());
                    }

                    @Override
                    public void onFailure(Call<Post> call, Throwable throwable) {
                        _fioTxt.append(throwable.toString());
                        throwable.printStackTrace();
                    }
                });

        Toast.makeText(getApplicationContext(), R.string.save_toast_text, Toast.LENGTH_SHORT).show();
    }
}
