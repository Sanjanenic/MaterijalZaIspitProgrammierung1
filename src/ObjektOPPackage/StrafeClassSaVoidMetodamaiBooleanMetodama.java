package ObjektOPPackage;

public class StrafeClassSaVoidMetodamaiBooleanMetodama {


    //atributi klase
    String name;
    String nachname;
    String kennzeichnen;
    int strafnummer;
    double strafe=0;
    int anzahl=0;

//metoda koja racuna kaznu, i kaznene bodove  za prekoracenu brzinu
    public void strafeBerechnen(int geschwindigkeitsUeberschreitung){

        if(geschwindigkeitsUeberschreitung<=20){
            strafe=strafe+30;
            anzahl=anzahl+1;
        }
        else if(geschwindigkeitsUeberschreitung>20 && geschwindigkeitsUeberschreitung<=30){
            strafe+=50;
            anzahl+=1;
        }
        else if(geschwindigkeitsUeberschreitung>30 && geschwindigkeitsUeberschreitung<=50){
            strafe+=100;
            anzahl+=1;
        }
        else if (geschwindigkeitsUeberschreitung>50 && geschwindigkeitsUeberschreitung<=100){
            strafe+=500;
            anzahl+=1;
        }
        else{
            strafe+=1500;
            anzahl+=1;
        }

    }
//metoda koja dodaje kaznu i bodove za zaboravljeni paket prve pomoci
    public void verbandsPaket(){
        strafe=strafe+25;
        anzahl=anzahl+1;

    }
//metoda koja dodaje kaznu i bodove za alkohol
    public void alkohol(double wert){

        if(wert>=0.5 && wert<1.0){
            strafe+=100;
        }
        else if(wert>=1.0 && wert<2.0){
            strafe+=400;
        }
        else if (wert>=2.0 && wert<3.0){
            strafe+=1000;
        }
        else {
            strafe+=5000;
        }
        anzahl+=2;
    }

    //metoda koja dodaje jos bodova i kazne za dodatne prekrsaje
    public void sonstiges(double wert){
        strafe=strafe+wert;
        anzahl+=1;
    }
//metoda koja smanjuje kaznu za odredjeni postatak na osnovu broja prekrsaja
    public double getStrafe(){
        double strafeReduziert=0;  //pomocna varijabla

        if(anzahl==1){
            strafeReduziert=strafe - (strafe*(30.0/100));  //uslov za umanjenje od 30%
        }
        else if(anzahl==2){
            strafeReduziert=strafe - (strafe*(20.0/100));  //za 20%: moram pisati 20.0 kao double da bi funkcionisalo
        }
        else if(anzahl==3){

            strafeReduziert=strafe - (strafe*(10.0/100));  //za 10%
        }
        else if(anzahl>=4){
            strafeReduziert=strafe; //kazna nije umanjena ako je preko 4 prekrsaja
        }

        return strafeReduziert;
    }

}
