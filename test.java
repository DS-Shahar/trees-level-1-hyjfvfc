    public static boolean isPrime(int n){
           int x=n;
          boolean bool=true;
          for(int i=0;i<x;i++){
              n=n-1;
              if(n>1){
                  if(x%n==0)
                   bool=false;
              }
          }
          return bool;
       }
        public static int count1(BinNode<Integer> T) {
            if(T==null)
                return 0;
            
            if((!T.hasRight()&&!T.hasLeft()))
                return 0;
            
            if(!T.hasRight()){ 
               if(isPrime(T.getLeft().getValue()))
                 return count1(T.getLeft())+1;}
                 
               if(!T.hasLeft()){ 
               if(isPrime(T.getRight().getValue()))
                 return count1(T.getRight())+1;}
                 
            if(isPrime(T.getRight().getValue()+T.getLeft().getValue())){
             return count1(T.getLeft())+count1(T.getRight())+1;}
                  
            return count1(T.getLeft())+count1(T.getRight());}
            
            
