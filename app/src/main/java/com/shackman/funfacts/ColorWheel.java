package com.shackman.funfacts;

import android.graphics.Color;

import java.util.Random;

public class ColorWheel {
    Random randomGenerator = new Random();
    // Fields or Member Variables - Properties about the object
    private String[] colors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7", // light gray
            "#8b4513", // bronze
            "#ddca8b", // gold
            "#800000", // maroon
            "#000000", // black
            "#ff4500", // tomato red
            "#6b8e23", // olive drab
            "#dc143c", // crimson
            "#ff8c00", // dark orange
            "#cd853f", // peru
            "#6a5acd", // slate blue
            "#808080", // gray
            "#f4a460", // sandy brown
            "#da70d6", // orchid
            "#008080", // teal
            "#d2b48c", // tan
            "#1e90ff", // dodger blue
            "#bc8f8f", // rosy brown
            "#2e8b57", // sea green
            "#b22222", // firebrick
            "#e9967a", // dark salmon
            "#006400", // dark green
            "#c71585", // medium violet red
            "#cd5c5c", //indian red
            "#00bfff", //deep sky blue
            "#2F4F4F" // deep slate gray

    };

    // Methods = Actions the object can take
    int getColor() {
        // Randomly select a color
        int randomNumber = randomGenerator.nextInt(colors.length);
        int color = Color.parseColor(colors[randomNumber]);
        return color;
    }
}
