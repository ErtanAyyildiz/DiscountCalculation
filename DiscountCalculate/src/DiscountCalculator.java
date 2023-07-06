import java.util.ArrayList;
import java.util.List;

public class DiscountCalculator {

	public static void main(String[] args) {
		
		 User user = new User(AccType.GOLD, 3);
	        List<String> items = new ArrayList<>();
	        items.add("Laptop");
	        items.add("Shirt");
	        //items.add("Phone");
	        
	     Bill bill = new Bill(950.0, items);
	     double netPayableAmount = bill.getTotalAmount();

	     if (!bill.getItems().contains("Phone")) {
			if (user.getAccType()==AccType.GOLD) {
				netPayableAmount=netPayableAmount-netPayableAmount*0.3;
			}else if(user.getAccType()==AccType.SILVER) {
				netPayableAmount=netPayableAmount-netPayableAmount*0.2;
			}else if(user.getAccType()==AccType.AFFILIATE) {
				netPayableAmount=netPayableAmount-netPayableAmount*0.1;
			}
			
			if (user.getYearsOfService()>=2) {
				netPayableAmount=netPayableAmount-netPayableAmount*0.05;
			}
		}
	     int amountDiscounts = (int) (bill.getTotalAmount() / 200);
	     netPayableAmount=netPayableAmount-amountDiscounts*5;
	     
	        System.out.println("Net Pay. Amount: " + netPayableAmount);
	}

}
