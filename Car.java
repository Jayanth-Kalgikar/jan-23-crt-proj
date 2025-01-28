
public class Car {
	
	private String model;
	private String brand;
	private float price ;
	private String Variant;
	private String location;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getVariant() {
		return Variant;
	}
	public void setVariant(String variant) {
		Variant = variant;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", brand=" + brand + ", price=" + price + ", Variant=" + Variant + ", location="
				+ location + "]";
	}
	public Car(String model, String brand, float price, String variant, String location) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
		Variant = variant;
		this.location = location;
	}
	

}
