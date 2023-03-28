package internetpaketi;


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Users 
{
    private final StringProperty id1 = new SimpleStringProperty(this,"id","");
    private final StringProperty ime1 = new SimpleStringProperty(this, "ime", "");
    private final StringProperty prezime1 = new SimpleStringProperty(this, "prezime", "");
    private final StringProperty adresa1 = new SimpleStringProperty(this,"adresa", ""); 
    private final StringProperty brzina1 = new SimpleStringProperty(this,"brzina", ""); 
    private final StringProperty protok1 = new SimpleStringProperty(this,"protok", ""); 
    private final StringProperty ugovor1 = new SimpleStringProperty(this,"ugovor", ""); 
    
    public Users(){}
    
    public Users(String id,String ime,String prezime,String adresa, String brzina,String protok,String ugovor)
    {
        this.id1.set(id);
        this.ime1.set(ime);
        this.prezime1.set(prezime);
        this.adresa1.set(adresa);
        this.brzina1.set(brzina);
        this.protok1.set(protok);
        this.ugovor1.set(ugovor);
    }   
    public String getId() {
        return id1.get();
    }

    public String getIme() {
        return ime1.get();
    }

    public String getPrezime() {
        return prezime1.get();
    }

    public String getAdresa() {
        return adresa1.get();
    }
    public String getBrzina() {
        return brzina1.get();
    }
    public String getProtok() {
        return protok1.get();
    }
    public String getUgovor() {
        return ugovor1.get();
    }
}