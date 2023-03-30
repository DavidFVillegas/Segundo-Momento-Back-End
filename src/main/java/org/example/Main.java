package org.example;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Medicamento> medicamentos = new ArrayList<>();

        medicamentos.add(new Analgesico("Paracetamol", 1000, "INVIMA123", "Fab1", LocalDate.of(2024, 12, 31), LocalDate.of(2022, 1, 1)));
        medicamentos.add(new Antiacido("Alka-Seltzer", 1500, "INVIMA456", "Fab2", LocalDate.of(2025, 1, 31), LocalDate.of(2022, 2, 1)));
        medicamentos.add(new Antialergenico("Claritin", 5000, "INVIMA789", "Fab3", LocalDate.of(2025, 2, 28), LocalDate.of(2022, 3, 1)));
        medicamentos.add(new Antiinflamatorio("Ibuprofeno", 800, "INVIMA987", "Fab4", LocalDate.of(2024, 10, 15), LocalDate.of(2022, 5, 1)));
        medicamentos.add(new Antiinfeccioso("Amoxicilina", 3000, "INVIMA654", "Fab5", LocalDate.of(2025, 8, 30), LocalDate.of(2022, 7, 1)));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú de opciones:");
            System.out.println("1. Paracetamol");
            System.out.println("2. Alka-Seltzer");
            System.out.println("3. Claritin");
            System.out.println("4. Ibuprofeno");
            System.out.println("5. Amoxicilina");
            System.out.println("6. Salir");
            System.out.print("Ingrese el número de la opción que desea: ");

            int opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 5) {
                Medicamento medicamento = medicamentos.get(opcion - 1);
                System.out.print("Ingrese la cantidad de medicamentos que desea comprar: ");
                int cantidad = scanner.nextInt();

                double costoTotal = medicamento.calcularCostoConDescuento() * cantidad;
                System.out.println("Nombre: " + medicamento.getNombre());
                System.out.println("Precio unitario sin IVA: " + medicamento.getPrecioUnitarioSinIVA());
                System.out.println("Registro INVIMA: " + medicamento.getRegistroINVIMA());
                System.out.println("Fabricante: " + medicamento.getFabricante());
                System.out.println("Fecha de vencimiento: " + medicamento.getFechaVencimiento());
                System.out.println("Fecha de fabricación: " + medicamento.getFechaFabricacion());
                System.out.println("El costo total de la compra de medicamentos es: " + costoTotal);
                System.out.println("-------------------------");
            } else if (opcion == 6) {
                break;
            } else {
                System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
        }

        scanner.close();
    }
}
