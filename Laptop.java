
public class Laptop {
	
	private String model;
	private String brand;
	private float price ;
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
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	public String getGraphiccard() {
		return graphiccard;
	}
	public void setGraphiccard(String graphiccard) {
		this.graphiccard = graphiccard;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	private String storage;
	private String graphiccard;
	private String processor;
	public Laptop(String model, String brand, float price, String storage, String graphiccard, String processor) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.storage = storage;
		this.graphiccard = graphiccard;
		this.processor = processor;
	}
	@Override
	public String toString() {
		return "Laptop [model=" + model + ", brand=" + brand + ", price=" + price + ", storage=" + storage
				+ ", graphiccard=" + graphiccard + ", processor=" + processor + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
