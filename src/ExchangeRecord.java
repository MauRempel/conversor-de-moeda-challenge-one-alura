public record ExchangeRecord(String base_code, String target_code, double conversion_rate, double conversion_result) {

    public double getConversion_result() {
        return conversion_result;
    }

}
