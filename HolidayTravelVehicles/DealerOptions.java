public class DealerOptions {
    private String optionCode;
    private String description;
    private int optionPrice;

    public DealerOptions(String optionCode, String description, int optionPrice) {
        this.optionCode = optionCode;
        this.description = description;
        this.optionPrice = optionPrice;
    }

    public String getOptionCode() {
        return optionCode;
    }

    public void setOptionCode(String optionCode) {
        this.optionCode = optionCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getOptionPrice() {
        return optionPrice;
    }

    public void setOptionPrice(int optionPrice) {
        this.optionPrice = optionPrice;
    }
}