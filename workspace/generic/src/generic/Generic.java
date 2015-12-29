package generic;

class Generic<T>{
	T te;
	public  Generic(T t) {
		te=t;
	}
	
	public T show(T t){
		return t;
	}

	public T getTe() {
		return te;
	}

	public void setTe(T te) {
		this.te = te;
	}

	
}
