package com.min.main;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle1 implements InitializingBean, DisposableBean {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	private List<Point> points;
	
	
	
	public void drawFromCollectionPoints() {
		
		for(Point point :points){
			System.out.println("point" + point.getX()+""+point.getY());
		}

	}
	
	
	
	
	public void draw() {
		System.out.println("Drawing Triangle ands points are " +"(" + getPointA().getX()+","+getPointA().getY()+ "),"+
				"(" + getPointB().getX()+","+getPointB().getY()+ "),"+
				"(" + getPointC().getX()+","+getPointC().getY()+ ")");

	}



	public Point getPointA() {
		return pointA;
	}



	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}



	public Point getPointB() {
		return pointB;
	}



	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}



	public Point getPointC() {
		return pointC;
	}



	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}



	public List<Point> getPoints() {
		return points;
	}



	public void setPoints(List<Point> points) {
		this.points = points;
	}




	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("clean up from spring feature using interface");
		
	}




	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("before bean creation  from spring feature using interface");
	}

	//to use your own init and destroy , we can do from xml
	public void myInit(){
		System.out.println("myinit method is called");
	}

	public void myDestroy(){
		System.out.println("clean up from mydestroy");
	}
	

}
