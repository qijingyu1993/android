package com.example.activitytest;

import android.app.Application;
import  com.example.activitytest.Bean.LessonBean;

import java.util.*;

/**
 * Created by USER3 on 2018/7/30.
 */

public class Book extends Application{

    public static List<LessonBean> lessonBeanList;

    @Override
    public void onCreate() {
        super.onCreate();
        lessonBeanList = new ArrayList<LessonBean>();
    }

}


