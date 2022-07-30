/**
 * 추상클래스 
 * @author TJ
 * 
 * - 반(half)설계 클래스로, 설계가 완료되지 않았으므로 제품의생산(객체생성)이 안됩니다. 
 *   ( new Shape(); 안됨 ) 
 */

public abstract class Shape {
  
	String type; 
	Shape(String type) {
		this.type = type; 
	}
	
	abstract double area(); 
	abstract double length(); // 구현부가 없는 메서드 선언만 존재  
}
