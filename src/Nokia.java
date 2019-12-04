public class Nokia extends Phone implements Printable {
    private int sizeDisplay;
    private double camera;
    public Nokia(String color, int sizeDisplay,double camera) {
        super(color);
        this.sizeDisplay = sizeDisplay;
        this.camera = camera;

    }

    public int getSizeDisplay() {
        return sizeDisplay;
    }

    public double getCamera() {
        return camera;
    }

    @Override
    public void print() {
        System.out.println( "Цвет ("+ getColor() + ") "+
                " Дисплэй ("+ sizeDisplay +")" + " Размер камеры ("+camera+ ")");
    }
}
