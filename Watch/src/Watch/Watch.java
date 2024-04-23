package Watch;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Watch implements Serializable {
	private int SeraialNumber;
	private static int count=1;
	private int ID;
	private Brand brand;
	private int stock;
	private double price;
	private double discount;
	private LocalDate stocklistingDate;
	private LocalDate stockUpdateDate;
	
	private BrandMaterialType materialType;
	private CategoryType category;
	private ShapeType shape;
	private StyleType style;
	
	
	public Watch(int ID,Brand brand,BrandMaterialType materialType,
			CategoryType category,ShapeType shape,StyleType style,int stock,
			double price,double discount,LocalDate stocklistingDate,LocalDate stockUpdateDate)
	{
		this.SeraialNumber=count++;
		this.ID=ID;
		this.brand=brand;
		this.materialType=materialType;
		this.category=category;
		this.shape=shape;
		this.style=style;
		this.stock=stock;
		this.price=price;
		this.discount=0;
		this.stocklistingDate=stocklistingDate;
		this.stockUpdateDate=stockUpdateDate;
		
	}
	


	public Watch(int iD) {
		super();
		ID = iD;
	}

	

	@Override
	//(here we use == because id is int if id is string then we use equals method)
	//use to sort by id
	public boolean equals(Object obj) {
		if(obj instanceof Watch)
		{
			Watch other=(Watch) obj;
			 return this.ID==other.ID;
		}
		return false;
	}



	@Override
	public String toString() {
		return "Watch [SeraialNumber=" + SeraialNumber + ", ID=" + ID + ", brand=" + brand + ", stock=" + stock
				+ ", price=" + price + ", discount=" + discount + ", stocklistingDate=" + stocklistingDate
				+ ", stockUpdateDate=" + stockUpdateDate + ", materialType=" + materialType + ", category=" + category
				+ ", shape=" + shape + ", style=" + style + "]";
	}



	public static int getCount() {
		return count;
	}



	public static void setCount(int count) {
		Watch.count = count;
	}



	public int getID() {
		return ID;
	}



	public void setID(int iD) {
		ID = iD;
	}



	public Brand getBrand() {
		return brand;
	}



	public void setBrand(Brand brand) {
		this.brand = brand;
	}



	public int getStock() {
		return stock;
	}



	public void setStock(int stock) {
		this.stock = stock;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public double getDiscount() {
		return discount;
	}



	public void setDiscount(double discount) {
		this.discount = discount;
	}



	public LocalDate getStocklistingDate() {
		return stocklistingDate;
	}



	public void setStocklistingDate(LocalDate stocklistingDate) {
		this.stocklistingDate = stocklistingDate;
	}



	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
	}



	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		this.stockUpdateDate = stockUpdateDate;
	}



	public BrandMaterialType getMaterialType() {
		return materialType;
	}



	public void setMaterialType(BrandMaterialType materialType) {
		this.materialType = materialType;
	}



	public CategoryType getCategory() {
		return category;
	}



	public void setCategory(CategoryType category) {
		this.category = category;
	}



	public ShapeType getShape() {
		return shape;
	}



	public void setShape(ShapeType shape) {
		this.shape = shape;
	}



	public StyleType getStyle() {
		return style;
	}



	public void setStyle(StyleType style) {
		this.style = style;
	}


	


	
	

}
