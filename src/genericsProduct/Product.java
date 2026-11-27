package genericsProduct;

import java.util.Objects;

public class Product<K, V extends Number> { // Number => 상한경계(V는 숫자로 고정) 값을 소숫점으로 받게 될 수도 있으니 제네릭으로 고정
	protected K menu;
	protected V price;
	
	public Product() {}
	
	public Product(K menu) {
		this.menu = menu;
	}
	
	public Product(K menu, V price) {
		this.menu = menu;
		this.price = price;
	}
	
	public K getMenu() {
		return menu;
	}

	public void setMenu(K menu) {
		this.menu = menu;
	}

	public V getPrice() {
		return price;
	}

	public void setPrice(V price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return menu + " : " + price+"원";
	}

	@Override
	public int hashCode() {
		return Objects.hash(menu);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product<?,?> other = (Product<?,?>) obj;
		return Objects.equals(menu, other.menu);
	}	
}
