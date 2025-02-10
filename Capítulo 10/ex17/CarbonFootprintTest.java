package ex17;

import java.util.*;

// Interface que define a pegada de carbono
interface CarbonFootprint {
    double getCarbonFootprint();
}

// Classe Building
class Building implements CarbonFootprint {
    private double electricityUsage; // em kWh
    private double gasUsage; // em m³
    private static final double CO2_PER_KWH = 0.233; // kg CO2 por kWh
    private static final double CO2_PER_M3_GAS = 2.0; // kg CO2 por m³ de gás

    public Building(double electricityUsage, double gasUsage) {
        this.electricityUsage = electricityUsage;
        this.gasUsage = gasUsage;
    }

    @Override
    public double getCarbonFootprint() {
        return (electricityUsage * CO2_PER_KWH) + (gasUsage * CO2_PER_M3_GAS);
    }

    @Override
    public String toString() {
        return "Building com consumo de " + electricityUsage + " kWh e " + gasUsage + " m³ de gás.";
    }
}

// Classe Car
class Car implements CarbonFootprint {
    private double fuelConsumption; // em litros por ano
    private static final double CO2_PER_LITER_FUEL = 2.31; // kg CO2 por litro de gasolina

    public Car(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public double getCarbonFootprint() {
        return fuelConsumption * CO2_PER_LITER_FUEL;
    }

    @Override
    public String toString() {
        return "Carro com consumo de " + fuelConsumption + " litros de combustível por ano.";
    }
}

// Classe Bicycle
class Bicycle implements CarbonFootprint {
    @Override
    public double getCarbonFootprint() {
        return 0; // Bicicletas não emitem CO2 diretamente
    }

    @Override
    public String toString() {
        return "Bicicleta (sem emissões diretas de carbono).";
    }
}

// Classe principal para testar
public class CarbonFootprintTest {
    public static void main(String[] args) {
        List<CarbonFootprint> items = new ArrayList<>();
        
        items.add(new Building(5000, 1000)); // Exemplo de consumo
        items.add(new Car(1200)); // Exemplo de consumo
        items.add(new Bicycle());

        for (CarbonFootprint item : items) {
            System.out.println(item);
            System.out.printf("Pegada de carbono: %.2f kg CO2%n%n", item.getCarbonFootprint());
        }
    }
}