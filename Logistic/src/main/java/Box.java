public class Box<K,V> {
    K key;
    V value;

    Box(K key,V value){
        this.key = key;
        this.value = value;
    }

    void show(){
        System.out.println(key+":"+value);
    }

    public static void main(String[] args){

        Box<Integer,String> o1 = new Box<>(1,"harshit");
        Box<Integer,String> o2 = new Box<>(2,"dhruv");


        o1.show();
        o2.show();
    }

}

