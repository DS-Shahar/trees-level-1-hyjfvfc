import java.util.*;
public class Main {

static Scanner reader=new Scanner(System.in);
public static void main(String[] args) {
   
   BinNode T = new BinNode(8);
        T.setLeft(new BinNode(11));
        T.setRight(new BinNode(10));
        T.getLeft().setLeft(new BinNode(2));
        T.getLeft().setRight(new BinNode(5));
        T.getRight().setRight(new BinNode(5));
        System.out.println(T);
        
      
        System.out.println(ex26(T,3));

}


//////////////////////////////////////////////////////////////////////////
    public static int ex12(BinNode<Integer> T)
{
        if (T == null)
            return 0;


        if (10<=T.getValue()&&T.getValue()<100&&T.hasRight()&&T.hasLeft()){
            return ex12(T.getLeft()) + ex12(T.getRight())+1;}
        else{    
            return ex12(T.getLeft()) + ex12(T.getRight());}
    }
///////////////////////////////////////////////////////////////////////////

    public static int ex14(BinNode<Integer> T)
{
        if (T == null)
            return 0;


        if (!T.hasRight()&&!T.hasLeft()){
            return ex14(T.getLeft()) + ex14(T.getRight())+1;}
        else{    
            return ex14(T.getLeft()) + ex14(T.getRight());}
    }
    
 //////////////////////////////////////////////////////////////////////   
     public static int ex16(BinNode<Integer> T)
{
        if (T == null)
            return 0;


        if (T.hasRight()&&T.hasLeft()){
            return ex16(T.getLeft()) + ex16(T.getRight())+T.getValue();}
        else{    
            return ex16(T.getLeft()) + ex16(T.getRight());}
    }
    
 ////////////////////////////////////////////////////////////////////   
     public static int ex17(BinNode<Integer> T)
{
        if (T == null)
            return 0;
        
        int Count = 0;

      if (T.hasRight()&&T.hasLeft()){

       boolean leftOk =T.getLeft().hasRight()||T.getLeft().hasLeft();
       boolean rightOk=T.getRight().hasRight()||T.getRight().hasLeft();
       
        if (leftOk&&rightOk){
            Count=1;}}
         
           
    return Count+ex17(T.getLeft()) + ex17(T.getRight());}
    
     ///////////////////////////////////////////////////////////////////  
    public static boolean ex18(BinNode<Integer> T1, BinNode<Integer> T2){
        if(T1==null&&T2==null){
            return true;}
        
         if (T1 == null || T2 == null) {
        return false;}
        
        if(T1.getValue()!=T2.getValue()){
            return false;
    }
    return ex18(T1.getLeft(), T2.getLeft()) && ex18(T1.getRight(), T2.getRight());}
    //////////////////////////////////////////////////////
        public static int count(BinNode<Integer> T,int n) {
    if (T == null)
    return 0;
    
    if(T.getValue()==n)
    return 1 + count(T.getLeft(),n) + count(T.getRight(),n);
    
    return  count(T.getLeft(),n) + count(T.getRight(),n);
}

  public static boolean ex20(BinNode<Integer> T,int n) {
      if(n<1)
      return true;
      
      if(count(T,n)!=1)
      return false;
      
     return ex20(T,n-1);}
//////////////////////////////////////////////////////
  public static boolean ex21(BinNode<Integer> T) {
      if(T==null)
         return true;
         
      if(T.hasRight()&&T.hasLeft()){
          int diffrent= Math.abs(ex27(T.getLeft())-ex27(T.getRight()));
          if(!(diffrent<=1))
            return false;
      }
      
     return ex21(T.getLeft())&&ex21(T.getRight());}
    ///////////////////////////////////////////////////
       public static boolean ex22(BinNode<Integer> T) {
          if (T == null)
            return true;


        if (T.hasRight()&&!T.hasLeft()||T.hasLeft()&&!T.hasRight()){
            return false;}
        else{    
            return ex22(T.getLeft())&&ex22(T.getRight());}
    }
    
    
    ////////////////////////////////////////////////////
   public static int ex23Max(BinNode<Integer> T) {
    int max = T.getValue(); 

    if (T.hasLeft()) {
        int leftMax = ex23Max(T.getLeft());
        if (leftMax > max) {
            max = leftMax;
        }
    }

    if (T.hasRight()) {
        int rightMax = ex23Max(T.getRight());
        if (rightMax > max) {
            max = rightMax;
        }
    }

    return max;
}
  
    public static int ex23Min(BinNode<Integer> T) {
    int min = T.getValue(); 

    if (T.hasLeft()) {
        int leftMin = ex23Min(T.getLeft());
        if (leftMin < min) {
            min = leftMin;
        }
    }

    if (T.hasRight()) {
        int rightMin = ex23Min(T.getRight());
        if (rightMin < min) {
            min = rightMin;
        }
    }

    return min;
}

 public static int ex23(BinNode<Integer> T) {
     if(T==null)
      return 0;
      
      int diff=ex23Max(T)- ex23Min(T);
      return diff;}
 //////////////////////////////////////////////
  public static boolean ex26(BinNode<Integer> T,int n) {
      if(T==null)
      return true;
      
      if(!(ex14(T)==Math.pow(2,n)))
        return false;
    else{    
     return true;} }
      
   /////////////////////////////////////////////////
   public static int ex27(BinNode<Integer> T) { 
       if(T==null)
      return -1;

    
       int leftHight=ex27(T.getLeft());
        
    

       int rightHight=ex27(T.getRight());
        
    

    return Math.max(leftHight,rightHight)+1;
}
//////////////////////////////////////////////// 
   
    
