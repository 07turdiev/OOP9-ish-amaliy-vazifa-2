public class MyTime {
    private int soat = 0;
    private int minut = 0;
    private int sikund = 0;

    public MyTime(int soat, int minut, int sikund) {
        setTime(soat, minut, sikund);
    }




    public void setTime(int soat, int minut, int sikund){
        if (soat >= 0 && soat < 24 && sikund >= 0 && minut < 60 && sikund >= 0 && sikund < 60) {
        this.soat = soat;
        this.minut = minut;
        this.sikund = sikund;
        }else {
            System.out.println("Yaroqsiz vaqtni kiritdingiz");
        }
    }

    public void setSoat(int soat) {
        if (soat >= 0 && soat < 24) {
            this.soat = soat;
        } else {
            System.out.println("Yaroqsiz soat!");
        }
    }

    public void setMinut(int minut) {
        if (minut >= 0 && minut < 60) {
            this.minut = minut;
        } else {
            System.out.println("Yaroqsiz daqiqa!");
        }
    }

    public void setSikund(int sikund) {
        if (sikund >= 0 && sikund < 60) {
            this.sikund = sikund;
        } else {
            System.out.println("Yaroqsiz soniya!");
        }
    }


    public int getSoat() {
        return soat;
    }

    public int getMinut() {
        return minut;
    }

    public int getSikund() {
        return sikund;
    }


    public String toString() {
        return String.format("%02d:%02d:%02d", soat, minut, sikund);
    }

    public void nextSikund() {
        sikund++;
        if (sikund == 60) {
            sikund = 0;
            nextMinut();
        }
    }

    public void nextMinut() {
        minut++;
        if (minut == 60) {
            minut = 0;
            nextSoat();
        }
    }

    public void nextSoat() {
        soat++;
        if (soat == 24) {
            soat = 0;
        }
    }

    public void previousSikunt() {
        sikund--;
        if (sikund == -1) {
            sikund = 59;
            previousMinut();
        }
    }

    public void previousMinut() {
        minut--;
        if (minut == -1) {
            minut = 59;
            previousSoat();
        }
    }

    public void previousSoat() {
        soat--;
        if (soat == -1) {
            soat = 23;
        }
    }
}
