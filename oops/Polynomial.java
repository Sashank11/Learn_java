public class Polynomial {
    DynamicArray coefficients;
    public Polynomial(){
        coefficients = new DynamicArray();
    }
    public void setCoefficient(int deg, int coeff){
        if(deg >= coefficients.size()){
            for(int i=0; i<coefficients.size(); i++){
                coefficients.set(i, 0);
            }
        }
        coefficients.set(deg, coeff);
    }
    public int getCoefficient(int deg){
        if(deg >= coefficients.size()){
            return -1;
        }
        return coefficients.get(deg);
    }
    public int degree(){
        return coefficients.size();
    }
    public Polynomial add(Polynomial p){
        for(int i = 0; i < this.degree() && i < p.degree(); i++){
            this.setCoefficient(i, this.getCoefficient(i) + p.getCoefficient(i));
        }
        return this;
    }
    public Polynomial multiply(Polynomial p){
        for(int i = 0; i < p.degree(); i++){

        }
        return this;
    }
    public void print(){
        for(int i =0; i < this.degree(); i++){
            if(this.getCoefficient(i) != 0){
                System.out.println(getCoefficient(i) + "x" + i + " ");
            }
        }
    }
    public Polynomial subtract(Polynomial second) {
        return this;
    }
}
