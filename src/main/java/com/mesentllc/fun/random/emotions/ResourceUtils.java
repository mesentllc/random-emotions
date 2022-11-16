package com.mesentllc.fun.random.emotions;

import com.google.common.io.Resources;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class ResourceUtils {
    public static List<String> readEmotions() {
        List<String> emotions = new ArrayList<>();
        URL url = Resources.getResource("Emotions.txt");
        try {
            emotions = Resources.readLines(url, Charset.defaultCharset());
        }
        catch (IOException ignore) {
        }
        return emotions;
    }
}
