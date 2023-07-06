import java.util.List;

public class Bill {
	private double totalAmount;
    private List<String> items;
    
	public Bill(double totalAmount, List<String> items) {
		super();
		this.totalAmount = totalAmount;
		this.items = items;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public List<String> getItems() {
		return items;
	}
	public void setItems(List<String> items) {
		this.items = items;
	}
    
}
