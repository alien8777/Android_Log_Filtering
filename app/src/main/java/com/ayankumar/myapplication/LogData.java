package com.ayankumar.myapplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LogData {
    public StringBuilder readLogs(String tag) {
        StringBuilder logBuilder = new StringBuilder();
        try {
            Process process = Runtime.getRuntime().exec("logcat -d *:"+tag);
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                logBuilder.append(line + "\n");
            }
        } catch (IOException e) {
        }
        return logBuilder;
    }

}
