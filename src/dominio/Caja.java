package dominio;

public class Caja {
    private String dimensions;
    private String weight;
    private String expasionSlot;
    private String numberOfVentilators;
    private String motherboardType;

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getExpasionSlot() {
        return expasionSlot;
    }

    public void setExpasionSlot(String expasionSlot) {
        this.expasionSlot = expasionSlot;
    }

    public String getNumberOfVentilators() {
        return numberOfVentilators;
    }

    public void setNumberOfVentilators(String numberOfVentilators) {
        this.numberOfVentilators = numberOfVentilators;
    }

    public String getMotherboardType() {
        return motherboardType;
    }

    public void setMotherboardType(String motherboardType) {
        this.motherboardType = motherboardType;
    }
}
