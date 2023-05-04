class Position{
  int x,y;
  char side;
  char indArray[][];
  String situation="";
  Position(int x, int y, char side){
    this.x=x;
    this.y=y;
    this.side=side;
    indArray=new char[Dimension.array.length][Dimension.array[0].length];
    indArray[indArray.length-y-1][x]=side;
  }
  boolean check(){
    if(y>=indArray.length){
      if(Dimension.array[0][x]==null){
        Dimension.array[0][x]=String.valueOf(side);
        y--;
        return true;
      } else{
        y--;
        return false;
      }
    }else if(y<0){
      if(Dimension.array[Dimension.array.length-1][x]==null){
        Dimension.array[Dimension.array.length-1][x]=String.valueOf(side);
        y++;
        return true;
      } else{
        y++;
        return false;
      }
    }else if(x>=indArray[0].length){
      if(Dimension.array[indArray.length-y-1][indArray[0].length-1]!=null){
        Dimension.array[indArray.length-y-1][indArray[0].length-1]=String.valueOf(side);
        x--;
        return true;
      } else{
        x--;
        return false;
      }
    }else if(x<0){
      if(Dimension.array[indArray.length-y-1][0]!=null){
        Dimension.array[indArray.length-y-1][0]=String.valueOf(side);
        x++;
        return true;
      } else{
        x++;
        return false;
      }
    } else
      return false;
  }
  void showFinal(){
    System.out.println(x+" "+y+" "+side+" "+situation);
  }
}