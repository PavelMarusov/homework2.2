public class Samsung extends Phone implements Printable{
    private double soundLevel;
    private String madeIN;


    public Samsung(String color, double soundLevel, String madeIN) {
        super(color);
        this.soundLevel = soundLevel;
        this.madeIN = madeIN;
    }

    public double getSoundLevel() {
        return soundLevel;
    }

    public String getMadeIN() {
        return madeIN;
    }

    @Override
    public void print() {
        System.out.println("Цвет ("+getColor() + ") Уровень звука ("+soundLevel+ ") Страна производитель ("+madeIN+")");
    }
}
