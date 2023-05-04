public class BoroInt{
  public String val;
  public BoroInt(){
    val="0";
  }
  public BoroInt(String s){
    if(validValue(s))
      val=s;
    else
      System.out.println("BoroIntErModdheNumberCharaArKisuDeyaJaiNaException");
  }
  public BoroInt(int i){
    val=String.valueOf(i);
  }
  public BoroInt(BoroInt b){
    val=b.val;
  }
  public String trim(String val){
    String s="";
    for(int i=0; i<val.length();i++){
      if(val.charAt(i)!=' ')
        s+=val.charAt(i);
    }
    return s;
  }
  public boolean validValue(String val){
    int count=0;
    for(int i=0; i<val.length(); i++){
      if(val.charAt(i)<'0'||val.charAt(i)>'9'){
        count++;
        break;
      }
    }
    if(count==0)
      return true;
    else
      return false;
  }
  public BoroInt add(BoroInt val){
    BoroInt k=new BoroInt();
    k.val="";
    int extra=0;
    
    if(this.val.length()>val.val.length()){
      for(int i=val.val.length()-1, j=this.val.length()-1; j>=0; i--,j--){
        int n;
        if(i>=0)
          n=this.val.codePointAt(j)-(int)('0')+val.val.codePointAt(i)-(int)('0')+extra;
        else
          n=this.val.codePointAt(j)-(int)('0')+extra;
        if(n>=10){
          extra=1;
          n=n%10;
        }
        else
          extra=0;
        k.val=String.valueOf(n)+k.val;
      }
    }
    else{
      for(int j=val.val.length()-1, i=this.val.length()-1; j>=0; i--,j--){
        int n;
        if(i>=0)
          n=val.val.codePointAt(j)-(int)('0')+this.val.codePointAt(i)-(int)('0')+extra;
        else
          n=val.val.codePointAt(j)-(int)('0')+extra;
        if(n>=10){
          extra=1;
          n=n%10;
        }
        else
          extra=0;
        k.val=String.valueOf(n)+k.val;
      }
    }
    
    if(extra!=0)
      k.val=String.valueOf(extra)+k.val;
    return k;
  }
  public BoroInt subtract(BoroInt val){
    BoroInt k=new BoroInt();
    k.val="";
    String cap=this.val,sm=val.val;
    if(this.val.length()>val.val.length()){
      cap=this.val;
      sm=val.val;
    }else if(this.val.length()<val.val.length()){
      cap=val.val;
      sm=this.val;
    }else{
      for(int i=0; i<val.val.length();i++){
        if(val.val.charAt(i)!=this.val.charAt(i)){
          if(val.val.charAt(i)>this.val.charAt(i)){
            cap=val.val;
            sm=this.val;
          }else{
            cap=this.val;
            sm=val.val;
          }
          break;
        }
      }  
    }
    int extra=0;
    for(int i=cap.length()-1, j=sm.length()-1;i>=0; i--,j--){
      int n;
      if(j>=0){
        if(cap.codePointAt(i)<sm.codePointAt(j)+extra){
          n=10+cap.codePointAt(i)-sm.codePointAt(j)-extra;
          extra=1;
        }else{
          n=cap.codePointAt(i)-sm.codePointAt(j)-extra;
          extra=0;
        }
      }else{
        if(cap.codePointAt(i)-(int)('0')<extra){
          n=10+cap.codePointAt(i)-(int)('0')-extra;
          extra=1;
        }else{
          n=cap.codePointAt(i)-(int)('0')-extra;
          extra=0;
        }
      }
      k.val=String.valueOf(n)+k.val;
    }
    int i;
    for(i=0; i<k.val.length();i++){
      if(k.val.charAt(i)!='0')
        break;
    }
    if(i==k.val.length())
      k.val=k.val.substring(i-1);
    else
      k.val=k.val.substring(i);
    if(!cap.equals(this.val))
      k.val="-"+k.val;
    return k;
  }
  public BoroInt multiply(BoroInt val){
    BoroInt m=new BoroInt();
    m.val="0";
    int []array=new int[val.val.length()];
    for(int i=0; i<array.length; i++)
      array[array.length-i-1]=val.val.codePointAt(i)-(int)('0');
    for(int i=0; i<array.length;i++){
      for(int j=1;j<=array[i]*Math.pow(10,i);j++){
        m=m.add(this);
      }
    }
    return m;
  }
  public BoroInt divide(BoroInt val){
    BoroInt m=new BoroInt();
    m.val=this.val;
    String result="";
    for(;;){
      m=m.subtract(val);
      char[]k=m.val.toCharArray();
      if(k[0]=='-')
        break;
      else
        result+="1";
    }
    m.val=String.valueOf(result.length());
    return m;
  }
}