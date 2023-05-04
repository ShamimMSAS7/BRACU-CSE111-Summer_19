public class PerfumeCollection{
  public Perfume []array=new Perfume[10];
  public int count=0;
  public PerfumeCollection(Perfume i){
    array[count++]=i;
  }
  public PerfumeCollection(PerfumeCollection j){
    for(int i=0;j.array[i]!=null;i++)
    array[count++]=j.array[i];
  }
  public String printItems(){
    String r="Brand: "+array[0].brand+", Name:  "+array[0].name;
    for(int i=1; i<count; i++)
      r+="\n"+"Brand: "+array[i].brand+", Name:  "+array[i].name;
    return r;
  }
  public void addItem(Perfume t){
    array[count++]=t;
  }
}