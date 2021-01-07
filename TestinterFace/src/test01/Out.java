package test01;

public class Out {
    private int a;
    public class In{
        private String name;
        public String getName(){
            return name;
        }

        public void print(){
            System.out.println(name);
        }
    }

    public void Name(){
        System.out.println(new In().getName());
    }

}

