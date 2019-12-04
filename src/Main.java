public class Main {


    public static void main(String[] args) {
createObject("Nokia").print();
createObject("Iphone").print();
createObject("Samsung").print();
createObject("Xiomi").print();

    }
    public static Phone createObject(String className){
        Phone phone = null;

        switch (className) {
            case "Nokia":
                Nokia nokia = new Nokia("White",500,5.5);
                return nokia;


            case "Iphone":
                Iphone iphone = new Iphone("Gold","Pasha",200);
                return iphone;


            case "Samsung":
                Samsung samsung = new Samsung("Black",60.6,"China");
                return samsung;

            case "Xiomi":
                Xiomi xiomi = new Xiomi("Blue",5000,1000);
                return xiomi;

        }
        return phone;

    }
}
