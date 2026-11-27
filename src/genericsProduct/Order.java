package genericsProduct;

import java.util.Objects;

public class Order<K, V extends Number> extends Product<K, V> {
	private int count;
	private int total;
	
	public Order(K menu) {
		super(menu);
	}
	
	public Order(K menu, V price, int count) {
		super(menu, price);
		this.count =  count;
		totalPrice();
	}
	
	public void totalPrice() {
		this.total = super.getPrice().intValue() * this.count;
		// intValue int로 형변환
	}
	
	public Order(Product<K, V> p, int count) {
		super(p.getMenu(), p.getPrice());
		this.count = count;
		totalPrice();
	}
	
	// 출력 print 메서드
	public void printOrder() {
		System.out.println((String)super.getMenu() + count + "개" + this.total);
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
		totalPrice();
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Order [count=" + count + ", total=" + total + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(count, total);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order<?,?> other = (Order<?,?>) obj;
		return Objects.equals(super.menu, other.menu);
	}	
}
