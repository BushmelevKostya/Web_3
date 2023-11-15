package app.web.database;

import jakarta.persistence.*;

@Table(name = "points")
@Entity
public class PointEntity {
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "x")
	private int x;
	@Column(name = "y")
	private double y;
	@Column(name = "r")
	private int r;
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public int getR() {
		return r;
	}
	
	public void setR(int r) {
		this.r = r;
	}
}
