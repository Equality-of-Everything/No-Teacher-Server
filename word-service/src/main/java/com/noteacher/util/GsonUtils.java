package com.noteacher.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.sql.Timestamp;

/**
 * @Author : Zhang
 * @Date : Created in 2024/5/27 16:47
 * @Decription :
 */

public class GsonUtils {

    private static Gson gson;

    public static Gson getGsonInstance() {
        if (gson == null) {
            gson = new GsonBuilder()
                    .registerTypeAdapter(Timestamp.class, new TimestampTypeAdapter())
                    .create();
        }
        return gson;
    }
}