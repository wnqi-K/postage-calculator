package au.edu.unimelb.comp30022.controllertesting;

import java.util.HashMap;
import java.util.Map;

public class UI {

    private static Map<String, Object> widgets = new HashMap<>();

    public static Object getElementById(String id) {
        return widgets.get(id);
    }

    public static void addWidget(String id, Object widget) {
        widgets.put(id, widget);
    }
}