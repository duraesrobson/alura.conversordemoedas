

public record Moeda(String base_code, String target_code, String conversion_result, String amount) {

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(conversion_result);
        return sb.toString();

    }

}
