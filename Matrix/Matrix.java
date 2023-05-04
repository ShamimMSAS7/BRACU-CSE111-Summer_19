import java.text.DecimalFormat;
public class Matrix{
  private final int row;
  private final int col;
  private final double array[][];
  public void show(){
    for(int i=0;i<array.length;i++){
      int j=0;
      for(;j<array[i].length-1;j++){
        System.out.print(array[i][j]+"   ");
      }
      System.out.println(array[i][j]);
    }
    System.out.println();
  }
  // create M-by-N matrix of 0's
  public Matrix(int M, int N) {
    row=M;
    col=N;
    array=new double[M][N];
  }
  // create matrix based on 2d array
  public Matrix(double[][] data){
    row=data.length;
    col=data[0].length;
    array=new double[row][col];
    for(int i=0;i<array.length;i++){
      for(int j=0;j<array[i].length;j++){
        array[i][j]=data[i][j];
      }
    }
  }
  // copy constructor
  private Matrix(Matrix A){
    row=A.row;
    col=A.col;
    array=new double[row][col];
    for(int i=0;i<array.length;i++){
      for(int j=0;j<array[i].length;j++){
        array[i][j]=A.array[i][j];
      }
    }
  }
  public static Matrix random(int M, int N){
    Matrix hi=new Matrix(M,N);
    for(int i=0;i<hi.array.length;i++){
      for(int j=0;j<hi.array[i].length;j++){
        hi.array[i][j]=Math.random();
      }
    }
    return hi;
  } 
  // create and return the N-by-N identity matrix
  public static Matrix identity(int N) {
    Matrix hi=new Matrix(N,N);
    for(int i=0;i<hi.array.length;i++){
      for(int j=0;j<hi.array[i].length;j++){
        if(i==j)
          hi.array[i][j]=1;
        else
          hi.array[i][j]=0;
      }
    }
    return hi;
  }
  // swap rows i and j
  private void swap(int i, int j) {
    double temp[]=new double[array[i].length];
    for(int k=0;k<temp.length;k++){
      temp[k]=array[i][k];
    }
    for(int k=0;k<temp.length;k++){
      array[i][k]=array[j][k];
    }
    for(int k=0;k<temp.length;k++){
      array[j][k]=temp[k];
    }
  }
  // create and return the transpose of the invoking matrix
  public Matrix transpose(){
    Matrix hi=new Matrix(this.col,this.row);
    for(int i=0;i<hi.array.length;i++){
      for(int j=0;j<hi.array[i].length;j++){
        hi.array[i][j]=array[j][i];
      }
    }
    return hi;
  }
  // return C = A + B
  public Matrix plus(Matrix B) {
    Matrix hi=new Matrix(B.row,B.col);
    for(int i=0;i<hi.array.length;i++){
      for(int j=0;j<hi.array[i].length;j++){
        hi.array[i][j]=array[i][j]+B.array[i][j];
      }
    }
    return hi;
  }
  // return C = A - B
  public Matrix minus(Matrix B){
    Matrix hi=new Matrix(B.row,B.col);
    for(int i=0;i<hi.array.length;i++){
      for(int j=0;j<hi.array[i].length;j++){
        hi.array[i][j]=array[i][j]-B.array[i][j];
      }
    }
    return hi; 
  } 
  // does A = B exactly?
  public boolean eq(Matrix B) {
    for(int i=0;i<array.length;i++){
      for(int j=0;j<array[i].length;j++){
        if(array[i][j]!=B.array[i][j])
          return false;
      }
    }
    return true;
  }
   // return C = A * B
  public Matrix times(Matrix B){
    Matrix hi=new Matrix(array.length,B.col);
    DecimalFormat msas=new DecimalFormat("#.####");
    for(int i=0;i<hi.array.length;i++){
      for(int j=0;j<hi.array[i].length;j++){
        for(int k=0;k<array[0].length;k++){
          hi.array[i][j]+=array[i][k]*B.array[k][j];
          hi.array[i][j]=Double.valueOf(msas.format(hi.array[i][j]));
        }
      }
    }
    return hi; 
  }
  public Matrix inverse(){
    DecimalFormat msas=new DecimalFormat("#.####");
    Matrix x=new Matrix(array);
    Matrix y=new Matrix(array);
    y=y.identity(array.length);
    int a=0;
    for(int i=0;i<array.length;i++){
      double temp=x.array[i][a];
      for(int j=0;j<array[i].length;j++){
        x.array[i][j]/=temp;
        y.array[i][j]/=temp;
        x.array[i][j]=Double.valueOf(msas.format(x.array[i][j]));
        y.array[i][j]=Double.valueOf(msas.format(y.array[i][j]));
      }
      for(int k=0;k<array.length;k++){
        if(k!=i){
          temp=x.array[k][a];
          for(int j=0;j<array[k].length;j++){
            x.array[k][j]=x.array[k][j]-temp*x.array[i][j];
            y.array[k][j]=y.array[k][j]-temp*y.array[i][j];
            x.array[k][j]=Double.valueOf(msas.format(x.array[k][j]));
            y.array[k][j]=Double.valueOf(msas.format(y.array[k][j]));
          }
        }
      }
      a++;
    }
   return y;
  }
  public Matrix solve(Matrix rhs){
    Matrix hi=this.inverse();
    hi=hi.times(rhs);
    return hi;
  }
}
