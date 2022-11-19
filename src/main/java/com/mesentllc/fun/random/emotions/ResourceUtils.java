package com.mesentllc.fun.random.emotions;

import com.google.common.io.Resources;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ResourceUtils {
    public static List<String> readEmotions() {
        List<String> emotions = new ArrayList<>();
        URL url = Resources.getResource("Emotions.txt");
        try {
            emotions = Resources.readLines(url, StandardCharsets.UTF_8);
        }
        catch (IOException ignore) {
        }
        return emotions;
    }
}
