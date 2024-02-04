package web.model;

public class Car {
    private String model;
    private int dataRelease;
    private int prise;

    public Car() {
    }

    public Car(String model, int dataRelease, int prise) {
        this.model = model;
        this.dataRelease = dataRelease;
        this.prise = prise;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDataRelease() {
        return dataRelease;
    }

    public void setDataRelease(int dataRelease) {
        this.dataRelease = dataRelease;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", dataRelease=" + dataRelease +
                ", prise=" + prise +
                '}';
    }
}
