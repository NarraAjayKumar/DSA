public class Acessandmodifiers02 {
    public static void main(String args[]){
        Bank b1 = new Bank();
        b1.setpassword("AjAY@9966");
        System.out.println(b1.password);

    }
}
class Bank {
    public String username;
    private String password;
    void setpassword(String pwd) {
        password = pwd;
    }
}