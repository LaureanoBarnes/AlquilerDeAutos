
package com.mycompany.trabajoprogramacion;

import java.time.LocalDate;
import java.util.Scanner;

public class TrabajoProgramacion {

    public static void main(String[] args) throws InterruptedException {
        Agencia agencia = null;
        Garaje garaje = null;
        Cliente cliente1 = null;
        Cliente cliente2 = null;
        Automovil automovil1 = null;
        Automovil automovil2 = null;
        Reserva reserva = null;
        ReservaDetalle reservaDetalle = null;

        boolean salir = false;
        while (!salir) {
            mostrarMenu();
            int opcion = leerOpcion();

            switch (opcion) {
                case 1:
                    if (agencia == null) {
                        System.out.println("Creando agencia...");
                        Thread.sleep(1500);
                        agencia = new Agencia();
                        agencia.setNombre("Agencia de Alquiler");
                        agencia.setDireccion("Calle Principal 123");
                    } else {
                        System.out.println("Ya se ha creado la agencia.");
                    }
                    break;
                case 2:
                    if (garaje == null) {
                        System.out.println("Creando garaje...");
                        Thread.sleep(1500);
                        garaje = new Garaje();
                        garaje.setCodigoGaraje("G001");
                        garaje.setMaxCoche(10);
                    } else {
                        System.out.println("Ya se ha creado el garaje.");
                    }
                    break;
                case 3:
                    if (cliente1 == null && cliente2 == null) {
                        System.out.println("Creando cliente...");
                        Thread.sleep(1500);
                        cliente1 = new Cliente("C001", "123456789", "Juan Pérez", "Calle 123", "555-1234");
                        cliente2 = new Cliente("C002", "987654321", "María Gómez", "Avenida 456", "555-5678");
                        cliente1.setAvalador(cliente2);
                    } else {
                        System.out.println("Ya se han creado los clientes.");
                    }
                    break;
                case 4:
                    if (garaje != null && automovil1 == null && automovil2 == null) {
                        System.out.println("Creando automóviles...");
                        Thread.sleep(1500);
                        automovil1 = new Automovil("ABC143", "Sedan", "Rojo", "Hilux", garaje);
                        automovil2 = new Automovil("DEF456", "Minivan", "Azul", "Toyota", garaje);
                    } else {
                        System.out.println("Ya se han creado los automóviles o no se ha creado el garaje.");
                    }
                    break;
                case 5:
                    if (agencia != null && cliente1 != null && cliente2 != null && automovil1 != null && automovil2 != null) {
                        if (reserva == null && reservaDetalle == null) {
                            System.out.println("Realizando reserva...");
                            Thread.sleep(1000);
                            reserva = new Reserva("R001", cliente1, automovil1);
                            reserva.setPrecioTotal(100.0);

                            reservaDetalle = new ReservaDetalle();
                            reservaDetalle.setReserva(reserva);
                            reservaDetalle.setAutomovil(automovil1);
                            reservaDetalle.setFechaInicio(LocalDate.now());
                            reservaDetalle.setFechaFin(LocalDate.now().plusDays(7));
                            reservaDetalle.setLitrosGasolina(50.0);
                        } else {
                            System.out.println("Ya se ha realizado la reserva.");
                        }
                    } else {
                        System.out.println("No se ha creado toda la información necesaria para realizar la reserva.");
                    }
                    break;
                case 6:
                    System.out.println("Mostrando información...");
                    Thread.sleep(2000);
                    if (agencia != null && cliente1 != null && cliente2 != null && automovil1 != null && automovil2 != null && reserva != null && reservaDetalle != null) {
                        mostrarInformacion(agencia, cliente1, cliente2, automovil1, automovil2, reserva, reservaDetalle);
                    } else {
                        System.out.println("No se ha creado toda la información necesaria.");
                    }
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elija una opción válida.");
                    break;
            }
        }
    }

    public static void mostrarMenu() {
        System.out.println("========== MENÚ ==========");
        System.out.println("1. Crear agencia");
        System.out.println("2. Crear garaje");
        System.out.println("3. Crear cliente");
        System.out.println("4. Crear automóvil");
        System.out.println("5. Realizar reserva");
        System.out.println("6. Mostrar información");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static int leerOpcion() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void mostrarInformacion(Agencia agencia, Cliente cliente1, Cliente cliente2, Automovil automovil1, Automovil automovil2, Reserva reserva, ReservaDetalle reservaDetalle) {
        System.out.println("========== INFORMACIÓN ==========");
        System.out.println("Agencia: " + agencia.getNombre());
        System.out.println("Dirección de la agencia: " + agencia.getDireccion());

        System.out.println("Cliente 1: " + cliente1.getNombre());
        System.out.println("Avaladorde Cliente 1: " + cliente1.getAvalador().getNombre());

        System.out.println("Automóvil 1: " + automovil1.getMatricula());
        System.out.println("Garaje del automóvil 1: " + automovil1.getGaraje().getCodigoGaraje());

        System.out.println("Reserva: " + reserva.getCodigoReserva());
        System.out.println("Precio total de la reserva: " + reserva.getPrecioTotal());

        System.out.println("Detalles de la reserva:");
        System.out.println("Fecha de inicio: " + reservaDetalle.getFechaInicio());
        System.out.println("Fecha de fin: " + reservaDetalle.getFechaFin());
        System.out.println("Litros de gasolina: " + reservaDetalle.getLitrosGasolina());
    }
}
