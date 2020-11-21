package kodluyoruzexample.classes;

public class Apple extends Telefon {


    public Apple(String modelAdı, String ımeıNo, String versionNo, int memory, float screenSize, boolean open) {
        super(modelAdı, ımeıNo, versionNo, memory, screenSize, open);
    }

    public String videoCall(){
        return "videolu arama yapılıyor";
    }

    public String shareScreen(){
        return "Ekran paylaşımı yapılıyor";
    }
}
