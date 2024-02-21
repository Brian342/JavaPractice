public class customer {
    private int id;
    private String name;
    private int discount;

    @SuppressWarnings("unused")
    public customer(int id, int name){
        int discount;
    }
    public int get_id(){
        return id;
    }
    public String get_name(){
        return name;
    }
    public int get_discount(){
        return discount;
    }
    public void set_Name(){
        @SuppressWarnings("unused")
        String name;
    }
    public void set_id(){
        @SuppressWarnings("unused")
        int id;
    }
    @SuppressWarnings("unused")
    public void set_discount(){
        double discount;
    }
    public String toString(){
        return String.format("Name(%s):Id:%d,Discount%.2f",get_name(),get_id(),get_discount());
    }
}

