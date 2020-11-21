package kodluyoruzexample.classes;

public class Telefon {

    public String modelAdı;

    public String ımeıNo;

    public String versionNo;

    public int memory;

    public float screenSize;

    public boolean open = true;

    public Telefon(String modelAdı, String ımeıNo, String versionNo, int memory, float screenSize, boolean open) {
        this.modelAdı = modelAdı;
        this.ımeıNo = ımeıNo;
        this.versionNo = versionNo;
        this.memory = memory;
        this.screenSize = screenSize;
        this.open = open;
    }

    public void start(){
        if(open){
            open= true;
            System.out.println("Telefon zaten açık");
        }else {
            System.out.println("Telefon açıldı");
        }
    }

    public void close(){
        if(open){
            open= false;
            System.out.println("Telefon kapatıldı");
        }else {
            System.out.println("Telefon zaten kapalı");
        }
    }

    public String call(){
        return "arama yaplıyor";
    }

    public String sms(){
        return "SMS gönderiliyor";
    }

}
