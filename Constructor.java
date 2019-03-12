class Constructor{
    int x;
    Constructor(){
        System.out.println("Constructor called");
        x=100;
    }
    public static void main(String[] args) {
        Constructor od=new Constructor();
        System.out.println(od.x);
    }

}