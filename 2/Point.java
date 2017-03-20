public class Point{
  private double x;
  private double y;
  private double z;

  public Point(double x,double y,double z){
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public void setX(double x){
    this.x = x;
  }

  public void setY(double y){
    this.y = y;
  }
  public void setZ(double z){
    this.z = z;
  }

  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }
  public double getZ(){
    return z;
  }

  public void moveTo(double x,double y,double z){
    this.x = x;
    this.y = y;
    this.z = z;
  }
  public void moveTo(Point pt){
    this.x = pt.getX();
    this.y = pt.getY();
    this.z = pt.getZ();
  }
  public String toString(){
    return "X = "+x+ " Y = "+y+" Z = "+z;
  }
}