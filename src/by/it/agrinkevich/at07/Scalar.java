package by.it.agrinkevich.at07;

public class Scalar extends Var {

    double value;

    public Scalar(double value) {
        this.value = value;
    }

    public Scalar(String strScalar) {
        this.value = Double.parseDouble(strScalar);
    }

    public Scalar(Scalar scalar) {
        this.value = scalar.value;
    }

    @Override
    public Var add(Var other){
        if (other instanceof Scalar){
            return new Scalar(this.value+((Scalar)other).value);
        }
        return other.add(this);
    }

    @Override
    public Var sub(Var other){
        if (other instanceof Scalar){
            return new Scalar(this.value-((Scalar)other).value);
        }{
            Var minus=new Scalar(-1);
            return other.sub(this).mul(minus);
        }
    }

    @Override
    public Var mul(Var other){
        if (other instanceof Scalar){
            return new Scalar(this.value*((Scalar)other).value);
        }
        return other.mul(this);
    }

    @Override
    public Var div(Var other){
        if (other instanceof Scalar){
            return new Scalar(this.value/((Scalar)other).value);
        }
        return super.div(other);
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }
}
