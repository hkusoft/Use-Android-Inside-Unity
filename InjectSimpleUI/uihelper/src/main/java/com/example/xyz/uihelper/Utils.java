package com.example.xyz.uihelper;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by David on 08/08/16.
 */
public class Utils {

    public static ImageView AddImageView(Activity activity, int imgResId, int x, int y){
        ImageView imageView = new ImageView(activity);
        imageView.setImageResource(imgResId);


        FrameLayout frameLayout= new FrameLayout(activity);

        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT));

        //adding view to layout
        frameLayout.addView(imageView);

        activity.addContentView(frameLayout, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));

        frameLayout.setX(x);
        frameLayout.setY(y);

        return imageView;
    }

}
