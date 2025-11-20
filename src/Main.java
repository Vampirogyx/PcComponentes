import dominio.CPU;

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
    }
}



