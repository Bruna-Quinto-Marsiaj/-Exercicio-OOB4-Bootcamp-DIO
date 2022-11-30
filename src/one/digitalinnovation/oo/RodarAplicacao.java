package one.digitalinnovation.oo;

/**
 * Classe de exemplo para o exercício da Aula 4 de Orientação a Objetos.
 */
class RodarAplicacao {

    public static void main(String[] args) {

        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        for (ClasseMae classe: classes) {// nas classes filhas os métodos foram sobrescritos e neles colocados a annotation override.
             classe.metodo1();           //O for ta com "Chamando" o tipo de dado classe mãe, quando passa pela filha acontece polimorfismo, pq ele identifica o método "igual"
        }                            
            

        System.out.println("");

        for (ClasseMae classe: classes) { //classe filha um não sobrescreveu o método 2, então no lugar dele chama o método 2 da classe mãe
            classe.metodo2();
        }

        System.out.println("");

        ClasseFilha2 classeFilha2 = new ClasseFilha2(); //aqui acontece a sobrescrita pura, chama direto o método sobrescrito e não através da classe mãe (polimorfismo)
        classeFilha2.metodo2();
    }

}
