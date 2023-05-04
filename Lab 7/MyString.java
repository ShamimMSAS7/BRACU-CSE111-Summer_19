public class MyString{
  private char[] array;
  public MyString(){
  }
  public MyString(char[]charSeq){
    array=charSeq;
  }
  public MyString(String str){
    array=str.toCharArray();
  }
  public void show(){
     for(int i=0;i<array.length;i++)
       System.out.print(array[i]);
     System.out.println();
   }
  public int length(){
    if (array==null)
      return 0;
    return array.length;
  }
  public char charAt(int n){
    return array[n];
  }
  public boolean startsWith(MyString prefix){
    int count=0;
    if (prefix.array.length>array.length)
      return false;
    for(int i=0; i<prefix.array.length;i++){
      if(array[i]!=prefix.array[i]){
        count++;
        break;
      }
    }
    return count==0;
  }
  public boolean startsWith(String prefix){
    if (prefix.length()>array.length)
      return false;
    int count=0;
    for(int i=0; i<prefix.length();i++){
      if(array[i]!=prefix.charAt(i)){
        count++;
        break;
      }
    }
    return count==0;
  }
   public boolean endsWith(MyString suffix){
     if (suffix.array.length>array.length)
      return false;
    int count=0;
    for(int i=suffix.array.length-1,j=array.length-1; i>=0;i--,j--){
      if(array[j]!=suffix.array[i]){
        count++;
        break;
      }
    }
    return count==0;
  }
   public boolean endsWith(String suffix){
    int count=0;
    if (suffix.length()>array.length)
      return false;
    for(int i=suffix.length()-1,j=array.length-1; i>=0;i--,j--){
      if(array[j]!=suffix.charAt(i)){
        count++;
        break;
      }
    }
    return count==0;
  }
   public MyString replaceFirst(char oldChar, char newChar){
     MyString a=new MyString();
     a.array=array;
     for(int i=0;i<a.array.length;i++){
       if(a.array[i]==oldChar){
         a.array[i]=newChar;
         break;
       }
     }
     return a;
   }
   public MyString replaceAll(char oldChar, char newChar){
     MyString a=new MyString();
     a.array=array;
     for(int i=0;i<a.array.length;i++){
       if(a.array[i]==oldChar){
         a.array[i]=newChar;
       }
     }
     return a;
   }
   public MyString toLowerCase(){
     MyString a=new MyString();
     a.array=array;
     for(int i=0;i<a.array.length;i++){
       if(a.array[i]>='A'&& a.array[i]<='Z'){
         a.array[i]=(char)(a.array[i]+32);
       }
     }
     return a;
   }
   public MyString toUpperCase(){
     MyString a=new MyString();
     a.array=array;
     for(int i=0;i<a.array.length;i++){
       if(a.array[i]>='a'&& a.array[i]<='z'){
         a.array[i]=(char)(a.array[i]-32);
       }
     }
     return a;
   }
   public boolean equals ( MyString rightStr ){
     if(rightStr==null)
       return false;
     if(rightStr.array.length!=array.length)
       return false;
     for(int i=0; i<array.length;i++){
       if(array[i]!=rightStr.array[i])
         return false;
     }
     return true;
   }
   public boolean equalsIgnoreCase ( MyString rightString ){
    
     if(rightString==null)
       return false;
     if(rightString.array.length!=array.length)
       return false;
     
     MyString a=new MyString();
     String wow="", wow1="";
     for(int i=0;i<array.length;i++){
       wow+=String.valueOf(array[i]);
       wow1+=String.valueOf(rightString.array[i]);
     }
     this.toUpperCase();
     rightString.toUpperCase();
     for(int i=0; i<array.length;i++){
       if(array[i]!=rightString.array[i]){
         array=wow.toCharArray();
         rightString.array=wow1.toCharArray();
         return false;
       }
     }
     array=wow.toCharArray();
         rightString.array=wow1.toCharArray();
     return true;
   }
   
   
   public int compareTo ( MyString str ){
     if(str==null)
       return 0;
     for(int i=0; i<array.length && i<str.array.length;i++){
       if(array[i]!=str.array[i])
         return (int)(array[i]-str.array[i]);
   }
     if(array.length==str.array.length)
       return 0;
     return array.length-str.array.length;
   }
   
   
   public int compareTo ( String str ){
     if(str==null)
       return 0;
     char[] array2=str.toCharArray();
     for(int i=0; i<array.length && i<array2.length;i++){
       if(array[i]!=array2[i])
         return (int)(array[i]-array2[i]);
   }
     if(array.length==array2.length)
       return 0;
     return array.length-array2.length;
   }
   
   
   public int compareToIgnoreCase(MyString str){
      if(str==null)
       return 0;
      String wow="", wow1="";
     for(int i=0;i<array.length;i++){
       wow+=String.valueOf(array[i]);
     }
     for(int i=0;i<str.array.length;i++){
       wow1+=String.valueOf(str.array[i]);
     }
       
     this.toUpperCase();
     str.toUpperCase();
     int result=this.compareTo(str);
     array=wow.toCharArray();
     str.array=wow1.toCharArray();
     return result;
   }
   
   
   
   
   public int compareToIgnoreCase(String str){
      if(str==null)
       return 0;
      String wow="";
     for(int i=0;i<array.length;i++){
       wow+=String.valueOf(array[i]);
     }
     MyString a=new MyString();
     a.array=str.toCharArray();
     this.toUpperCase();
     a.toUpperCase();
     int result=this.compareTo(a);
     array=wow.toCharArray();
     return result;
   }
   public MyString substring (int start){
     MyString a=new MyString();
     if(start<0 || start>array.length)
       return null;
     char[]array2=new char[array.length-start];
     for(int i=start,j=0; i<array.length; i++,j++){
       array2[j]=array[i];
     }
     a.array=array2;
     return a;
   }
   public MyString substring (int start, int end){
     MyString a=new MyString();
     if(start<0 || start>array.length||end<start|| end<0||end>array.length)
       return null;
     char[]array2=new char[end-start+1];
     for(int i=start,j=0; i<end+1; i++,j++){
       array2[j]=array[i];
     }
     a.array=array2;
     return a;
   }
   
   
   public int indexOf (char ch){
     if(ch=='\0')
       return -2;
     for(int i=0;i<array.length;i++){
       if(array[i]==ch)
         return i;
     }
     return -1;
   }
   
   
   public int lastIndexOf(char ch){
     if(ch=='\0')
       return -2;
     for(int i=array.length-1;i>=0;i--){
       if(array[i]==ch)
         return i;
     }
     return -1;
   }
   
   public int indexOf ( char ch, int start ){
     if(ch=='\0')
       return -2;
     if(start<0||start>array.length)
       System.out.println("invalid start");
     for(int i=start;i<array.length;i++){
       if(array[i]==ch)
         return i;
     }
     return -1;
   }
   
   
   public int lastIndexOf ( char ch, int start ){
     if(ch=='\0')
       return -2;
     if(start<0||start>array.length)
       System.out.println("invalid start");
     int value=-1;
     for(int i=start;i<array.length;i++){
       if(array[i]==ch)
         value= i;
     }
     return value;
   }
   
   
   public int indexOf (MyString str){
     if(str==null||str.array.length>array.length)
       return -2;
     int count=-1;
     for(int i=0;i<=array.length-str.array.length;){
       if(array[i]==str.array[0]){
         count =i++;
         for(int j=1; j<str.array.length;j++,i++){
           if(array[i]!=str.array[j]){
             count=-1;
             break;
           }
         }
         if(count!=-1)
           break;
       }
       else
         i++;
     }
     return count;
   }
   public int lastIndexOf (MyString str){
     if(str==null||str.array.length>array.length)
       return -2;
     int count=-1;
     for(int i=0;i<=array.length-str.array.length;){
       if(array[i]==str.array[0]){
         count =i++;
         for(int j=1; j<str.array.length;j++,i++){
           if(array[i]!=str.array[j]){
             count=-1;
             break;
           }
         }
       }
       else
         i++;
     }
     return count;
   }
   public int indexOf (String str){
     MyString hi=new MyString();
     hi.array=str.toCharArray();
     return this.indexOf(hi);
   }
   public int lastIndexOf (String str){
     MyString hi=new MyString();
     hi.array=str.toCharArray();
     return this.lastIndexOf(hi);
   }
   public MyString concat (MyString str){
     if(str==null)
       return null;
     MyString hi=new MyString();
     hi.array=new char[array.length+str.array.length];
     for(int i=0; i<array.length;i++)
       hi.array[i]=array[i];
     for(int i=array.length,j=0;i<array.length+str.array.length;i++,j++)
       hi.array[i]=str.array[j];
     return hi;
   }
   public MyString concat (char[ ] charSeq){
      if(charSeq==null)
       return null;
     MyString hi=new MyString();
     hi.array=new char[array.length+charSeq.length];
     for(int i=0; i<array.length;i++)
       hi.array[i]=array[i];
     for(int i=array.length,j=0;i<array.length+charSeq.length;i++,j++)
       hi.array[i]=charSeq[j];
     return hi;
   }
   public MyString concat (String str){
     if(str==null)
       return null;
     MyString hi=new MyString();
     hi.array=new char[array.length+str.length()];
     for(int i=0; i<array.length;i++)
       hi.array[i]=array[i];
     for(int i=array.length,j=0;i<array.length+str.length();i++,j++)
       hi.array[i]=str.charAt(j);
     return hi;
   }
}