package Lessons.Lessons5;

public enum Country {
    RUSSIA (100), USA (200), JAPAN (300);
    private final int countpeople;

    Country(int countpeople) {
        this.countpeople = countpeople;
    }

    public void consoleName(){
        System.out.println(this.name());
    }
}
