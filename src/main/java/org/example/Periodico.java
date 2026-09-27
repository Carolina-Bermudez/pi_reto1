package org.example;
import java.util.ArrayList;

    public class Periodico {

        private ArrayList<Noticia> noticias;
        private int numNoticias;

        public Periodico() {
            noticias = new ArrayList<>(1000);
            numNoticias = 0;
        }

        public void insertar(Noticia n) {

            if (numNoticias < 1000) {
                noticias.add(n);
                numNoticias++;
            }
        }

        public Noticia primeraNoticia(int d, int m, int a) {

            for (int i = 0; i < numNoticias; i++) {

                if (noticias.get(i).igualFecha(d, m, a)) {
                    return noticias.get(i);
                }
            }

            return null;
        }

        public void masPopulares() {

            if (numNoticias == 0) {
                System.out.println("No hay noticias.");
                return;
            }

            int mayorLecturas = 0;

            // Buscamos el mayor número de lecturas
            for (int i = 0; i < numNoticias; i++) {

                if (noticias.get(i).getLecturas() > mayorLecturas) {
                    mayorLecturas = noticias.get(i).getLecturas();
                }
            }

            // Mostramos todas las noticias que tengan ese número
            // de lecturas
            for (int i = 0; i < numNoticias; i++) {

                if (noticias.get(i).getLecturas() == mayorLecturas) {
                    System.out.println(noticias.get(i));
                }
            }
        }

        public void borrarAnteriores(int d, int m, int a) {

            int fechaLimite = a * 10000 + m * 100 + d;

            for (int i = numNoticias - 1; i >= 0; i--) {

                if (noticias.get(i).getFecha() < fechaLimite) {
                    noticias.remove(i);
                    numNoticias--;
                }
            }
        }

        public void mostrar() {

            for (int i = 0; i < numNoticias; i++) {
                System.out.println(noticias.get(i));
            }
        }
    }

