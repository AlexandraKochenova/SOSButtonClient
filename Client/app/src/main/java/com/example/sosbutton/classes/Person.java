package com.example.sosbutton.classes;

import android.util.Log;
import android.util.Xml;

import com.example.sosbutton.R;

import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import java.io.IOException;
import java.io.StringWriter;
import java.text.DateFormat;
import java.util.Date;

public class Person {

    private String _name;
    private String _birthday;
    private String _passport;
    private String _medicalData;
    private String _id;

    public Person(@NotNull XmlPullParser parser){
        try {
            while (parser.getEventType() != XmlPullParser.END_DOCUMENT) {
                if (parser.getEventType() == XmlPullParser.START_TAG && parser.getName().equals("profile_data")) {
                    _id = parser.getAttributeValue(2);
                    _name = parser.getAttributeValue(1);
                    _passport = parser.getAttributeValue(4);
                    _birthday = parser.getAttributeValue(0);
                    _medicalData = parser.getAttributeValue(3);
                }
                parser.next();

            }
        }catch (XmlPullParserException ex) {
            Log.i("DEV_SOSBUTTON", "XmlPullParserException");
        }
        catch (IOException ex) {
            Log.i("DEV_SOSBUTTON", "IOException");
        }
    }

    public String get_id(){
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_name() {
        return _name;
    }
    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_birthday() {
        return _birthday;
    }
    public void set_birthday(String _birthday) {
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

    public void saveXml(){
        

    }


}
