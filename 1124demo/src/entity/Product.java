package entity;

public class Product {
	private Integer id;
	private String name;
	private String description;
	private String listimg;
	private Integer price;
	private Integer discountprice;
	
	public Product(Integer id, String name, String description, String listimg, Integer price, Integer discountprice) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.listimg = listimg;
		this.price = price;
		this.discountprice = discountprice;
	}
	public Product(){
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getListimg() {
		return listimg;
	}
	public void setListimg(String listimg) {
		this.listimg = listimg;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getDiscountprice() {
		return discountprice;
	}
	public void setDiscountprice(Integer discountprice) {
		this.discountprice = discountprice;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", listimg=" + listimg
				+ ", price=" + price + ", discountprice=" + discountprice + "]";
	}
	
	
}
