package org.example;
import habitats.*;
import animales.*;
import administrarRecursos.*;
import interaccionVisitantes.*;
import MantenimientoSeguridad.*;
import java.util.Date;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al zoo. ¿Eres un trabajador o un visitante?");
        System.out.println("1. Trabajador del zoo");
        System.out.println("2. Visitante del zoo");

        int eleccion = scanner.nextInt();

        switch (eleccion) {
            case 1:
                trabajadorDelZoo();
                break;
            case 2:
                visitanteDelZoo();
                break;
            default:
                System.out.println("Lo siento, esa no es una opción válida.");
                break;
        }

        scanner.close();
    }

    public static void trabajadorDelZoo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Has elegido Trabajador del zoo. ¿Qué área te gustaría gestionar?");
        System.out.println("1. Gestion de habitats");
        System.out.println("2. Cuidado de animales");
        System.out.println("3. Administracion de recursos");
        System.out.println("4. Mantenimiento y Seguridad");

        int eleccion = scanner.nextInt();

        switch (eleccion) {
            case 1:
                gestionDeHabitats();
                break;
            case 2:
                cuidadoDeAnimales();
                break;
            case 3:
                administracionDeRecursos();
                break;
            case 4:
                mantenimientoYSeguridad();
                break;
            default:
                System.out.println("Lo siento, esa no es una opción válida.");
                break;
        }

        scanner.close();
    }

    public static void visitanteDelZoo() {
        Quiosco quiosco = new Quiosco();

        H_Acuatico acuatico = new H_Acuatico(10, 80, true, 100);
        H_Terrestre terrestre = new H_Terrestre(25, 50, false, 20);
        H_Aviario aviario= new H_Aviario(22, 60, true, 30 );

        Cetaceo pez = new Cetaceo("Delfin", "peces", 80, "si");
        Pajaro ave = new Pajaro("Pelicano", "peces", 100, "blanco");
        Mamifero mamifero = new Mamifero("Ciervos", "hierba", 100, "Corto");

        tour tourNinos = new TourNiños(acuatico, pez);
        tour tourAves = new TourPajaros(aviario, ave);
        tour tourPeces = new TourCetaceos(acuatico, pez);
        tour tourMamiferos = new TourMamiferos(terrestre, mamifero);

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué tipo de tour te gustaría hacer? (1: Tour para niños, 2: Tour para aficionados a las aves, 3: Tour para aficionados a los peces, 4: Tour para aficionados a los mamíferos)");
        int eleccionTour = scanner.nextInt();

        switch (eleccionTour) {
            case 1:
                quiosco.proporcionarInformacion(tourNinos);
                break;
            case 2:
                quiosco.proporcionarInformacion(tourAves);
                break;
            case 3:
                quiosco.proporcionarInformacion(tourPeces);
                break;
            case 4:
                quiosco.proporcionarInformacion(tourMamiferos);
                break;
            default:
                System.out.println("Lo siento, esa no es una opción válida.");
                break;
        }
        scanner.close();
    }

    public static void gestionDeHabitats() {
        H_Terrestre terrestre = new H_Terrestre(25, 50, false, 20);
        H_Acuatico acuatico = new H_Acuatico(10, 80, true, 100);
        H_Aviario aviario = new H_Aviario(22, 60, true, 30);

        System.out.println("Temperatura del hábitat acuático: " + acuatico.getTemperatura());
        System.out.println("Capacidad del hábitat acuático: " + acuatico.getVolumen());
        System.out.println("Limpieza del hábitat acuático: " + acuatico.isLimpieza());
        System.out.println("Humedad del hábitat acuático: " + acuatico.getHumedad());

        System.out.println("Temperatura del hábitat terrestre: " + terrestre.getTemperatura());
        System.out.println("Humedad del hábitat terrestre: " + terrestre.getHumedad());
        System.out.println("Vegetación del hábitat terrestre: " + H_Terrestre.getRocas());
        System.out.println("Limpieza del hábitat terrestre: " + terrestre.isLimpieza());

        System.out.println("Limpieza del hábitat aviario: " + aviario.isLimpieza());
        System.out.println("Altura del hábitat aviario: " + aviario.getArboles());
        System.out.println("Humedad del hábitat aviario: " + aviario.getHumedad());
        System.out.println("Temperatura del hábitat aviario: " + aviario.getTemperatura());
    }

    public static void cuidadoDeAnimales() {
        Cetaceo pez = new Cetaceo("Delfin", "peces", 80, "Si");
        Pajaro ave = new Pajaro("Pelicano", "peces", 100, "blanco");
        Mamifero mamifero = new Mamifero("", "hierba", 100, "Corto");

        System.out.println("Nombre del pez: " + pez.getNombre());
        System.out.println("Salud del pez: " + pez.getSalud());
        System.out.println("Alimentación del pez: " + pez.getAlimento());

        System.out.println("Nombre del ave: " + ave.getNombre());
        System.out.println("Salud del ave: " + ave.getSalud());
        System.out.println("Alimentación del ave: " + ave.getAlimento());

        System.out.println("Nombre del mamífero: " + mamifero.getNombre());
        System.out.println("Salud del mamífero: " + mamifero.getSalud());
        System.out.println("Alimentación del mamífero: " + mamifero.getAlimento());
    }

    public static void administracionDeRecursos() {
        Alimento alimento = new Alimento("Manzanas", 100, "Frutas Martinez", "Frutas");
        Medicina medicina = new Medicina("Antibioticos", 50, "Farmaceutica SB", "Para infecciones");
        Equipamiento equipamiento = new Equipamiento("Jaulas", 10, "Proteccion ASD", "Jaulas para ciervos");

        Inventario inventario = new Inventario();

        inventario.añadirAlimento(alimento);
        inventario.añadirMedicina(medicina);
        inventario.añadirEquipamiento(equipamiento);

        int cantidadAlimento = inventario.checkCantidadAlimento("Manzanas");
        System.out.println("Cantidad de Manzanas: " + cantidadAlimento);

        int cantidadMedicina = inventario.checkCantidadMedicina("Antibioticos");
        System.out.println("Cantidad de Antibioticos: " + cantidadMedicina);

        int cantidadEquipamiento = inventario.checkCantidadEquipamiento("Jaulas");
        System.out.println("Cantidad de Jaulas: " + cantidadEquipamiento);

        inventario.sustraerAlimento(alimento);
        inventario.sustraerMedicina(medicina);
        inventario.sustraerEquipamiento(equipamiento);
    }

    public static void mantenimientoYSeguridad() {
        Mantenimiento mantenimiento = new Mantenimiento("Limpieza de jaulas", "Limpieza de jaulas de ciervos", new Date(), "regular", "Baja");

        RepararUrgente reparacionUrgente = new RepararUrgente("Reparación de cerca", "Reparación de cerca de acuario de delfines", new Date(), "deteriorable", "Alta");

        registroTarea sistemaMantenimiento = new registroTarea();
        sistemaMantenimiento.agregarTareaMantenimiento(mantenimiento);
        sistemaMantenimiento.agregarTareaReparacionUrgente(reparacionUrgente);

        camara camara = new camara("Entrada principal", "1080p");
        sensor sensorMovimiento = new sensor("Jaula de ciervos", 1);

        SistemaSeguridad sistemaSeguridad = new SistemaSeguridad();
        sistemaSeguridad.añadirCamara(camara);
        sistemaSeguridad.añadirsensor(sensorMovimiento);

        sistemaMantenimiento = new registroTarea();
        sistemaMantenimiento.agregarTareaMantenimiento(mantenimiento);
        sistemaMantenimiento.agregarTareaReparacionUrgente(reparacionUrgente);

        System.out.println("Tareas de mantenimiento y reparación urgente agregadas correctamente.");
        System.out.println("Cámara y sensor de movimiento agregados correctamente.");
        System.out.println("Ubicación de la cámara: " + camara.getLugar());
        System.out.println("Resolución de la cámara: " + camara.getCalidad());
        System.out.println("Ubicación del sensor de movimiento: " + sensorMovimiento.getLugar());
        System.out.println("Sensibilidad del sensor de movimiento: " + sensorMovimiento.getSensibilidad());





    }
}