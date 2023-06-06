

 class h_w {

		  private String name;
		  private double price;
		  private int quantity;
		  private static int totalSold;

		  public h_w(String name, double price, int quantity) {
		    this.name = name;
		    this.price = price;
		    this.quantity = quantity;
		    totalSold += quantity;
		  }

		  public void sell(int quantity) {
		    this.quantity -= quantity;
		    totalSold -= quantity;
		  }

		  public static int getTotalSold() {
		    return totalSold;
		  }
		}

		class product2{
		  public static void main(String[] args) {
		   h_w product1 = new h_w("Product 1", 100, 10);
		    h_w product2 = new h_w("Product 2", 200, 20);

		    product1.sell(5);
		    product2.sell(10);

		    System.out.println("Total quantity of products sold: " + h_w.getTotalSold());
		  }
		}




