/**
 * 
 */
package test;
class Cal_area{ //創立物件名稱Cal_area
	int radius;
	int length;
	int width;
	int height;
	public Cal_area(int r, int l, int w, int h) {
		radius = r;
		length = l;
		width = w;
		height = h;
	}
	public Cal_area() {
		radius = 10;
		length = 4;
		width = 5;
		height = 6;
	}
	public void show() {
		System.out.println("半徑 = "+radius);
		System.out.printf("球形體積 = " + "%.1f", radius*radius*radius*3.14159*4/3);
		System.out.println();
		System.out.println("長 = "+length + " 寬 = "+width + " 高 = "+height);
		System.out.println("立方體表面積 = " + (length*width*2+width*height*2+height*length*2));
	}
}
public class test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal_area ca = new Cal_area();
		ca.show();
	}

}
