package chapter1_3;

public class AccountModel {
    private String name;

    public AccountModel(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
