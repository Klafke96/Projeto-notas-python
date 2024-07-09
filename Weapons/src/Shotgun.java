public class Shotgun {
     int munição = 8;
     boolean pronta  = false;

    void estado(){
        if (pronta == true){
            System.out.println("A arma está pronta!");
        }else if (pronta == false){
                System.out.println("A arma não está pronta!");
        }
    }

    void preparar(){
        if (pronta == false && munição > 0){
            pronta = true;
            System.out.println("A arma está pronta!");
        }else if (pronta == true){
                System.out.println("A arma já está pronta!");
        }else{
            System.out.println("A arma não possui munição!");
        }
    }

    void atirar(){
        if (pronta == true && munição > 0){
            munição--;
            System.out.println("BANG!");
            pronta = false;
        }else{
            System.out.println("A arma não está pronta!");
        }
    }

    void recarregar(){
        if (munição <8){
            munição++;
            System.out.println("*click*");
        }else {
            System.out.println("A arma já está carregada!");
        }
    }

    void verMunição(){
        System.out.println("Munição: " + munição);
    }


}
