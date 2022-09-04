package Lessons.Lessons5;

public abstract class Elektro {
    private Rozetka typeRozetka;
    public Elektro(Rozetka typeRozetka){
        this.typeRozetka=typeRozetka;
    }
    public Rozetka SocketType(){
        return  typeRozetka;
    }

}
