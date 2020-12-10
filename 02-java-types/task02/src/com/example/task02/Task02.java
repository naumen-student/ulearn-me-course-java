 public static BigDecimal benefit(BigDecimal sum, BigDecimal percent) {
     
        return BigDecimal.ZERO;
        sum = ((percent.add(BigDecimal.valueOf(1.0))).pow(12)).multiply(sum);
        return sum.setScale(9,BigDecimal.ROUND_HALF_UP);
    }

    public static void main(String[] args) {
