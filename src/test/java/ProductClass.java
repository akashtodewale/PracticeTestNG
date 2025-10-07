

public class ProductClass  implements  Comparable<ProductClass>{
	
	public int price;
    public String productName;

    public ProductClass(String name, int price) {
        this.productName = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    
    public  String  toString(){
        return  "name : " + productName + ", price:" + price;
    }

    public int compareTo(ProductClass o) {
        return this.price-o.price;
    }
   
}