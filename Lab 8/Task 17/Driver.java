class Driver{
  String command;
  
  Driver(String c){
    command=c;
  }
  Position action(Position p){
    for(int m=0;m<command.length();m++){
      operation(command.charAt(m),p);
      if(p.check()){
       p.situation="LOST";
        return p;
      }
    }
    return p;
  }
  void operation(char c, Position p){
    if(c=='R'){
      if(p.side=='E')
        p.side='S';
      else if(p.side=='S')
        p.side='W';
      else if(p.side=='W')
        p.side='N';
      else if(p.side=='N')
        p.side='E';
    }
    else if(c=='L'){
      if(p.side=='S')
        p.side='E';
      else if(p.side=='W')
        p.side='S';
      else if(p.side=='N')
        p.side='W';
      else if(p.side=='E')
        p.side='N';
    }
    else if(c=='F'){
      if(p.side=='E'){
        p.x++;
        if(p.x>Dimension.array.length){
          
        }
      }
      else if(p.side=='S'){
        p.y--;
      }
      else if(p.side=='W'){
        p.x--;
      }
      else if(p.side=='N'){
        p.y++;
      }
    }
  }
  
}