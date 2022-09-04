package Lessons.Lessons5;

public class Mobil extends Elektro implements Sound{
    public Mobil() {
        super(Rozetka.EVRO);
    }

    public void MobilLight(){
        System.out.printf("Телефон светит");
    }

    @Override
    public void EnableSound() {
        System.out.println("Звонит");
    }
}
