package com.example.sosbutton.classes;

import java.text.DateFormat;
import java.util.Date;

public class People {

    private String _name;
    private Date _birthday;
    private String _passport;
    private String _medicalData;

    public People(String name, Date birthday, String numberPassport, String medicalData){
        _name = name;
        _birthday = birthday;
        _passport = numberPassport;
        _medicalData = medicalData;

    }


    public String get_name() {
        return _name;
    }
    public void set_name(String _name) {
        this._name = _name;
    }

    public Date get_birthday() {
        return _birthday;
    }
    public void set_birthday(Date _birthday) {
        this._birthday = _birthday;
    }

    public String get_passport() {
        return _passport;
    }
    public void set_passport(String _passport) {
        this._passport = _passport;
    }

    public String get_medicalData() {
        return _medicalData;
    }
    public void set_medicalData(String _medicalData) {
        this._medicalData = _medicalData;
    }




}
