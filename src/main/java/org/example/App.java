package org.example;

public class App {

        public static void main(String[] args) {

            System.out.println("=== PRUEBA 1: CREAR NOTICIAS ===");

            Noticia n1 = new Noticia(20250920, 1000,
                    "El equipo local gana el partido.");

            Noticia n2 = new Noticia(20250921, 1200,
                    "Nuevo proyecto para la ciudad.");

            Noticia n3 = new Noticia(20250921, 1800,
                    "Se inaugura una nueva biblioteca.");

            Noticia n4 = new Noticia(20250922, 900,
                    "Comienza el nuevo curso escolar.");

            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);
            System.out.println(n4);


            System.out.println("=== PRUEBA 2: INSERTAR ===");

            Periodico periodico = new Periodico();

            periodico.insertar(n1);
            periodico.insertar(n2);
            periodico.insertar(n3);
            periodico.insertar(n4);

            periodico.mostrar();


            System.out.println("=== PRUEBA 3: PRIMERA NOTICIA ===");

            Noticia primera = periodico.primeraNoticia(21, 9, 2025);

            if (primera != null) {
                System.out.println("Primera noticia del 21/9/2025:");
                System.out.println(primera);
            } else {
                System.out.println("No hay noticias de esa fecha.");
            }


            System.out.println("=== PRUEBA 4: MÁS POPULARES ===");

            // Aumentamos las lecturas de algunas noticias

            n1.incLecturas();
            n1.incLecturas();
            n1.incLecturas();

            n2.incLecturas();

            n3.incLecturas();
            n3.incLecturas();
            n3.incLecturas();

            n4.incLecturas();

            periodico.masPopulares();


            System.out.println("=== PRUEBA 5: BORRAR ANTERIORES ===");

            periodico.borrarAnteriores(21, 9, 2025);

            System.out.println("Noticias después de borrar las anteriores:");

            periodico.mostrar();
        }
    }

