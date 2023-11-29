import java.util.*;
public class House implements Cloneable, Comparable<House>{
    private int id;
    private double area;
    private java.util.Date whenBuilt;

    public House(int id,double area){
        this.id=id;
        this.area=area;
        whenBuilt=new java.util.Date();
    }
    private int getId(){
        return id;
    }

    public double getArea(){
        return area;
    }

    public java.util.Date getWhenBuilt(){
        return whenBuilt;
    }

    @Override
    public Object clone(){
        House houseClone= new House(id, area);
        houseClone.whenBuilt=new java.util.Date();
        houseClone.getWhenBuilt().setTime(whenBuilt.getTime());
        return houseClone;
    }

    @Override
   public int compareTo(House o){
    if(area > o.area )
    return 1;
    else if (area < o.area)
      return -1;
     else
     return 0;
   }
}
