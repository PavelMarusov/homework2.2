public class Iphone extends Phone implements Printable{
    private String userName;
    private int size;

    public Iphone(String color, String userName, int size) {
        super(color);
        this.userName = userName;
        this.size = size;
    }

    public String getUserName() {
        return userName;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void print() {
        System.out.println("Цвет ("+ getColor() + ") Владелец (" + userName + ") Размер ("+size+")");
    }
}
