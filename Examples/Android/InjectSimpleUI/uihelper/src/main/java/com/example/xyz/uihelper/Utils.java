package com.example.xyz.uihelper;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/**
 * Created by David on 08/08/16.
 */
public class Utils {

    public static FrameLayout AddFrameLayout(final Activity activity, final int x, final int y) {
        FrameLayout frameLayout = new FrameLayout(activity);

        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT));

        activity.addContentView(frameLayout, new ViewGroup.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));

        MoveTo(frameLayout,x,y);
        return frameLayout;
    }

    public static ImageView AddImageView(final Activity context, final ViewGroup parent,
                                         final int imgResId) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(imgResId);
        //adding view to layout
        parent.addView(imageView);
        return imageView;
    }

    public static ImageView AddImageView(Activity activity, int imgResId, int x, int y) {
        FrameLayout frameLayout = AddFrameLayout(activity,x,y);
        return AddImageView(activity,frameLayout, imgResId);
    }

    public static void AddExampleImageView(final Activity activity, final int x, final int y) {
        final int resImageId = R.drawable.android;
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                AddImageView(activity, resImageId, x, y);
            }
        });
    }

    public static void MoveTo(View view, int newX, int newY){
        view.setX(newX);
        view.setY(newY);
    }


}
