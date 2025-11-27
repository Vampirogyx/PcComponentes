import dominio.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU();
            cpu.setType("AMD");
            cpu.setGeneration("7");
            cpu.setCores("i7");
            cpu.setMemCache("2Mb");
            cpu.setSpeed("3.6Ghz");

        System.out.println(cpu.getType());
        System.out.println(cpu.getGeneration());
        System.out.println(cpu.getCores());
        System.out.println(cpu.getMemCache());
        System.out.println(cpu.getSpeed());


        CPU cpu2 = new CPU();
        cpu2.setType("Intel");
        cpu2.setGeneration("6");
        cpu2.setCores("i6");
        cpu2.setMemCache("2.5Mb");
        cpu2.setSpeed("3.6Ghz");

        System.out.println(cpu2.getType());
        System.out.println(cpu2.getGeneration());
        System.out.println(cpu2.getCores());
        System.out.println(cpu2.getMemCache());
        System.out.println(cpu2.getSpeed());


        Memory memory = new Memory();
            memory.setType();
            memory.setSpeed();
            memory.setCapacity();
            memory.setVoltaje();
            memory.setDimensions();


        System.out.println(memory.getType());
        System.out.println(memory.getSpeed());
        System.out.println(memory.getCapacity());
        System.out.println(memory.getVoltaje());
        System.out.println(memory.getDimensions());

        Memory memory2 = new Memory();
            memory2.setType();
            memory2.setSpeed();
            memory2.setCapacity();
            memory2.setVoltaje();
            memory2.setDimensions();


        System.out.println(memory2.getType());
        System.out.println(memory2.getSpeed());
        System.out.println(memory2.getCapacity());
        System.out.println(memory2.getVoltaje());
        System.out.println(memory2.getDimensions());

        Motherboard motherboard = new Motherboard();
        motherboard.setModelName();
        motherboard.setSocket();
        motherboard.setPci();
        motherboard.setChipset();
        motherboard.setAddMemory();


        System.out.println(motherboard.getModelName());
        System.out.println(motherboard.getSocket());
        System.out.println(motherboard.getPci());
        System.out.println(motherboard.getChipset());
        System.out.println(motherboard.getAddMemory());


        Motherboard motherboard2 = new Motherboard();
        motherboard2.setModelName();
        motherboard2.setSocket();
        motherboard2.setPci();
        motherboard2.setChipset();
        motherboard2.setAddMemory();


        System.out.println(motherboard2.getModelName());
        System.out.println(motherboard2.getSocket());
        System.out.println(motherboard2.getPci());
        System.out.println(motherboard2.getChipset());
        System.out.println(motherboard2.getAddMemory());


        TarjetaGrafica tarjetaGrafica = new TarjetaGrafica();
        tarjetaGrafica.setCapacity();
        tarjetaGrafica.setCUDACores();
        tarjetaGrafica.setTransferSpeed();
        tarjetaGrafica.setDimensions();
        tarjetaGrafica.setWeight();


        System.out.println(tarjetaGrafica.getCapacity());
        System.out.println(tarjetaGrafica.getCUDACores());
        System.out.println(tarjetaGrafica.getTransferSpeed());
        System.out.println(tarjetaGrafica.getDimensions());
        System.out.println(tarjetaGrafica.getWeight());

        TarjetaGrafica tarjetaGrafica2 = new TarjetaGrafica();
        tarjetaGrafica2.setCapacity();
        tarjetaGrafica2.setCUDACores();
        tarjetaGrafica2.setTransferSpeed();
        tarjetaGrafica2.setDimensions();
        tarjetaGrafica2.setWeight();


        System.out.println(tarjetaGrafica2.getCapacity());
        System.out.println(tarjetaGrafica2.getCUDACores());
        System.out.println(tarjetaGrafica2.getTransferSpeed());
        System.out.println(tarjetaGrafica2.getDimensions());
        System.out.println(tarjetaGrafica2.getWeight());


        Refrigeracion refrigeracion = new Refrigeracion();
        refrigeracion.setIntelCompatibility();
        refrigeracion.setAmdCompatibility();
        refrigeracion.setVentilators();
        refrigeracion.setTDP();
        refrigeracion.setColor();


        System.out.println(refrigeracion.getIntelCompatibility());
        System.out.println(refrigeracion.getAmdCompatibility());
        System.out.println(refrigeracion.getVentilators());
        System.out.println(refrigeracion.getTDP());
        System.out.println(refrigeracion.getColor());

        Refrigeracion refrigeracion2 = new Refrigeracion();
        refrigeracion2.setIntelCompatibility();
        refrigeracion2.setAmdCompatibility();
        refrigeracion2.setVentilators();
        refrigeracion2.setTDP();
        refrigeracion2.setColor();


        System.out.println(refrigeracion2.getIntelCompatibility());
        System.out.println(refrigeracion2.getAmdCompatibility());
        System.out.println(refrigeracion2.getVentilators());
        System.out.println(refrigeracion2.getTDP());
        System.out.println(refrigeracion2.getColor());


        Caja caja = new Caja();
        caja.setDimensions();
        caja.setWeight();
        caja.setExpasionSlot();
        caja.setNumberOfVentilators();
        caja.setMotherboardType();


        System.out.println(caja.getDimensions());
        System.out.println(caja.getWeight());
        System.out.println(caja.getExpasionSlot());
        System.out.println(caja.getNumberOfVentilators());
        System.out.println(caja.getMotherboardType());


        Caja caja2 = new Caja();
        caja2.setDimensions();
        caja2.setWeight();
        caja2.setExpasionSlot();
        caja2.setNumberOfVentilators();
        caja2.setMotherboardType();


        System.out.println(caja2.getDimensions());
        System.out.println(caja2.getWeight());
        System.out.println(caja2.getExpasionSlot());
        System.out.println(caja2.getNumberOfVentilators());
        System.out.println(caja2.getMotherboardType());
    }

}



