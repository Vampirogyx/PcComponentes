package dominio;

public class Motherboard {
    private String modelName;
    private String socket;
    private String pci;
    private String chipset;
    private String addMemory;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getAddMemory() {
        return addMemory;
    }

    public void setAddMemory(String addMemory) {
        this.addMemory = addMemory;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getPci() {
        return pci;
    }

    public void setPci(String pci) {
        this.pci = pci;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String model) {
        this.chipset = model;
    }
}
