package dominio;

public class Refrigeracion {
    private String intelCompatibility;
    private String amdCopativility;
    private String ventilators;
    private String TDP;
    private String color;

    public String getIntelCompatibility() {
        return intelCompatibility;
    }

    public void setIntelCompatibility(String intelCompatibility) {
        this.intelCompatibility = intelCompatibility;
    }

    public String getAmdCompatibility() {
        return amdCopativility;
    }

    public void setAmdCompatibility(String amdCopativility) {
        this.amdCopativility = amdCopativility;
    }

    public String getVentilators() {
        return ventilators;
    }

    public void setVentilators(String ventilators) {
        this.ventilators = ventilators;
    }

    public String getTDP() {
        return TDP;
    }

    public void setTDP(String tdp) {
        this.TDP = tdp;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
