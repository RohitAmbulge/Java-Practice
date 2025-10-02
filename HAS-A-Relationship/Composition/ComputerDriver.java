class CPU {
    double clockSpeed;
    int cores;
    int wordSize;
    int cacheSize;
    int threads;

    CPU(double clockSpeed, int cores, int wordSize, int cacheSize, int threads) {
        this.clockSpeed = clockSpeed;
        this.cores = cores;
        this.wordSize = wordSize;
        this.cacheSize = cacheSize;
        this.threads = threads;
    }

    public void displayCPU() {
        System.out.println("\nCPU Details :");
        System.out.println("Clock Speed : " + clockSpeed);
        System.out.println("Number of Cores : " + cores);
        System.out.println("Word Size : " + wordSize);
        System.out.println("Cache Size : " + cacheSize);
        System.out.println("Threads :" + threads);
    }

}

class RAM {
    int capacity;
    String type;
    int speed;
    int busWidth;
    int channels;

    RAM(int capacity, String type, int speed, int busWIdth, int channels) {
        this.capacity = capacity;
        this.type = type;
        this.speed = speed;
        this.busWidth = busWidth;
        this.channels = channels;
    }

    public void displayRAM() {
        System.out.println("\nRAM Deatils : ");
        System.out.println("Capacity : " + capacity);
        System.out.println("Type : " + type);
        System.out.println("Speed : " + speed);
        System.out.println("Bus Width : " + busWidth);
        System.out.println("Channels : " + channels);
    }
}

class Computer {
    String brand;
    CPU cpu;
    RAM ram;
    int storage;
    String os;
    double price;

    Computer(String brand, int storage, String os, double price, CPU cpu, RAM ram) {
        this.brand = brand;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.price = price;
    }

    public void displayComputer() {
        System.out.println("\nComputer Details :");
        System.out.println("Brand : " + brand);

        System.out.println("Storage : " + storage);
        System.out.println("Operating System : " + os);
        System.out.println("Price : " + price);

        cpu.displayCPU();
        ram.displayRAM();
    }

}

public class ComputerDriver {

    public static void main(String[] args) {
        CPU cpu = new CPU(3.5, 8, 64, 12, 16);
        RAM ram = new RAM(8, "DDR5", 5200, 64, 2);
        Computer computer = new Computer("HP", 512, "Window 11", 80000, cpu, ram);

        computer.displayComputer();

    }
}