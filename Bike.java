
public class Bike {
	private String model;
	private String brand;
	private float price ;
	private String Variant;
	private String mileage;
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
	public String getMileage() {
		return mileage;
	}
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	@Override
	public String toString() {
		return "Bike [model=" + model + ", brand=" + brand + ", price=" + price + ", Variant=" + Variant + ", mileage="
				+ mileage + ", fueltype=" + fueltype + "]";
	}
	private String fueltype;
	public Bike(String model, String brand, float price, String variant, String mileage, String fueltype) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
		Variant = variant;
		this.mileage = mileage;
		this.fueltype = fueltype;
	}

}
