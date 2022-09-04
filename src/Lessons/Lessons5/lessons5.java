package Lessons.Lessons5;

public class lessons5 {
    public static void main(String[] args) {

        Mobil mobil = new Mobil();
        MicroVawe microVawe = new MicroVawe();

        Sound[] Sounds = {mobil,microVawe};
        for (Sound sound:Sounds){
            sound.EnableSound();
        }
        EnumClass country = EnumClass.JAPAN;
        Country country1 = Country.USA;
        country1.consoleName();

    }
}
