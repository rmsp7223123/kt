package com.example.kt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

class Solution {
    public int solution(String t, String p) {
        int length = t.length() - p.length() + 1;
        long pNum = Long.parseLong(p);
        int answer = 0;

        for (int i = 0; i < length; i++) {
            String temp = t.substring(i, i + p.length());

            if (Long.parseLong(temp) <= pNum) {
                answer++;
            }
        }
        return answer;
    }
}

class Solution2 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int i = 0;
        int j = 0;
        int k = 0;
        while(k<goal.length){
            if(i < cards1.length&&goal[k].equals(cards1[i])){
                k++;
                i++;
            } else if(j < cards2.length&&goal[k].equals(cards2[j])){
                k++;
                j++;
            } else break;
        }
        return k==goal.length ? "Yes" : "No";
    };
};