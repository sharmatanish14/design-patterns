package builderpattern;

// Subsystem class 1
class CPU {
    public void start() {
        System.out.println("CPU started");
    }

    public void shutdown() {
        System.out.println("CPU shutdown");
    }
}

// Subsystem class 2
class Memory {
    public void load() {
        System.out.println("Memory loaded");
    }

    public void clear() {
        System.out.println("Memory cleared");
    }
}

// Subsystem class 3
class HardDrive {
    public void read() {
        System.out.println("HardDrive read");
    }

    public void write() {
        System.out.println("HardDrive write");
    }
}

// Facade class
class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        cpu.start();
        memory.load();
        hardDrive.read();
    }

    public void shutdown() {
        cpu.shutdown();
        memory.clear();
        hardDrive.write();
    }
}

// Client code
public class Client {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
        System.out.println("Computer is running...");
        computer.shutdown();
    }
}
