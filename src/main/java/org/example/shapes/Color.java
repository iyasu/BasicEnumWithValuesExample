package org.example.shapes;

public enum Color {
    WHITE("#FFFFFF"),
    BLACK("#000000");

    private final String code;

    Color(String code){
        this.code = code;
    }

    public static Color valueOfLabel(String code) {
        for (Color color : values()) {
            if (color.code.equals(code)) {
                return color;
            }
        }
        return null;
    }

    public String getCode(){
        return this.code;
    }

}
