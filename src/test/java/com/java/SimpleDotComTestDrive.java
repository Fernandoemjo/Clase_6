package test.java.com.java;

import main.java.com.java101.SimpleDotCom;

public class SimpleDotComTestDrive {

    public static void main(String[] args) {

        SimpleDotCom simpleDotCom = new SimpleDotCom();

        String result = simpleDotCom.checkYourSelf("hola");

        if("miss".equals(result)){
            System.out.println("Funciona");
        }else{
            System.out.println("No esta funcionando");
        }
    }
}
