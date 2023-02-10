package chapter4_6;



       class A {
            protected void doSmth() {
                System.out.println("Do smth A");
            }
            protected void doSmthElse() {
                System.out.println("Do smth else A");
            }

        }
        class B extends A {
            protected void doSmth() {
                System.out.println("Do smth B");
            }
            protected void doSmthElse(int i){
                System.out.println("Do smth else B");
            }
        }
        public class Interview {
            public static void main(String[] args) {
                A ref= new B();
                ref.doSmth();
                ref.doSmthElse();

            }
}




