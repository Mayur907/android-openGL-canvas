package com.chillingvan.canvasglsample.text;

import android.graphics.Color;
import android.graphics.PointF;

import java.util.Random;

import static com.chillingvan.canvasglsample.animation.AnimActivity.VY_MULTIPLIER;

/**
 * Created by Chilling on 2018/4/14.
 */
public class DannmakuFactory extends ObjectFactory<Dannmaku> {
    private final Random random = new Random();
    private static final float VX_MULTIPLIER = 0.001f;
    private final int width;
    private final int height;
    private static final String[] WORDS = new String[]{
            "23333", "66666666", "哈哈哈哈哈哈哈哈哈", "Awesome", "凄い"
    };

    public DannmakuFactory(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    protected Dannmaku produce(Dannmaku dannmaku) {
        float vx = -(40 + random.nextInt(40)) * VY_MULTIPLIER;
        float y = random.nextInt(height);
        if (dannmaku == null) {
            dannmaku = new Dannmaku(new PointF(width, y), vx);
        } else {
            dannmaku.reset(new PointF(width, y), vx);
        }
        dannmaku.setText(WORDS[random.nextInt(WORDS.length)]);
        dannmaku.setColor(Color.WHITE);
        return dannmaku;
    }
}