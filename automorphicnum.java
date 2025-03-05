class automorphicnum{
    public static void main(String[] args) {
        int n=9;
           automorphicnum(n);
           if(automorphicnum(n)){
            System.out.println("automorphicnum");
           }
           else{
            System.out.println("not automorphic");
           }
    }
public static boolean automorphicnum(int n){
int square=n*n;
if(square%10==n){
    return true;
}
else{
    return false;
}
}
}