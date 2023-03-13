package figuren;

abstract class Figur {
    protected double reduceToTwoDecimalPlacesDouble(double value) {
        return Math.ceil(value * 100) / 100;
    }
}