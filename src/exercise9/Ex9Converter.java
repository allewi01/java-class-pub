package exercise9;

/**
 * Class Ex9Converter
 *
 * @author allewi01
 */
public class Ex9Converter {

    public Double c2f(Double valueFrom) {
        return valueFrom * 9 / 5 + 32;
    }

    public Double c2k(Double valueFrom) {
        return valueFrom + 273.15;
    }
    
    public Double c2c(Double valueFrom) {
        return valueFrom;
    }

    public Double f2c(Double valueFrom) {
        return (valueFrom - 32) * 5 / 9;
    }

    public Double f2k(Double valueFrom) {
        return (valueFrom - 32) * 5 / 9 + 273.15;
    }
    
    public Double f2f(Double valueFrom) {
        return valueFrom;
    }

    public Double k2c(Double valueFrom) {
        return valueFrom - 273.15;
    }

    public Double k2f(Double valueFrom) {
        return (valueFrom - 273.15) * 9 / 5 + 32;
    }
    
    public Double k2k(Double valueFrom) {
        return valueFrom;
    }
}
