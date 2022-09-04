package Lessons.Lessons5;

public class EnumClass {
    public static final EnumClass RUSSIA = new EnumClass("RUSSIA");
    public static final EnumClass USA = new EnumClass("USA");
    public static final EnumClass JAPAN = new EnumClass("JAPAN");
    private String name;
    public EnumClass(String name) {
        this.name = name;
    }
}
