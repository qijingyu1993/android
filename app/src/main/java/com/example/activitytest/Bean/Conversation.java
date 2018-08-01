package com.example.activitytest.Bean;

import java.util.List;

/**
 * Created by USER3 on 2018/7/30.
 */

public class Conversation {
    private String speaker;
    private String start;
    private String end;
    private List<Word> pattern;

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
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
        return "Conversation{" +
                "end='" + end + '\'' +
                ", pattern=" + pattern +
                ", speaker='" + speaker + '\'' +
                ", start='" + start + '\'' +
                '}';
    }
}
