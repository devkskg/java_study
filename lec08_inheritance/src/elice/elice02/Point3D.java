package elice.elice02;

public class Point3D extends Point{


    private int z;
    
    public Point3D(int x, int y, int z) {
    	super(x, y);
    	this.z = z;
    }
    
    @Override
  String location(){
      return super.location() + ",z=" + z;
  }

}
