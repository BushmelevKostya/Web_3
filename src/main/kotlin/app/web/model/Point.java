package app.web.model;

import app.web.database.PointEntity;
import app.web.service.PointService;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import jakarta.transaction.Transactional;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("pointBean")
@ApplicationScoped
public class Point implements Serializable {
	private int x = 0;
	private List<Integer> listOfX = new ArrayList<>();
	private String y = "";
	private int r = 1;
	
	{
		listOfX.add(-4);
		listOfX.add(-3);
		listOfX.add(-2);
		listOfX.add(-1);
		listOfX.add(0);
		listOfX.add(1);
		listOfX.add(2);
		listOfX.add(3);
		listOfX.add(4);
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public String getY() {
		return y;
	}
	
	public void setY(String y) {
		this.y = y;
	}
	
	public int getR() {
		return r;
	}
	
	public void setR(int r) {
		this.r = r;
	}
	
	public List<Integer> getListOfX() {
		return listOfX;
	}
	
	public void setListOfX(List<Integer> value) {
		this.listOfX = value;
	}
	
	public void printR() {
		System.out.println("R: " + r);
	}
	
	public void submit() {
		PointService ps = new PointService();
		ps.saveEntity(x, Float.parseFloat(y), r);
	}
}