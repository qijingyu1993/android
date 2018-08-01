package com.example.activitytest.Bean;

import java.util.List;

/**
 * Created by USER3 on 2018/7/30.
 */

public class Dialog {
    private int id;
    private String text;
    private String translate;
    private String start;
    private String end;
    private List<Word> pattern;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
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

    public List<Word> getPattern() {
        return pattern;
    }

    public void setPattern(List<Word> pattern) {
        this.pattern = pattern;
    }

    @Override
    public String toString() {
        return "Dialog{" +
                "end='" + end + '\'' +
                ", id=" + id +
                ", pattern=" + pattern +
                ", start='" + start + '\'' +
                ", text='" + text + '\'' +
                ", translate='" + translate + '\'' +
                '}';
    }
}
