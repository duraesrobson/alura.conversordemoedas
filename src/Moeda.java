public record Moeda(String base_code, String target_code, String conversion_result) {

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Resultado: ").append(conversion_result);
        return sb.toString();

    }

}
