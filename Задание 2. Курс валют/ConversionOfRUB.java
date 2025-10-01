public class ConversionOfRUB extends Conversion{
    protected ConversionOfRUB(double convertMoney) {
        super(convertMoney, "Рублей");
        setUSD(82.61);  // Доллар США
        setEUR(96.86);  // Евро
        setCNY(13.67);  // Китайский юань
        setKZT(0.2);    // Казахстанских тенге
        setTRY(2.85);   // Турецких лир
    }

    @Override
    public void convert() {
        System.out.println("Итог конвертации:");
        convertToUSD();
        convertToEUR();
        convertToCNY();
        convertToKZT();
        convertToTRY();
    }
}

