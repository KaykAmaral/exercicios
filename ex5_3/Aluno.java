package exercicios.ex5_3;
public class Aluno {

    String name;
    float x1, x2, x3, med;
    boolean pass;


    // CONSTRUCTOR
    public Aluno(String name, float x, float y, float z) {
        setName(name);
        setX1(x);
        setX2(y);
        setX3(z);
        setMed(x, y, z);
    }


    // SETTERS
    private void setName(String n) { this.name = n; }
    private void setX1(float a) { this.x1 = a; }
    private void setX2(float b) { this.x2 = b; }
    private void setX3(float c) { this.x3 = c; }

    // GETTERS
    private String getName() { return this.name; }
    private float getX1() { return this.x1; }
    private float getX2() { return this.x2; }
    private float getX3() { return this.x3; }
    private float getMed() { return this.med; }
    private boolean getPass() { return this.pass; }


    // CALCULANDO A MEDIA E DEFININDO SE O ALUNO PASSOU
    public void setMed(float a1, float a2, float a3) {
        this.med = (a1 + a2 + a3) / 3 ;
        if (this.med > 60) {
            this.pass = true;
        } else {
            this.pass = false;
        }
    }



    // TO STRING
    @Override
    public String toString(){
        System.out.printf("NOME: %s \n1°Sem = %.2f \n2°Sem: %.2f \n3°Sem: %.2f \nMédia: %.2f \nAprovado? %b",
                getName(),
                getX1(),
                getX2(),
                getX3(),
                getMed(),
                getPass()
        );
        return null;
    }

}
