package com.mycompany.reto7;

import java.util.ArrayList;
import java.util.List;

public class Carretera {

    private List<TramoGenerico> tramos;

    public Carretera() {
        this.tramos = new ArrayList<TramoGenerico>();
    }

    public List getTramos() {
        return tramos;
    }

    public void añadirTramo(TramoGenerico tramo) {
        if (tramo != null) {
            this.tramos.add(tramo);
        }
    }

    public double longitudTotal() {
        double total = 0;
        for (TramoGenerico tramo : tramos) {
            total += tramo.longitud();
        }
        return total;
    }

    public double areaTotal() {
        double total = 0;
        for (TramoGenerico tramo : tramos) {
            total += tramo.area();
        }
        return total;
    }

    public double volumenMaterialTotal() {
        double total = 0;
        for (TramoGenerico tramo : tramos) {
            total += tramo.volumen();
        }
        return total;
    }

    public double volumenAsfaltoTotal() {
        double total = 0;
        for (TramoGenerico tramo : tramos) {
            if (TramoAsfalto.class.isInstance(tramo)) {
                total += tramo.volumen();
            }
        }
        return total;
    }

    public double volumenSinAsfaltoTotal() {
        double total = 0;
        for (TramoGenerico tramo : tramos) {
            if (TramoSinAsfaltar.class.isInstance(tramo)) {
                total += tramo.volumen();
            }
        }
        return total;
    }

    public boolean tramosConectados() {
        boolean conectado = false;
        int count = 0;
        while ((tramos.size() - 1) > count) {
            if (tramos.get(count).getXFinal() == tramos.get(count + 1).getXInicial() && tramos.get(count).getYFinal() == tramos.get(count + 1).getYInicial()) {
                conectado = true;
                count++;
                continue;
            } else {
                conectado = false;
                break;
            }
        }

        return conectado;
    }

}
