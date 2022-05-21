package kacper.organizmy.zwierzeta;


import kacper.Polozenie;
import kacper.Swiat;
import kacper.organizmy.Organizm;

import javax.swing.*;

public class Wilk extends Zwierze {

    private static final int sila = 9;
    private static final int inicjatywa = 5;
    private static final ImageIcon ikona = new ImageIcon("images/wilk.png");

    public Wilk(Polozenie polozenie, Swiat swiat) {
        super(sila, ikona, inicjatywa, polozenie, swiat);
    }

    @Override
    public Organizm stworzPotomka(Polozenie polozenie, Swiat swiat) {
        return new Wilk(polozenie, swiat);
    }

    @Override
    public String getNazwa() {
        return "Wilk";
    }
}
