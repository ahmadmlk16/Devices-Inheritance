package AhmadMalik;

public class Electronics {
    String company;
    String model;
    String color;
    double weight;
    int usage;

    public Electronics(String company, String model, String color, double weight, int usage) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.weight = weight;
        this.usage = usage;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public int getUsage() {
        return usage;
    }
    public void disp(){
        System.out.println("");
        System.out.println("Company: "+getCompany());
        System.out.println("Model: "+getModel());
        System.out.println("Color: "+getColor());
        System.out.println("Weight: "+getWeight()+" kg");
        System.out.println("Usage time: "+getUsage()+" hrs");
    }
}
