public interface ICargoCompartmentLight {
    String version();
    void on();
    void dim(int dimPercentage);
    void off();
}