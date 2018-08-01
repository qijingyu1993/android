package com.example.activitytest.Bean;

import java.util.*;

/**
 * Created by USER3 on 2018/7/30.
 */

public class LessonBean {
    private String text;
    private String translate;
    private String url;
    private String start;
    private String end;
    private int lesson_id;
    //words
    private String words_text;
    private String words_translate;
    private String words_url;
    private String words_start;
    private String words_end;
    //sentences
    private String sentences_text;
    private String sentences_kana;
    private String sentences_translate;
    private String sentences_url;
    private String sentences_start;
    private String sentences_end;
    //dialogs
    private String dialogs_text;
    private String dialogs_kana;
    private String dialogs_translate;
    private String dialogs_url;
    private String dialogs_start;
    private String dialogs_end;
    //conversations
    private String conversations_text;
    private String conversations_kana;
    private String conversations_translate;
    private String conversations_url;
    private String conversations_start;
    private String conversations_end;
    //
    private Word title;
    private List<Word> words;
    private List<Dialog> dialogs;
    private List<Sentence> sentences;
    private List<Conversation> conversations;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public int getLesson_id() {
        return lesson_id;
    }

    public void setLesson_id(int lesson_id) {
        this.lesson_id = lesson_id;
    }

    public String getWords_text() {
        return words_text;
    }

    public void setWords_text(String words_text) {
        this.words_text = words_text;
    }

    public String getWords_translate() {
        return words_translate;
    }

    public void setWords_translate(String words_translate) {
        this.words_translate = words_translate;
    }

    public String getWords_url() {
        return words_url;
    }

    public void setWords_url(String words_url) {
        this.words_url = words_url;
    }

    public String getWords_start() {
        return words_start;
    }

    public void setWords_start(String words_start) {
        this.words_start = words_start;
    }

    public String getWords_end() {
        return words_end;
    }

    public void setWords_end(String words_end) {
        this.words_end = words_end;
    }

    public String getSentences_text() {
        return sentences_text;
    }

    public void setSentences_text(String sentences_text) {
        this.sentences_text = sentences_text;
    }

    public String getSentences_kana() {
        return sentences_kana;
    }

    public void setSentences_kana(String sentences_kana) {
        this.sentences_kana = sentences_kana;
    }

    public String getSentences_translate() {
        return sentences_translate;
    }

    public void setSentences_translate(String sentences_translate) {
        this.sentences_translate = sentences_translate;
    }

    public String getSentences_url() {
        return sentences_url;
    }

    public void setSentences_url(String sentences_url) {
        this.sentences_url = sentences_url;
    }

    public String getSentences_start() {
        return sentences_start;
    }

    public void setSentences_start(String sentences_start) {
        this.sentences_start = sentences_start;
    }

    public String getSentences_end() {
        return sentences_end;
    }

    public void setSentences_end(String sentences_end) {
        this.sentences_end = sentences_end;
    }

    public String getDialogs_text() {
        return dialogs_text;
    }

    public void setDialogs_text(String dialogs_text) {
        this.dialogs_text = dialogs_text;
    }

    public String getDialogs_kana() {
        return dialogs_kana;
    }

    public void setDialogs_kana(String dialogs_kana) {
        this.dialogs_kana = dialogs_kana;
    }

    public String getDialogs_translate() {
        return dialogs_translate;
    }

    public void setDialogs_translate(String dialogs_translate) {
        this.dialogs_translate = dialogs_translate;
    }

    public String getDialogs_url() {
        return dialogs_url;
    }

    public void setDialogs_url(String dialogs_url) {
        this.dialogs_url = dialogs_url;
    }

    public String getDialogs_start() {
        return dialogs_start;
    }

    public void setDialogs_start(String dialogs_start) {
        this.dialogs_start = dialogs_start;
    }

    public String getDialogs_end() {
        return dialogs_end;
    }

    public void setDialogs_end(String dialogs_end) {
        this.dialogs_end = dialogs_end;
    }

    public String getConversations_text() {
        return conversations_text;
    }

    public void setConversations_text(String conversations_text) {
        this.conversations_text = conversations_text;
    }

    public String getConversations_kana() {
        return conversations_kana;
    }

    public void setConversations_kana(String conversations_kana) {
        this.conversations_kana = conversations_kana;
    }

    public String getConversations_translate() {
        return conversations_translate;
    }

    public void setConversations_translate(String conversations_translate) {
        this.conversations_translate = conversations_translate;
    }

    public String getConversations_url() {
        return conversations_url;
    }

    public void setConversations_url(String conversations_url) {
        this.conversations_url = conversations_url;
    }

    public String getConversations_start() {
        return conversations_start;
    }

    public void setConversations_start(String conversations_start) {
        this.conversations_start = conversations_start;
    }

    public String getConversations_end() {
        return conversations_end;
    }

    public void setConversations_end(String conversations_end) {
        this.conversations_end = conversations_end;
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    public List<Dialog> getDialogs() {
        return dialogs;
    }

    public void setDialogs(List<Dialog> dialogs) {
        this.dialogs = dialogs;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    public List<Conversation> getConversations() {
        return conversations;
    }

    public void setConversations(List<Conversation> conversations) {
        this.conversations = conversations;
    }

    public Word getTitle() {
        return title;
    }

    public void setTitle(Word title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "LessonBean{" +
                "conversations=" + conversations +
                ", conversations_end='" + conversations_end + '\'' +
                ", conversations_kana='" + conversations_kana + '\'' +
                ", conversations_start='" + conversations_start + '\'' +
                ", conversations_text='" + conversations_text + '\'' +
                ", conversations_translate='" + conversations_translate + '\'' +
                ", conversations_url='" + conversations_url + '\'' +
                ", dialogs=" + dialogs +
                ", dialogs_end='" + dialogs_end + '\'' +
                ", dialogs_kana='" + dialogs_kana + '\'' +
                ", dialogs_start='" + dialogs_start + '\'' +
                ", dialogs_text='" + dialogs_text + '\'' +
                ", dialogs_translate='" + dialogs_translate + '\'' +
                ", dialogs_url='" + dialogs_url + '\'' +
                ", end='" + end + '\'' +
                ", lesson_id=" + lesson_id +
                ", sentences=" + sentences +
                ", sentences_end='" + sentences_end + '\'' +
                ", sentences_kana='" + sentences_kana + '\'' +
                ", sentences_start='" + sentences_start + '\'' +
                ", sentences_text='" + sentences_text + '\'' +
                ", sentences_translate='" + sentences_translate + '\'' +
                ", sentences_url='" + sentences_url + '\'' +
                ", start='" + start + '\'' +
                ", text='" + text + '\'' +
                ", title=" + title +
                ", translate='" + translate + '\'' +
                ", url='" + url + '\'' +
                ", words=" + words +
                ", words_end='" + words_end + '\'' +
                ", words_start='" + words_start + '\'' +
                ", words_text='" + words_text + '\'' +
                ", words_translate='" + words_translate + '\'' +
                ", words_url='" + words_url + '\'' +
                '}';
    }
}
