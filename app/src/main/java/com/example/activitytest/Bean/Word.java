package com.example.activitytest.Bean;

/**
 * Created by USER3 on 2018/7/30.
 */

public class Word {
    private int id;
    private String text;
    private String translate;
    private String kana;
    private String start;
    private String end;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public String getKana() {
        return kana;
    }

    public void setKana(String kana) {
        this.kana = kana;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Word{" +
                "end='" + end + '\'' +
                ", id=" + id +
                ", kana='" + kana + '\'' +
                ", start='" + start + '\'' +
                ", text='" + text + '\'' +
                ", translate='" + translate + '\'' +
                '}';
    }
}
