
package Model;

public record Line(String item, double price, int count, Invoice invoice) {

    public double getLineTotal() {
        return price * count;
    }

    @Override
    public String toString() {
        return "Line{" + "num=" + invoice.getNum() + ", item=" + item + ", price=" + price + ", count=" + count + '}';
    }

    public String getAsCSV() {
        return invoice.getNum() + "," + item + "," + price + "," + count;
    }

}
