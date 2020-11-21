package kodluyoruzexample.classes;

public class Samsung  extends Telefon{


    public Samsung(String modelAdı, String ımeıNo, String versionNo, int memory, float screenSize, boolean open) {
        super(modelAdı, ımeıNo, versionNo, memory, screenSize, open);
    }

    public String shareFiles(){
        return "Dosya paylaşımı yapılıyor";
    }

    public String listenMP3(){
        return "MP3 dinleniyor";
    }
}
