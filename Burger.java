package Builder;

public class Burger {
	private final String size;
	private final String pattyType;
	private final boolean cheese;
	private final boolean lettuce;
	private final boolean tomato;
	private final boolean bacon;
	
	private Burger(BurgerBuilder builder) {
		this.size = builder.size;
		this.pattyType = builder.pattyType;
		this.cheese = builder.cheese;
		this.lettuce = builder.lettuce;
		this.tomato = builder.tomato;
		this.bacon = builder.bacon;
	}
	
	public String getSize() {
		return size;
	}

	public String getPattyType() {
		return pattyType;
	}

	public boolean isCheese() {
		return cheese;
	}

	public boolean isLettuce() {
		return lettuce;
	}

	public boolean isTomato() {
		return tomato;
	}

	public boolean isBacon() {
		return bacon;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Burger ").append(size).append(" al ").append(pattyType);
		boolean haExtra = cheese || tomato || lettuce || bacon;
		if(haExtra) {
			sb.append(" con: ");
			if(cheese) sb.append("[Doppio formaggio]");
			if(tomato) sb.append(" [Pomodoro extra]");
			if(lettuce) sb.append(" [Lattuga extra]");
			if(bacon) sb.append(" [Bacon extra]");
		}else {
			sb.append(" semplice senza condimenti extra!");
		}
		return sb.toString();
	}
	
	public static class BurgerBuilder{
		private String size;
		private String pattyType;
		private boolean cheese;
		private boolean lettuce;
		private boolean tomato;
		private boolean bacon;
		
		public BurgerBuilder(String size, String pattyType) {
			this.size = size;
			this.pattyType = pattyType;
		}
		
		public BurgerBuilder addCheese(boolean cheese) {
			this.cheese = cheese;
			return this;
		}
		
		public BurgerBuilder addLettuce(boolean lettuce) {
			this.lettuce = lettuce;
			return this;
		}
		
		public BurgerBuilder addTomato(boolean tomato) {
			this.tomato = tomato;
			return this;
		}
		
		public BurgerBuilder addBacon(boolean bacon) {
			this.bacon = bacon;
			return this;
		}
		
		public Burger build() {
			if(this.size == null || this.size.trim().isEmpty()) {
				throw new IllegalStateException("Dimensione burger obbligatoria");
			}
			if(this.pattyType == null || this.pattyType.trim().isEmpty()) {
				throw new IllegalStateException("Il tipo di patty è obbligatorio");
			}
			return new Burger(this);
		}
	}
}
