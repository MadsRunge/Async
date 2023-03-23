package com.example.asynch;

import android.os.AsyncTask;
import android.widget.TextView;

import java.lang.ref.WeakReference;

public class AsyncDataFetch extends AsyncTask<Void, Void, String> {
    private WeakReference<TextView> textview;

    public AsyncDataFetch(TextView textview) {
        this.textview = new WeakReference<>(textview);
    }

    @Override
    protected String doInBackground(Void... voids) {
        try {
            Thread.sleep(4000);
            System.out.println("4 seconds has gone by!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "asdsaadas";
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        System.out.println("asdasdsaddasads");
        textview.get().setText("hey");
    }
}
