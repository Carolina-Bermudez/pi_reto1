package org.example;

public class Noticia {
    private int fecha;
    private int hora;
    private String texto;
    private int lecturas;

    public Noticia(int fecha, int hora, String texto) {
        this.fecha = fecha;
        this.hora = hora;
        this.texto = texto;
        this.lecturas = 0;
    }

    public int getFecha() {
        return fecha;
    }

    public int getLecturas() {
        return lecturas;
    }

    public void incLecturas() {
        lecturas++;
    }

    public boolean igualFecha(int d, int m, int a) {

        int dia = fecha % 100;
        int mes = (fecha / 100) % 100;
        int año = fecha / 10000;

        return dia == d && mes == m && año == a;
    }

    @Override
    public String toString() {

        String s = "";

        s += fecha % 100 + "/" + (fecha / 100) % 100 + "/" + (fecha / 10000) + " - ";
        s += (hora / 100) + ":" + (hora % 100) + "\n";
        s += texto + "\n";
        s += "Leída " + lecturas + " veces\n";

        return s;
    }
}
