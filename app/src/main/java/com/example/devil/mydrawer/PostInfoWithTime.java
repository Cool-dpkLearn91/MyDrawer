package com.example.devil.mydrawer;

import android.view.View;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Devil on 27-06-2016.
 */
public class PostInfoWithTime {

    private long timeDifference ;
    private long timeInMinutes;

    public String infoAboutPost(View view , Date currentTime, Date postTime){

        timeDifference = currentTime.getTime() - postTime.getTime();

        timeInMinutes = TimeUnit.MILLISECONDS.toMinutes(timeDifference);

        if ((timeInMinutes > 0) && ((timeInMinutes<=5))) {
            //0-5 min
            return "just now";
        }else if ((timeInMinutes>5) && (timeInMinutes<=15)){
            //5-15 min
            return "a few mins ago";
        }else if ((timeInMinutes>15) && (timeInMinutes<=30)){
            // 15 mins ago
            return "15 mins ago";
        }else if ((timeInMinutes>30) && (timeInMinutes<=45)){
            // 30 mins ago
            return "30 mins ago";
        }else if ((timeInMinutes>45) && (timeInMinutes<=60)){
            // 45 mins ago
            return "45 mins ago";
        }else if ((timeInMinutes>60) && (timeInMinutes<=90)){
            // 1 hr ago
            return "1 hr ago";
        }else if ((timeInMinutes>90) && (timeInMinutes<=120)){
            // 1.5 hr ago
            return "1.5 hrs ago";
        }else if ((timeInMinutes>120) && (timeInMinutes<=180)){
            // 15 mins ago
            return "2 hrs ago";
        }else if ((timeInMinutes>180) && (timeInMinutes<=240)){
            // 15 mins ago
            return "3 hrs ago";
        }else if ((timeInMinutes>240) && (timeInMinutes<=270)){
            // 15 mins ago
            return "4 hrs ago";
        }else if ((timeInMinutes>270) && (timeInMinutes<=300)){
            // 15 mins ago
            return "4.5 hrs ago";
        }else if ((timeInMinutes>300) && (timeInMinutes<=420)){
            // 15 mins ago
            return "about 6 hrs ago";
        }else if ((timeInMinutes>420) && (timeInMinutes<=480)){
            // 15 mins ago
            return "about 8hrs ago";
        }else if ((timeInMinutes>480) && (timeInMinutes<=720)){
            // 15 mins ago
            return "about 12 hrs ago";
        }else if ((timeInMinutes>720) && (timeInMinutes<=1080)){
            // 15 mins ago
            return "about 18 hrs ago";
        }else if ((timeInMinutes>1080) && (timeInMinutes<=1440)){
            // 15 mins ago
            return "1 day ago";
        }else if ((timeInMinutes>1440) && (timeInMinutes<=2880)){
            // 15 mins ago
            return "2 days ago";
        }else if ((timeInMinutes>1440) && (timeInMinutes<=2880)){
            // 15 mins ago
            return "3 days ago";
        }else if ((timeInMinutes>2880) && (timeInMinutes<=4320)){
            // 15 mins ago
            return "4 days ago";
        }else if ((timeInMinutes>4320) && (timeInMinutes<=5760)){
            // 15 mins ago
            return "5 days ago";
        }else if ((timeInMinutes>5760) && (timeInMinutes<=7200)){
            // 15 mins ago
            return "6 days ago";
        }else if ((timeInMinutes>7200) && (timeInMinutes<=8600)){
            // 15 mins ago
            return " about 1 week ago";
        }else if ((timeInMinutes>8600) && (timeInMinutes<=17200)){
            // 15 mins ago
            return " about 2 weeks ago";
        }else if ((timeInMinutes>17200) && (timeInMinutes<=25800)){
            // 15 mins ago
            return " about 3 weeks ago";
        }else if ((timeInMinutes>25800) && (timeInMinutes<=43000)){
            // 15 mins ago
            return " 1 mnth ago";
        }else if ((timeInMinutes>43200) && (timeInMinutes<=86400)){
            // 15 mins ago
            return "2 mnths ago";
        }else if ((timeInMinutes>86400) && (timeInMinutes<=129600)){
            // 15 mins ago
            return " 3 mnths ago";
        }else

            return " 6 years back";


    }
}
