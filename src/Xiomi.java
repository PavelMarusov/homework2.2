public class Xiomi extends  Phone implements Printable {
private int price;
private int batteryVolume;

    public Xiomi(String color, int price, int batteryVolume) {
        super(color);
        this.price = price;
        this.batteryVolume = batteryVolume;
    }

    public int getPrice() {
        return price;
    }

    public int getBatteryVolume() {
        return batteryVolume;
    }

    @Override
    public void print() {
        System.out.println("Цвет ("+getColor()+") Цена ("+price+") Батарея ("+batteryVolume + ")");
    }
}
