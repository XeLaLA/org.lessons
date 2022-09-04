package Lessons.Lessons5;

public class MicroVawe extends Elektro implements Sound{
    public MicroVawe() {
        super(Rozetka.USSR);
    }

   public void Cook(){
        System.out.printf("Греет");
    }

    @Override
    public void EnableSound() {
        System.out.println("Пищит");
    }
}
