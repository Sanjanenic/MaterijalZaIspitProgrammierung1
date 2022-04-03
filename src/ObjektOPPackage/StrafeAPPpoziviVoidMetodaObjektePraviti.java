package ObjektOPPackage;

public class StrafeAPPpoziviVoidMetodaObjektePraviti {
    public static void main(String[] args) {

        //ime klasse + ime(erste)=new ime klase()-->ovako se pravi objekat klase
        StrafeClassSaVoidMetodamaiBooleanMetodama erste= new StrafeClassSaVoidMetodamaiBooleanMetodama();

//inicijalizovati atribute za objekat "erste"
        erste.name = "Wolfang";
        erste.nachname= "Fischer";
        erste.kennzeichnen = "0987z234";
        erste.anzahl=0;
        erste.strafe=0;

//pozivati metode napravljene u klassi, ime objekta.naziv metode(parametri)

//pozivi void metoda
        erste.strafeBerechnen(60);
        System.out.println(erste.name + " " +erste.nachname + " ,Kennezeichnen:" + erste.kennzeichnen+
                ", hat "+ erste.anzahl+ " Strafe von  "+erste.strafe+ " Euro" );

        erste.strafeBerechnen(36);  //drugi put pozvana ista metoda za isti objekat
        System.out.println(erste.name + " " +erste.nachname + " ,Kennezeichnen:" + erste.kennzeichnen+
            ", hat "+ erste.anzahl+ " Strafe von  "+erste.strafe+ " Euro" );

        erste.verbandsPaket();
        System.out.println(erste.name + " " +erste.nachname + " ,Kennezeichnen:" + erste.kennzeichnen+
                ", hat "+ erste.anzahl+ " Strafe von  "+erste.strafe+ " Euro" );

        erste.alkohol(0.6);
        System.out.println(erste.name + " " +erste.nachname + " ,Kennezeichnen:" + erste.kennzeichnen+
                ", hat "+ erste.anzahl+ " Strafe von  "+erste.strafe+ " Euro" );


        erste.sonstiges(10);
        System.out.println(erste.name + " " +erste.nachname + " ,Kennezeichnen:" + erste.kennzeichnen+
                ", hat "+ erste.anzahl+ " Strafe von  "+erste.strafe+ " Euro" );

        //poziv metode koja vraca nesto(boolean ovaj put)
        //pomocna varijabla u koju sacuvam vrijednost koju vraca metoda
        double strafe = erste.getStrafe();
        System.out.println(erste.name + " " +erste.nachname + " ,Kennezeichnen:" + erste.kennzeichnen+
                ", hat "+ erste.anzahl+ " Strafe von  " +strafe+ " Euro" );
}


}
